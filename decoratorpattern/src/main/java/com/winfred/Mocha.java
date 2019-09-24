package com.winfred;

/**
 * 调料-摩卡
 *
 * @author wanglei
 * @date 2019/9/24
 * @since v1.0.0
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加摩卡";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5;
    }
}
