package com.psq.design.controller;

import com.psq.design.model.AbstractFactory;
import com.psq.design.model.AbstractFactoryProducer;
import com.psq.design.service.AbstractFactoryService;
import com.psq.design.service.AbstractFactoryServiceColor;

/**
 * @Description 抽象工厂模式 客户端
 * @Author psq
 * @Date 2021/1/28/15:51
 */
public class AbstractFactoryController {

    /**
     * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
     * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
     *
     * 使用场景： 1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。
     * 注意事项：产品族难扩展，产品等级易扩展。
     * @param args
     */
    public static void main(String[] args){
        //通过抽象工厂生成器获取对应的ShapeFactory工厂
        AbstractFactory shape = AbstractFactoryProducer.getFactory("SHAPE");
        AbstractFactoryService shapV1 = shape.getShape("AbstractFactoryServiceImplV1");
        shapV1.draw();
        AbstractFactoryService shapV2 = shape.getShape("AbstractFactoryServiceImplV2");
        shapV2.draw();

        //通过抽象工厂生成器获取对应的ColorFactory工厂
        AbstractFactory color = AbstractFactoryProducer.getFactory("COLOR");
        AbstractFactoryServiceColor v1Color = color.getColor("AbstractFactoryServiceImplV1Color");
        v1Color.fill();
        AbstractFactoryServiceColor v2Color = color.getColor("AbstractFactoryServiceImplV2Color");
        v2Color.fill();

    }
}
