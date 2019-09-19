package com.winfred;

/**
 * 单例对象
 *
 * @author wanglei
 * @date 2019/9/18
 * @since v1.0.0
 */
public class SingleObject {

    private static SingleObject singleObject = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance() {
        return singleObject;
    }

    public void showMessage() {
        System.out.println("单例模式");
    }
}
