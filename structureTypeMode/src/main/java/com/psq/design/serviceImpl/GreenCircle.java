package com.psq.design.serviceImpl;

import com.psq.design.service.DrawAPI;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/1/17:10
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+ ", y: " +y+ " ]");
    }
}
