package com.psq.design.model;

import com.psq.design.service.DrawAPI;
import com.psq.design.service.Shape;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/1/17:14
 */
public class Circle extends Shape {
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
