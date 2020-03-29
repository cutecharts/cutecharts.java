package com.koy.cutecharts.options;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class GlobalOptions {

    /**
     * title: optional title of the chart
     * width: width of canvas
     * height: height of canvas
     */
    private String title;
    private String width = "800px";
    private String height = "600px";

    public GlobalOptions() {
    }

    public GlobalOptions(String title) {
        this.title = title;
    }

    public GlobalOptions(String title, String width, String height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "GlobalOptions{" +
                "title='" + title + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
