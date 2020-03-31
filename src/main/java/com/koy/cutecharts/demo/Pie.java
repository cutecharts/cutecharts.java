package com.koy.cutecharts.demo;

import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.core.ChartBuilder;
import com.koy.cutecharts.core.DataSet;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.options.PieOptions;
import com.koy.cutecharts.render.RenderExecutor;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class Pie {
    public static void main(String[] args) {

        DataSet dataSet = new DataSet("amount", new Integer[]{1, 2, 3, 4, 5});

        PieOptions pieOptions = new PieOptions();
        pieOptions.setInnerRadius(0);

        Chart pie = new ChartBuilder.newChart(ChartType.PIE, "Demo-Pie")
                .setOptions(pieOptions)
                .setLabels(new String[]{"apple", "banana", "orange", "lemon", "watermelon", "strawberry"})
                .setData(dataSet)
                .build();
        RenderExecutor.render(pie);
    }
}
