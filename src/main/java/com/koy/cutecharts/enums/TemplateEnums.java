package com.koy.cutecharts.enums;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public enum TemplateEnums {

    BASIC("basic.ftlh");

    private String name;

    TemplateEnums(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
