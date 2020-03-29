package com.koy.cutecharts.core;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/28
 */
public class DataSet {

    private String label;
    private List<?> data;

    @Override
    public String toString() {
        return "DataSet{" +
                "label='" + label + '\'' +
                ", data=" + data +
                '}';
    }

    public DataSet(String label, List<?> data) {
        this.label = label;
        this.data = data;
    }

    public DataSet(List<?> data) {
        this.data = data;
    }

    public DataSet(Integer[] data) {
        this.data = Arrays.asList(data);
    }

    public DataSet(String label, Integer[] data) {
        this.label = label;
        this.data = Arrays.asList(data);
    }

    public DataSet(String label, Float[] data) {
        this.label = label;
        this.data = Arrays.asList(data);
    }

    public DataSet(String label, Dot[] data) {
        this.label = label;
        this.data = Arrays.asList(data);
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
