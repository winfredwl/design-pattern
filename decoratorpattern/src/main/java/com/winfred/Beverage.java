package com.winfred;

/**
 * 饮料抽象类
 *
 * 装饰器类--动态地将责任附加到对象上。
 * 若要拓展功能，装饰器提供了比继承更有弹性的替代方案。
 *
 * @author wanglei
 * @date 2019/9/24
 * @since v1.0.0
 */
public abstract class Beverage {

    public String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
