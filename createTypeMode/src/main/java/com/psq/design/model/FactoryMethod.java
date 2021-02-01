package com.psq.design.model;

import com.psq.design.service.FactoryMethodService;
import com.psq.design.serviceImpl.FactoryMethodServiceImplV1;
import com.psq.design.serviceImpl.FactoryMethodServiceImplV2;

/**
 * @Description 工厂方法模式 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * @Author psq
 * @Date 2021/1/26/16:59
 */
public class FactoryMethod {

    //使用 getFactory()方法获取具体实现的对象
    public FactoryMethodService getFactory(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equals("FactoryMethodServiceImplV1")){
            return new FactoryMethodServiceImplV1();
        }else if(shapeType.equals("FactoryMethodServiceImplV2")){
            return new FactoryMethodServiceImplV2();
        }
        return null;
    }
}
