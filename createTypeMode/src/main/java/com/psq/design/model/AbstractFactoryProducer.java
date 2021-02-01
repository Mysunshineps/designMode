package com.psq.design.model;

/**
 * @Description 抽象工厂模式 工厂创造器/生成器类
 * @Author psq
 * @Date 2021/1/28/15:30
 */
public class AbstractFactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
