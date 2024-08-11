package com.sultaale.patterns.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    private float averageTemperature;
    private float maxTemperature;
    private float minTemperature;
    private List<Float> temperature = new ArrayList<>();

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("AVG/MAX/MIN temperature = " + averageTemperature
        + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update() {
        temperature.add(weatherData.getTemperature());
        maxTemperature = Collections.max(temperature);
        minTemperature = Collections.min(temperature);
        float sum = 0;
        for (float t: temperature) {
            sum += t;
        }
        averageTemperature = sum/temperature.size();
        display();
    }
}
