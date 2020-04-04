package com.koy.cutecharts.core;

import com.koy.cutecharts.chart.Chart;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.options.BaseOptions;
import com.koy.cutecharts.options.GlobalOptions;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class ChartBuilder {

    public static class newChart {

        private ChartType chartType;
        private Chart chart;
        private GlobalOptions globalOptions = new GlobalOptions();

        public newChart() {
        }

        private void init(ChartType type) {
            this.chart = new Chart(type);
            this.chartType = type;
        }

        public newChart(ChartType type) {
            init(type);
        }

        public newChart(ChartType type, GlobalOptions globalOptions) {
            init(type);
            this.globalOptions = globalOptions;
        }

        public newChart(ChartType type, String title) {
            init(type);
            this.globalOptions.setTitle(title);
        }

        public newChart(ChartType type, String title, String width, String height) {
            this.chart = new Chart(type);
            this.chartType = type;
            this.globalOptions.setTitle(title);
            this.globalOptions.setHeight(height);
            this.globalOptions.setWidth(width);
        }

        public newChart setLabels(Integer[] interval) {
            this.chart.getData().setLabels(interval);
            return this;
        }

        public newChart setLabels(String[] interval) {
            this.chart.getData().setLabels(interval);
            return this;
        }

        public newChart setXLabel(String xLabel) {
            this.chart.setxLabel(xLabel);
            return this;
        }

        public newChart setYLabel(String yLabel) {
            this.chart.setyLabel(yLabel);
            return this;
        }

        public newChart setXYLabels(String xLabel, String yLabel) {
            this.chart.setxLabel(xLabel);
            this.chart.setyLabel(yLabel);
            return this;

        }

        public newChart setOptions(BaseOptions options) {
            checkOptionsType(options);
            this.chart.setOptions(options);
            return this;
        }

        public newChart setData(DataSet data) {
            this.chart.getData().appendDataSet(data);
            return this;
        }

        public Chart build() {
            setGlobalOptions2Chart();
            return this.chart;
        }

        private void setGlobalOptions2Chart() {
            this.chart.setTitle(this.globalOptions.getTitle());
            this.chart.setHeight(this.globalOptions.getHeight());
            this.chart.setWidth(this.globalOptions.getWidth());
        }

        private void checkOptionsType(BaseOptions options) {
            if (!options.getChartType().getSymbol().equals(this.chartType.getSymbol())) {
                throw new IllegalArgumentException("Chart options non-match chart type");
            }
        }

        public Chart getChart() {
            return chart;
        }

        public void setChart(ChartType chart) {
            init(chart);
        }

        public GlobalOptions getGlobalOptions() {
            return globalOptions;
        }

        public void setGlobalOptions(GlobalOptions globalOptions) {
            this.globalOptions = globalOptions;
        }
    }
}
