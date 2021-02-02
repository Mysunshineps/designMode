package com.psq.design.serviceImpl;

import com.psq.design.service.FacadeShape;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/2/16:07
 */
public class FacadeRectangle implements FacadeShape {
    @Override
    public void draw() {
        System.out.println("FacadeRectangle :draw()");
    }
}
