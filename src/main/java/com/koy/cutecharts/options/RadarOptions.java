package com.koy.cutecharts.options;

import com.koy.cutecharts.enums.ChartType;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class RadarOptions extends BaseOptions {

    /**
     * showLabels: display labels near every line (default false)
     * dotSize: you can change size of the dots if you want (default 1)
     */
    private int dotSize = 1;

    public RadarOptions() {
        super(ChartType.RADAR);
        super.setShowLegend(false);
    }

    public int getDotSize() {
        return dotSize;
    }

    public void setDotSize(int dotSize) {
        this.dotSize = dotSize;
    }
}
