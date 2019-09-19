package com.winfred;

import org.junit.Assert;
import org.junit.Test;

/**
 * 实体类
 *
 * @author wanglei
 * @date 2019/9/18
 * @since v1.0.0
 */
public class SingletonTest {

    @Test
    public void testSingleton() {
        SingleObject singleObject1 = SingleObject.getInstance();
        singleObject1.showMessage();

        SingleObject singleObject2 = SingleObject.getInstance();
        singleObject2.showMessage();

        Assert.assertSame(singleObject1, singleObject2);
    }
}
