package com.koy.cutecharts.render;

import com.alibaba.fastjson.JSONObject;
import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.enums.TemplateInstance;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class RenderExecutor {

    private static final String DEFAULT_PATH = "render.html";
    private static final String DEFAULT_SUFFIX = "HTML";
    private static final String CHART_INSTANCE = "chart";
    private static final String JSON_DATA = "data";

    public static void render(Chart chart) {
        parser(chart, new File(DEFAULT_PATH));

    }

    public static void render(Chart chart, File path) {
        String src = path.getPath();
        int index = src.lastIndexOf('.');
        if (index == -1) {
            render(chart, new File(src + '/' + DEFAULT_PATH));
            return;
        }
        String suffix = src.substring(index + 1);
        if (!suffix.toUpperCase().equals(DEFAULT_SUFFIX)) {
            render(chart);
            return;
        }
        parser(chart, path);
    }

    private static void parser(Chart chart, File targetFile) {
        Template template = TemplateInstance.BASIC.getTemplate();

        String data = JSONObject.toJSONString(chart);

        HashMap<String, Object> root = new HashMap<>(2);
        root.put(CHART_INSTANCE, chart);
        root.put(JSON_DATA, data);

        try (FileWriter out = new FileWriter(targetFile)) {
            template.process(root, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
