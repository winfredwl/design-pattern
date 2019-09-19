package com.winfred;

/**
 * 实体类
 *
 * @author wanglei
 * @date 2019/9/18
 * @since v1.0.0
 */
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
