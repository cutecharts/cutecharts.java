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

All the configuration detail you can find on there [chart.xkcd](https://timqian.com/chart.xkcd/).

All the demos is already in the **demo**  directory.



<div align="center">
      <img src="https://user-images.githubusercontent.com/19553554/66558121-9f760380-eb85-11e9-8b37-6d4dbd39f2e8.png" width="33%"/>
      <img src="https://user-images.githubusercontent.com/19553554/66558192-bddbff00-eb85-11e9-8cf1-bef4b93434af.png" width="33%"/>
      <img src="https://user-images.githubusercontent.com/19553554/66558265-db10cd80-eb85-11e9-8450-1535b6e68bc7.png" width="33%"/>
      <img src="https://user-images.githubusercontent.com/19553554/66558482-317e0c00-eb86-11e9-96f9-4de0f1611c3d.png" width="33%"/>
      <img src="https://user-images.githubusercontent.com/19553554/66558545-4ce91700-eb86-11e9-9cda-402e1e6f19b1.png" width="33%"/>
      <img src="https://user-images.githubusercontent.com/19553554/66558614-6c803f80-eb86-11e9-8386-46315c5f0843.png" width="33%"/>
</div>



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
