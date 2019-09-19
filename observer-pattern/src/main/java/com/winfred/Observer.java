package com.winfred;

/**
 * 观察者抽象类
 *
 * @author wanglei
 * @date 2019/9/19
 * @since v1.0.0
 */
public abstract class Observer {

    WeatherData weatherData;

    abstract void update();
}
