package com.koy.cutecharts.chart;

import com.koy.cutecharts.core.Data;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.options.Options;

import java.util.UUID;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class Chart {


    private String title;
    transient private String type;
    transient private String width;
    transient private String height;
    private String xLabel;
    private String yLabel;
    private Data data = new Data();
    private Options options;
    transient private String chartId = UUIDGenerator.getUUID();

    public Chart(ChartType type) {
        this.type = type.getSymbol();
    }

    @Override
    public String toString() {
        return "Chart{" +
                "title='" + title + '\'' +
                ", xLabel='" + xLabel + '\'' +
                ", yLabel='" + yLabel + '\'' +
                ", data=" + data +
                ", options=" + options +
                ", chartId='" + chartId + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getxLabel() {
        return xLabel;
    }

    public void setxLabel(String xLabel) {
        this.xLabel = xLabel;
    }

    public String getyLabel() {
        return yLabel;
    }

    public void setyLabel(String yLabel) {
        this.yLabel = yLabel;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public String getChartId() {
        return chartId;
    }
}


class UUIDGenerator {
    static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
