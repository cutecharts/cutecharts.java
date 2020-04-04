<p align="center">
    <img src="https://user-images.githubusercontent.com/19553554/66697551-27384b00-ed09-11e9-9fe8-210918fdeb77.png" alt="cutecharts.java logo" width=600/>
</p>

<p align=center>
    <i>🎨A hand drawing style charts library in Java.</i>
</p>

##  📣 Description

- The cute hand drawing style charts library is based on this project [chart.xkcd](https://github.com/timqian/chart.xkcd) :rocket:.
- There is an implemention in Python ([cutecharts.py](https://github.com/cutecharts/cutecharts.py)) from my cute friend :dog:.
- There implement it in Java, yea, there it is ([cutecharts.java](https://github.com/cutecharts/cutecharts.java)) 🎨.


##  🔖 Documentation

> All the configurations detail you can find on there [chart.xkcd](https://timqian.com/chart.xkcd/).  
> All the demos are already in the **demo** directory.

<img src=https://user-images.githubusercontent.com/33706142/77919719-1e93fb00-72d0-11ea-8116-e2aa4a89d64a.png />  


## 📝 Useage

### Import Dependency
> pom.xml
```xml
<dependency>
    <groupId>com.koy</groupId>
    <artifactId>cutecharts</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Code Demo
```java
DataSet dataSet = new DataSet("Kobe", new Integer[]{5, 2, 2, 3, 1, 4});
DataSet dataSet1 = new DataSet("God", new Integer[]{1, 1, 1, 1, 1, 1});

RadarOptions radarOptions = new RadarOptions();
radarOptions.setShowLegend(true);
radarOptions.setShowLabels(true);
radarOptions.setBackgroundColor("purple");
radarOptions.setDataColors(new String[]{"#d48265", "#61a0a8"});

Chart radar = new ChartBuilder.newChart(ChartType.RADAR, "Demo-Radar")
        .setOptions(radarOptions)
        .setLabels(new String[]{"score", "assist", "rebound", "block", "steal", "shootRate"})
        .setData(dataSet)
        .setData(dataSet1)
        .build();
RenderExecutor.render(radar);
```  

![kobe](https://user-images.githubusercontent.com/33706142/78035089-34222700-739b-11ea-95ad-366ca54ad656.png)  

```java
DataSet dataSet1 = new DataSet("Beer", new Integer[]{1, 2, 3, 4, 2, 5, 4});
DataSet dataSet2 = new DataSet("Juice", new Integer[]{1, 4, 7, 4, 1, 3, 2});

LineOptions lineOptions = new LineOptions();
lineOptions.setBackgroundColor("orange");
lineOptions.setLegendPosition(PositionType.UP_RIGHT);

Chart line = new ChartBuilder.newChart(ChartType.LINE, "Demo-Line")
        .setOptions(lineOptions)
        .setLabels(new Integer[]{1, 2, 3, 4, 5, 6, 7})
        .setXLabel("X-axis Week")
        .setYLabel("Y-axis Amount")
        .setData(dataSet1)
        .setData(dataSet2)
        .build();
RenderExecutor.render(line);
```

![line](https://user-images.githubusercontent.com/33706142/77851369-69980a80-720b-11ea-885b-a39fc54d83d9.png)


## 📃 License

MIT [©Koy](https://github.com/Koooooo-7)

