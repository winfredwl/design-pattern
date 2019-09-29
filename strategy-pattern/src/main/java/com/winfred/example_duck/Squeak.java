package com.winfred.example_duck;

/**
 * 吱吱叫
 *
 * @author wanglei
 * @date 2019/9/29
 * @since v1.0.0
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quark() {
        System.out.println("吱吱叫");
    }
}
