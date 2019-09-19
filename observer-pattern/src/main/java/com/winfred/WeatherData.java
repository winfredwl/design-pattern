package com.winfred;

import java.util.ArrayList;
import java.util.List;

/**
 * 实体类
 *
 * @author wanglei
 * @date 2019/9/19
 * @since v1.0.0
 */
public class WeatherData {

    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
        notifyAllObserver();
    }

    void removeObserver(Observer observer) {
        if (observers.size() > 0) {
            observers.remove(observer);
            notifyAllObserver();
        }
    }

    private void notifyAllObserver() {
        for (Observer t : observers) {
            t.update();
        }
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new TemperatureObserver(weatherData);
        new PressureObserver(weatherData);
    }

}
