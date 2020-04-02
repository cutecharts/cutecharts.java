package com.koy.cutecharts.configuration;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class FreeMarkConfig {

    private static final Configuration cfg = new Configuration();

    private static final String BASE_TEMPLATE_DIR = "/templates";

    static {
        try {
            cfg.setClassForTemplateLoading(FreeMarkConfig.class, BASE_TEMPLATE_DIR);
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setDefaultEncoding("UTF-8");
        } catch (Exception ignore) {
        }
    }

    private FreeMarkConfig() {
    }

    public static Configuration getInstance() {
        return cfg;
    }
}
