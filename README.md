<div align=center>
    <img src="https://user-images.githubusercontent.com/19553554/66697551-27384b00-ed09-11e9-9fe8-210918fdeb77.png">
</div>

-----
*🎨A hand drawing style charts library in Java.*

##  📣 Description

- The cute hand drawing style charts library is based on this project [chart.xkcd](https://github.com/timqian/chart.xkcd) :rocket:.
- There is an implemention in Python ([cutecharts.py](https://github.com/cutecharts/cutecharts.py)) from my cute friend :dog:.
- I wanna implement it in Java, that what here is ([cutecharts.java](https://github.com/cutecharts/cutecharts.java)) 🎨.



---

##  🔖 Documentation

> All the configurations detail you can find on there [chart.xkcd](https://timqian.com/chart.xkcd/).  
> All the demos is already in the **demo**  directory.




<img src=https://user-images.githubusercontent.com/33706142/77919719-1e93fb00-72d0-11ea-8116-e2aa4a89d64a.png />  




---

## 📝 Use



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



---

## 📃 License

**MIT**  [©Koy](https://github.com/Koooooo-7)
