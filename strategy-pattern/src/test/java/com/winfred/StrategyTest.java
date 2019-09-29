package com.winfred;

import com.winfred.example_calc.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * 测试类
 *
 * @author wanglei
 * @date 2019/9/27
 * @since v1.0.0
 */
public class StrategyTest {

    @Test
    public void test() {
        Calculate calculate = new Calculate();
        calculate.setStrategy(new AddOperation());
        System.out.println("1 + 2 = " + calculate.calc(1, 2));
        Assert.assertEquals(3, calculate.calc(1, 2));

        calculate.setStrategy(new SubOperation());
        System.out.println("1 - 2 = " + calculate.calc(1, 2));
        Assert.assertEquals(-1, calculate.calc(1, 2));

        calculate.setStrategy(new MultiplyOperation());
        System.out.println("1 * 2 = " + calculate.calc(1, 2));
        Assert.assertEquals(2, calculate.calc(1, 2));

        calculate.setStrategy(new DivideOperation());
        System.out.println("1 / 2 = " + calculate.calc(1, 2));
        Assert.assertEquals(0, calculate.calc(1, 2));
    }
}
