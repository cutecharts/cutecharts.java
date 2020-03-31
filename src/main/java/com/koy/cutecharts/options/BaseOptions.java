package com.koy.cutecharts.options;

import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.enums.PositionType;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class BaseOptions implements Options {

    transient private ChartType chartType;

    BaseOptions(ChartType chartType) {
        this.chartType = chartType;
    }

    /**
     * xTickCount: customize tick numbers you want to see on the x axis (default 3)
     * yTickCount: customize tick numbers you want to see on the y axis (default 3)
     * showLabels: display labels near every line (default false)
     * showLegend: display legend near chart (default true)
     * legendPosition: specify where you want to place the legend. (default upLeft)
     * dataColors: array of colors for different datasets
     * unxkcdify: disable xkcd effect (default false)
     * strokeColor: stroke colors (default black)
     * backgroundColor: color for BG (default white)
     * fontFamily: customize font family used in the
     */
    private int xTickCount = 3;
    private int yTickCount = 3;
    private boolean showLabels = false;
    private boolean showLegend = true;
    private PositionType legendPosition = PositionType.UP_LEFT;
    private String[] dataColors;
    private boolean unxkcdify = false;
    private String strokeColor = "black";
    private String backgroundColor = "white";
    private String fontFamily;

    @Override
    public String toString() {
        return "BaseOptions{" +
                "chartType=" + chartType +
                ", xTickCount=" + xTickCount +
                ", yTickCount=" + yTickCount +
                ", showLabels=" + showLabels +
                ", showLegend=" + showLegend +
                ", legendPosition=" + legendPosition +
                ", dataColors=" + dataColors +
                ", unxkcdify=" + unxkcdify +
                ", strokeColor='" + strokeColor + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", fontFamily='" + fontFamily + '\'' +
                '}';
    }

    public int getxTickCount() {
        return xTickCount;
    }

    public void setxTickCount(int xTickCount) {
        this.xTickCount = xTickCount;
    }

    public int getyTickCount() {
        return yTickCount;
    }

    public void setyTickCount(int yTickCount) {
        this.yTickCount = yTickCount;
    }

    public boolean isShowLabels() {
        return showLabels;
    }

    public void setShowLabels(boolean showLabels) {
        this.showLabels = showLabels;
    }

    /*return config*/
    public int getLegendPosition() {
        return legendPosition.getConfig();
    }

    public void setLegendPosition(PositionType legendPosition) {
        this.legendPosition = legendPosition;
    }

    public String[] getDataColors() {
        return dataColors;
    }

    public void setDataColors(String[] dataColors) {
        this.dataColors = dataColors;
    }

    public boolean isUnxkcdify() {
        return unxkcdify;
    }

    public void setUnxkcdify(boolean unxkcdify) {
        this.unxkcdify = unxkcdify;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public ChartType getChartType() {
        return chartType;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public boolean isShowLegend() {
        return showLegend;
    }

    public void setShowLegend(boolean showLegend) {
        this.showLegend = showLegend;
    }
}
