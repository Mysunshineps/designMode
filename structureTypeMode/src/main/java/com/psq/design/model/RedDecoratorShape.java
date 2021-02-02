package com.psq.design.model;

import com.psq.design.service.DecoratorAbstractShape;
import com.psq.design.service.DecoratorShape;

/**
 * @Description 装饰器模式 扩展了抽象装饰类的实体装饰类
 * @Author psq
 * @Date 2021/2/2/15:32
 */
public class RedDecoratorShape extends DecoratorAbstractShape {
    public RedDecoratorShape(DecoratorShape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(DecoratorShape decoratorShape) {
        System.out.println("Border Color: Red");
    }
}
