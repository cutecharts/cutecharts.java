package com.koy.cutecharts.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class Data implements Serializable {

    private List<?> labels;

    private List<DataSet> datasets = new ArrayList<>();

    @Override
    public String toString() {
        return "Data{" +
                "labels=" + labels +
                ", dataSets=" + datasets +
                '}';
    }

    public void appendDataSet(DataSet dataSet) {
        this.datasets.add(dataSet);
    }

    public void setLabels(List<? extends Number> labels) {
        this.labels = labels;
    }

    public void setLabels(Integer[] label) {
        this.labels = Arrays.asList(label);
    }

    public void setLabels(String[] label) {
        this.labels = Arrays.asList(label);
    }

    public List<?> getLabels() {
        return labels;
    }

    public List<DataSet> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<DataSet> datasets) {
        this.datasets = datasets;
    }


}
