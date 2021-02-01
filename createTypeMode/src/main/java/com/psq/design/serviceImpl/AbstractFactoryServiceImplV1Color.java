package com.psq.design.serviceImpl;

import com.psq.design.service.AbstractFactoryServiceColor;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/26/17:24
 */
public class AbstractFactoryServiceImplV1Color implements AbstractFactoryServiceColor {
    @Override
    public void fill() {
        System.out.println("抽象工厂具体实现类ColorV1");
    }
}
