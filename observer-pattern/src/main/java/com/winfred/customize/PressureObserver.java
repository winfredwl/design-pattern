package com.winfred.customize;

/**
 * 气压观察者类
 *
 * @author wanglei
 * @date 2019/9/19
 * @since v1.0.0
 */
public class PressureObserver extends Observer {

    public PressureObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    void update() {
        System.out.println("气压变化");
        System.out.println("当前气压为:" + this.weatherData.getPressure());
    }
}
