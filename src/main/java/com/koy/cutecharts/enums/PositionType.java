package com.koy.cutecharts.enums;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public enum PositionType {
    UP_LEFT(1), UP_RIGHT(2), BOTTOM_LEFT(3), BOTTOM_RIGHT(4);

    private int config;

    PositionType(int config) {
        this.config = config;
    }

    public int getConfig() {
        return config;
    }
}
