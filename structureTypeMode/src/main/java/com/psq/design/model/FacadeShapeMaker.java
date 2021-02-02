package com.psq.design.model;

import com.psq.design.service.FacadeShape;
import com.psq.design.serviceImpl.FacadeRectangle;
import com.psq.design.serviceImpl.FacadeSquare;

/**
 * @Description 外观模式 外观类
 * @Author psq
 * @Date 2021/2/2/16:09
 */
public class FacadeShapeMaker {
    private FacadeShape rectangle;
    private FacadeShape square;

    public FacadeShapeMaker() {
        this.rectangle = new FacadeRectangle();
        this.square = new FacadeSquare();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
