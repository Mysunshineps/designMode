package com.psq.design.serviceImpl;

import com.psq.design.service.FlyWeightShape;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/2/16:35
 */
public class FlyWeightCircle implements FlyWeightShape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public FlyWeightCircle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius+"]");
    }
}
