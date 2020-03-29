package com.koy.cutecharts.demo;

import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.core.ChartBuilder;
import com.koy.cutecharts.core.DataSet;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.options.StackedBarOptions;
import com.koy.cutecharts.render.RenderExecutor;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class StackedBar {
    public static void main(String[] args) {

        DataSet dataSet1 = new DataSet("Beer", new Integer[]{3, 4, 2, 5, 4});
        DataSet dataSet2 = new DataSet("Juice", new Integer[]{7, 4, 1, 2, 2});
        DataSet dataSet3 = new DataSet("Water", new Integer[]{1, 3, 5, 3, 5});

        StackedBarOptions stackedBarOptions = new StackedBarOptions();

        Chart stackedBar = new ChartBuilder.newChart(ChartType.STACKED_BAR, "Demo-StackedBar")
                .setOptions(stackedBarOptions)
                .setLabels(new String[]{"Jan", "Feb", "Mar", "April", "May"})
                .setYLabel("Y-axis Count")
                .setData(dataSet1)
                .setData(dataSet2)
                .setData(dataSet3)
                .build();
        RenderExecutor.render(stackedBar);
    }
}
