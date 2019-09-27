package com.winfred;

/**
 * 黑咖啡
 *
 * @author wanglei
 * @date 2019/9/24
 * @since v1.0.0
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "黑咖啡";
    }

    @Override
    public double cost() {
        return 10;
    }
}
