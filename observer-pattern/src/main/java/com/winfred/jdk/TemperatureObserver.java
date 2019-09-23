package com.winfred.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 实体类
 *
 * @author wanglei
 * @date 2019/9/23
 * @since v1.0.0
 */
public class TemperatureObserver implements Observer {

    private Observable observable;

    public TemperatureObserver(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("温度观察者:");
        if (o instanceof WeatherData) {
            System.out.println("当前温度为:" + ((WeatherData) o).getTemperature());
        }
    }
}
