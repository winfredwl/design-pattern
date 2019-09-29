package com.winfred.example_duck;

/**
 * 不飞
 *
 * @author wanglei
 * @date 2019/9/29
 * @since v1.0.0
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }
}
