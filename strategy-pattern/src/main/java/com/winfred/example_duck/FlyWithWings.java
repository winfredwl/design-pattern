package com.winfred.example_duck;

/**
 * 飞
 *
 * @author wanglei
 * @date 2019/9/29
 * @since v1.0.0
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("鸭子飞起来");
    }
}
