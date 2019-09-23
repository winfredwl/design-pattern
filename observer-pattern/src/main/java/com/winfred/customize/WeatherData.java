package com.winfred.customize;

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

    private float pressure;

    private float temperature;

    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    void removeObserver(Observer observer) {
        if (observers.size() > 0) {
            observers.remove(observer);
        }
    }

    private void notifyAllObserver() {
        for (Observer t : observers) {
            t.update();
        }
    }

    public void measurementsChanged() {
        notifyAllObserver();
    }

    public void setMeasurements(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureObserver temperatureObserver = new TemperatureObserver(weatherData);
        PressureObserver pressureObserver = new PressureObserver(weatherData);
        weatherData.setMeasurements(0.12f, 0.333f);
        System.out.println("------------移除温度观察者-------------");
        weatherData.removeObserver(temperatureObserver);
        weatherData.setMeasurements(0.2333f, 0.6666f);
        System.out.println("------------移除气压观察者-------------");
        weatherData.removeObserver(pressureObserver);
        weatherData.setMeasurements(0.2333f, 0.6666f);
    }

}
