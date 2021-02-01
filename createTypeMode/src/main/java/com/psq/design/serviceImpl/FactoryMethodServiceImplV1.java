package com.psq.design.serviceImpl;

import com.psq.design.service.FactoryMethodService;

/**
 * @Description 工厂方法模式
 * @Author psq
 * @Date 2021/1/26/16:56
 */
public class FactoryMethodServiceImplV1 implements FactoryMethodService {

    @Override
    public void draw() {
        System.out.println("工厂方法实现V1");
    }
}
