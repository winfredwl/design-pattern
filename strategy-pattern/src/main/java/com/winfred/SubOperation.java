package com.winfred;

/**
 * 减法操作
 *
 * @author wanglei
 * @date 2019/9/27
 * @since v1.0.0
 */
public class SubOperation implements Strategy{

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
