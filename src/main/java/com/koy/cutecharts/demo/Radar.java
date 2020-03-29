package com.koy.cutecharts.demo;

import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.core.ChartBuilder;
import com.koy.cutecharts.core.DataSet;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.options.RadarOptions;
import com.koy.cutecharts.render.RenderExecutor;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class Radar {

    public static void main(String[] args) {
        DataSet dataSet = new DataSet("Kobe", new Integer[]{5, 2, 2, 3, 1, 4});
        DataSet dataSet1 = new DataSet("God", new Integer[]{1, 1, 1, 1, 1, 1});

        RadarOptions radarOptions = new RadarOptions();
        radarOptions.setShowLegend(true);

        Chart radar = new ChartBuilder.newChart(ChartType.RADAR, "Demo-Radar")
                .setOptions(radarOptions)
                .setLabels(new String[]{"score", "assist", "rebound", "block", "steal", "shootRate"})
                .setData(dataSet)
                .setData(dataSet1)
                .build();
        RenderExecutor.render(radar);
    }
}
