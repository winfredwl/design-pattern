package com.winfred.example_duck;

/**
 * 嘎嘎叫
 *
 * @author wanglei
 * @date 2019/9/29
 * @since v1.0.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quark() {
        System.out.println("嘎嘎叫");
    }
}
