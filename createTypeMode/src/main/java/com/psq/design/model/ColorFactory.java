package com.psq.design.model;

import com.psq.design.service.AbstractFactoryService;
import com.psq.design.service.AbstractFactoryServiceColor;
import com.psq.design.serviceImpl.AbstractFactoryServiceImplV1;
import com.psq.design.serviceImpl.AbstractFactoryServiceImplV1Color;
import com.psq.design.serviceImpl.AbstractFactoryServiceImplV2;
import com.psq.design.serviceImpl.AbstractFactoryServiceImplV2Color;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/26/17:30
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public AbstractFactoryService getShape(String shapeType) {
        return null;
    }

    @Override
    public AbstractFactoryServiceColor getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("AbstractFactoryServiceImplV1Color")){
            return new AbstractFactoryServiceImplV1Color();
        } else if(color.equalsIgnoreCase("AbstractFactoryServiceImplV2Color")){
            return new AbstractFactoryServiceImplV2Color();
        }
        return null;
    }
}
