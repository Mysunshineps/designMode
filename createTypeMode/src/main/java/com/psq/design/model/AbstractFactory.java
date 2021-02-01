package com.psq.design.model;

import com.psq.design.service.AbstractFactoryService;
import com.psq.design.service.AbstractFactoryServiceColor;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/26/17:28
 */
public abstract class AbstractFactory {
    public abstract AbstractFactoryService getShape(String shape);
    public abstract AbstractFactoryServiceColor getColor(String color);
}
