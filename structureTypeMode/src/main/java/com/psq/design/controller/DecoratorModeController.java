package com.psq.design.controller;

import com.psq.design.model.RedDecoratorShape;
import com.psq.design.service.DecoratorAbstractShape;
import com.psq.design.service.DecoratorShape;
import com.psq.design.serviceImpl.DecoratorCircle;
import com.psq.design.serviceImpl.DecoratorRectangle;

/**
 * @Description 装饰器模式 客户端
 * @Author psq
 * @Date 2021/2/2/15:42
 */
public class DecoratorModeController {

    /**
     * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
     * 缺点：多层装饰比较复杂。
     *
     * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
     * 注意事项：可代替继承。
     * @param args
     */
    public static void main(String[] args) {
        DecoratorShape circle = new DecoratorCircle();
        DecoratorAbstractShape redCircle = new RedDecoratorShape(new DecoratorCircle());
        DecoratorAbstractShape redRectangle = new RedDecoratorShape(new DecoratorRectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
