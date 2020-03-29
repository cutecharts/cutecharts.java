package com.koy.cutecharts.enums;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public enum ChartType {

    LINE("Line"), BAR("Bar"), STACKED_BAR("StackedBar"), RADAR("Radar"), SCATTER("XY"), PIE("Pie");

    private String symbol;

    ChartType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
