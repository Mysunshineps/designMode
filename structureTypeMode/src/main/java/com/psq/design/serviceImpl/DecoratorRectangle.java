package com.psq.design.serviceImpl;

import com.psq.design.service.DecoratorShape;

/**
 * @Description 装饰器模式
 * @Author psq
 * @Date 2021/2/2/15:20
 */
public class DecoratorRectangle implements DecoratorShape {
    @Override
    public void draw() {
        System.out.println("DecoratorShape: DecoratorRectangle");
    }
}
