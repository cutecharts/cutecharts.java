package com.koy.cutecharts;

import com.koy.cutecharts.core.ChartBuilder;
import com.koy.cutecharts.enums.ChartType;
import com.koy.cutecharts.options.BaseOptions;
import com.koy.cutecharts.options.GlobalOptions;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/03/29
 */
public class ChartTests {

    //TODO: Unit Test

    @Test
    public void testChartBuilderTypeCheck() {
        BaseOptions options = Mockito.mock(BaseOptions.class);
        when(options.getChartType()).thenReturn(ChartType.LINE);
        ChartBuilder.newChart newChart = new ChartBuilder.newChart(ChartType.BAR);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            newChart.setOptions(options);
        });
    }

    @Test
    public void testGlobalDefaultOptions() {
        GlobalOptions globalOptions = new GlobalOptions();
        Assert.assertEquals("800px", globalOptions.getWidth());
        Assert.assertEquals("600px", globalOptions.getHeight());
    }


}
