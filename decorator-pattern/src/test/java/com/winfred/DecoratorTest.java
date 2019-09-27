package com.winfred;

import org.junit.Test;

/**
 * 实体类
 *
 * @author wanglei
 * @date 2019/9/24
 * @since v1.0.0
 */
public class DecoratorTest {

    @Test
    public void testPrice() {
        Beverage houseBlend = new HouseBlend();
        Beverage milk = new Milk(houseBlend);
        System.out.println(milk.getDescription());
        System.out.println(milk.cost());
        Beverage mocha = new Mocha(milk);
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());

        Beverage darkRoast = new DarkRoast();
        Beverage mocha2 = new Mocha(darkRoast);
        System.out.println(mocha2.getDescription());
        System.out.println(mocha2.cost());
        Beverage milk2 = new Milk(mocha2);
        System.out.println(milk2.getDescription());
        System.out.println(milk2.cost());

    }
}
