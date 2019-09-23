package com.winfred.jdk;

import java.util.Observable;

/**
 * 实体类
 *
 * @author wanglei
 * @date 2019/9/23
 * @since v1.0.0
 */
public class WeatherData extends Observable {

    private float pressure;

    private float temperature;

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureObserver temperatureObserver = new TemperatureObserver(weatherData);
        PressureObserver pressureObserver = new PressureObserver(weatherData);
        weatherData.setMeasurements(0.12f, 0.333f);
        System.out.println("------------移除温度观察者-------------");
        weatherData.deleteObserver(temperatureObserver);
        weatherData.setMeasurements(0.2333f, 0.6666f);
        System.out.println("------------移除气压观察者-------------");
        weatherData.deleteObserver(pressureObserver);
        weatherData.setMeasurements(0.2333f, 0.6666f);
    }
}
