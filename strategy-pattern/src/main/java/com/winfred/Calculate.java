package com.winfred;

/**
 * 计算
 *
 * @author wanglei
 * @date 2019/9/27
 * @since v1.0.0
 */
public class Calculate {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calc(int a, int b) {
        return strategy.calculate(a, b);
    }
}
