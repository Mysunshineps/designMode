package com.psq.design.service;

/**
 * @Description 装饰器模式 抽象装饰类
 * @Author psq
 * @Date 2021/2/2/15:25
 */
public abstract class DecoratorAbstractShape implements DecoratorShape {
    protected DecoratorShape decoratorShape;

    public DecoratorAbstractShape(DecoratorShape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
