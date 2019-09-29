package com.winfred.example_duck;

/**
 * 不叫
 *
 * @author wanglei
 * @date 2019/9/29
 * @since v1.0.0
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quark() {
        System.out.println("不会叫");
    }
}
