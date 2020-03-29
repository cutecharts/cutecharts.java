package com.koy.cutecharts.demo;

import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.core.ChartBuilder;
import com.koy.cutecharts.core.DataSet;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.enums.PositionType;
import com.koy.cutecharts.options.BarOptions;
import com.koy.cutecharts.render.RenderExecutor;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class Bar {
    public static void main(String[] args) {

        DataSet dataSet = new DataSet(new Integer[]{2, 3, 4, 2, 5, 4});

        BarOptions barOptions = new BarOptions();
        barOptions.setLegendPosition(PositionType.UP_RIGHT);

        Chart bar = new ChartBuilder.newChart(ChartType.BAR, "Demo-Bar")
                .setOptions(barOptions)
                .setLabels(new String[]{"apple", "banana", "orange", "lemon", "watermelon", "strawberry"})
                .setYLabel("Y-axis Amount")
                .setData(dataSet)
                .build();
        RenderExecutor.render(bar);
    }
}
