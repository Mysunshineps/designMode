package com.psq.design.serviceImpl;

import com.psq.design.service.AbstractFactoryService;

/**
 * @Description 抽象工厂模式 具体实现类
 * @Author psq
 * @Date 2021/1/26/17:22
 */
public class AbstractFactoryServiceImplV1 implements AbstractFactoryService {
    @Override
    public void draw() {
        System.out.println("抽象工厂具体实现类ShapV1");
    }
}
