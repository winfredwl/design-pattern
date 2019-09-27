package com.winfred;

/**
 * 深焙咖啡
 *
 * @author wanglei
 * @date 2019/9/24
 * @since v1.0.0
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "深焙咖啡";
    }

    @Override
    public double cost() {
        return 100;
    }
}
