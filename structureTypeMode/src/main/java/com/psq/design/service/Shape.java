package com.psq.design.service;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/1/17:12
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
