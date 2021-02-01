package com.psq.design.serviceImpl;

import com.psq.design.service.PrototypeModeService;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/29/15:02
 */
public class Rectangle extends PrototypeModeService {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
