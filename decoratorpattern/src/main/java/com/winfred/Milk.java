package com.winfred;

/**
 * 调料-牛奶
 *
 * @author wanglei
 * @date 2019/9/24
 * @since v1.0.0
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost() + 8;
    }
}

