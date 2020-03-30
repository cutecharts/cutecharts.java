package com.koy.cutecharts.demo;

import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.core.ChartBuilder;
import com.koy.cutecharts.core.DataSet;
import com.koy.cutecharts.core.Dot;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.options.ScatterOptions;
import com.koy.cutecharts.render.RenderExecutor;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class Scatter {
    public static void main(String[] args) {

        Dot n10 = new Dot(1, 2);
        Dot n11 = new Dot(-2, 2.5);
        Dot n12 = new Dot(3.2, 2.5);
        Dot n13 = new Dot(3.2, 2.5);
        Dot n14 = new Dot(3.2, 3.5);

        Dot n20 = new Dot(3, 2.5);
        Dot n21 = new Dot(5, 3);
        Dot n22 = new Dot(1, 2);
        Dot n23 = new Dot(4, 2.2);
        Dot n24 = new Dot(-1, 2.7);

        Dot[] dots1 = new Dot[]{n10, n11, n12, n13, n14};
        Dot[] dots2 = new Dot[]{n20, n21, n22, n23, n24};
        DataSet dataSet1 = new DataSet("Pikachu", dots1);
        DataSet dataSet11 = new DataSet("Squirtle", dots2);

        ScatterOptions scatterOptions = new ScatterOptions();
        scatterOptions.setDotSize(2);
        scatterOptions.setxTickCount(5);
        scatterOptions.setyTickCount(5);

        Chart scatter = new ChartBuilder.newChart(ChartType.SCATTER, "Demo-Scatter")
                .setOptions(scatterOptions)
                .setXYLabels("Coodinate", "Probability")
                .setData(dataSet11)
                .setData(dataSet1)
                .build();
        RenderExecutor.render(scatter);
    }
}
