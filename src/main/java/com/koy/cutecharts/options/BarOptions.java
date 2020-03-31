package com.koy.cutecharts.options;

import com.koy.cutecharts.enums.ChartType;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class BarOptions extends BaseOptions {

    /**
     * showLabels: display labels near every line (default false)
     */
    private boolean showLabels = false;

    public BarOptions() {
        super(ChartType.BAR);
        super.setShowLabels(showLabels);
    }
}
