<#macro content >
    <div id="${chart.chartId }" class="chart-container" style="height:${chart.height} ;width:${chart.width}">
        <svg id="chart_${chart.chartId}"></svg>
    </div>
    <script>
        const svg_${chart.chartId} = document.querySelector('#chart_${chart.chartId}')
        const chart_${chart.chartId} = new chartXkcd.${chart.type}(svg_${chart.chartId}, ${data});
    </script>
</#macro>