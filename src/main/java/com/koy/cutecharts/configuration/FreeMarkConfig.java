package com.koy.cutecharts.configuration;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class FreeMarkConfig {

    private static final Configuration cfg = new Configuration();

    private static final String BASE_TEMPLATE_DIR = FreeMarkConfig.class.getResource("/").getPath() + "/templates";

    static {
        try {
            cfg.setDirectoryForTemplateLoading(new File(BASE_TEMPLATE_DIR));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        } catch (IOException ignore) {
        }
    }

    private FreeMarkConfig() {
    }

    public static Configuration getInstance() {
        return cfg;
    }
}
