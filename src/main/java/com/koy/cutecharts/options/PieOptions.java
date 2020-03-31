package com.koy.cutecharts.options;

import com.koy.cutecharts.enums.ChartType;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class PieOptions extends BaseOptions {

    /**
     * innerRadius: specify empty pie chart radius (default: 0.5)
     * Want a pie chart? set innerRadius to 0
     */
    private double innerRadius = 0.5;

    public PieOptions() {
        super(ChartType.PIE);
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }
}
