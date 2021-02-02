package com.psq.design.serviceImpl;

import com.psq.design.service.FacadeShape;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/2/16:08
 */
public class FacadeSquare implements FacadeShape {
    @Override
    public void draw() {
        System.out.println("FacadeSquare :draw()");
    }
}
