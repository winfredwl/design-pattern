package com.winfred.customize;

/**
 * 温度观察者类
 *
 * @author wanglei
 * @date 2019/9/19
 * @since v1.0.0
 */
public class TemperatureObserver extends Observer {

    public TemperatureObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    void update() {
        System.out.println("温度变化");
        System.out.println("当前温度为:" + this.weatherData.getTemperature());
    }
}
