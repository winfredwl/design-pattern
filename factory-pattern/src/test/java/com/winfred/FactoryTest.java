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
public class FactoryTest {

    @Test
    public void createCircle() {
        ShapeFactory shapeFactory = new CircleFactory();
        Shape shape = shapeFactory.createShape();
        shape.draw();
        Assert.assertTrue(shape instanceof Circle);
    }

    @Test
    public void createRectangle() {
        ShapeFactory shapeFactory = new RectangleFactory();
        Shape shape = shapeFactory.createShape();
        shape.draw();
        Assert.assertTrue(shape instanceof Rectangle);
    }

    @Test
    public void createSquare() {
        ShapeFactory shapeFactory = new SquareFactory();
        Shape shape = shapeFactory.createShape();
        shape.draw();
        Assert.assertTrue(shape instanceof Square);
    }
}
