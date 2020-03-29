package com.koy.cutecharts.demo;

import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.core.ChartBuilder;
import com.koy.cutecharts.core.DataSet;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.enums.PositionType;
import com.koy.cutecharts.options.LineOptions;
import com.koy.cutecharts.render.RenderExecutor;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class Line {
    public static void main(String[] args) {

        DataSet dataSet1 = new DataSet("Beer", new Integer[]{1, 2, 3, 4, 2, 5, 4});
        DataSet dataSet2 = new DataSet("Juice", new Integer[]{1, 4, 7, 4, 1, 3, 2});

        LineOptions lineOptions = new LineOptions();
        lineOptions.setBackgroundColor("orange");
        lineOptions.setLegendPosition(PositionType.UP_RIGHT);

        Chart line = new ChartBuilder.newChart(ChartType.LINE, "Demo-Line")
                .setOptions(lineOptions)
                .setLabels(new Integer[]{1, 2, 3, 4, 5, 6, 7})
                .setXLabel("X-axis Week")
                .setYLabel("Y-axis Amount")
                .setData(dataSet1)
                .setData(dataSet2)
                .build();
        RenderExecutor.render(line);
    }
}
