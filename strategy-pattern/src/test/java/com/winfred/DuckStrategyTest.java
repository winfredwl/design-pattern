package com.winfred;

import com.winfred.example_duck.*;
import org.junit.Test;

/**
 * 鸭子测试类
 *
 * @author wanglei
 * @date 2019/9/29
 * @since v1.0.0
 */
public class DuckStrategyTest {

    @Test
    public void test() {
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();

        System.out.println();
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
