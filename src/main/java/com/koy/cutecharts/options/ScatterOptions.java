package com.koy.cutecharts.options;

import com.koy.cutecharts.enums.ChartType;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class ScatterOptions extends BaseOptions {
    /**
     * showLabels: display labels near every line (default false)\
     * dotSize: you can change size of the dots if you want (default 1)
     * showLine: connect the points with lines (default: false)
     */
    private boolean showLegend = false;
    private boolean showLine = false;
    private int dotSize = 1;

    public ScatterOptions() {
        super(ChartType.SCATTER);
    }

    public boolean isShowLegend() {
        return showLegend;
    }

    public void setShowLegend(boolean showLegend) {
        this.showLegend = showLegend;
    }

    public int getDotSize() {
        return dotSize;
    }

    public void setDotSize(int dotSize) {
        this.dotSize = dotSize;
    }

    public boolean isShowLine() {
        return showLine;
    }

    public void setShowLine(boolean showLine) {
        this.showLine = showLine;
    }
}
