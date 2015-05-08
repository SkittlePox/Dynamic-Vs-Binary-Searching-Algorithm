package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {

    int size = 100;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Binary VS. Dynamic Searching");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Length of Array");
        yAxis.setLabel("Average Number of Tries");
        //creating the chart
        final LineChart<Number, Number> lineChart =
                new LineChart<Number, Number>(xAxis, yAxis);

        lineChart.setTitle("Average Number of Tries Per Algorithm");
        lineChart.setCreateSymbols(false);
        //defining a series
        XYChart.Series bins = new XYChart.Series();
        XYChart.Series dyns = new XYChart.Series();

        bins.setName("Binary Search");
        dyns.setName("Dynamic Search");

        //populating the series with data
        for (int i = 1; i <= size; i++) {
            bins.getData().add(new XYChart.Data(i, bin.search(makeArray(i))));
            dyns.getData().add(new XYChart.Data(i, dyn.search(makeArray(i))));
        }

        Scene scene = new Scene(lineChart, 1000, 700);
        lineChart.getData().add(bins);
        lineChart.getData().add(dyns);

        stage.setScene(scene);
        stage.show();
    }

    static binsearch bin = new binsearch();
    static dynsearch dyn = new dynsearch();

    public static void main(String[] args) {
        launch(args);
//        System.out.println(dyn.search(makeArray(100)));
    }

    public static int[] makeArray(int length) {
        int[] f = new int[length];
        for (int x = 1; x <= length; x++) {
            f[x - 1] = x;
        }
        return f;
    }
}