package com.psq.design.model;

import com.psq.design.service.AbstractFactoryService;
import com.psq.design.service.AbstractFactoryServiceColor;
import com.psq.design.serviceImpl.AbstractFactoryServiceImplV1;
import com.psq.design.serviceImpl.AbstractFactoryServiceImplV2;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/26/17:30
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public AbstractFactoryService getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("AbstractFactoryServiceImplV1")){
            return new AbstractFactoryServiceImplV1();
        } else if(shapeType.equalsIgnoreCase("AbstractFactoryServiceImplV2")){
            return new AbstractFactoryServiceImplV2();
        }
        return null;
    }

    @Override
    public AbstractFactoryServiceColor getColor(String color) {
        return null;
    }
}
