package com.winfred.example_duck;

/**
 * 鸭子抽象类
 *
 * @author wanglei
 * @date 2019/9/29
 * @since v1.0.0
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quark();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("游泳");
    }

    public abstract void display();

}
