package com.psq.design.serviceImpl;

import com.psq.design.service.PrototypeModeService;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/29/15:14
 */
public class Square extends PrototypeModeService {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
