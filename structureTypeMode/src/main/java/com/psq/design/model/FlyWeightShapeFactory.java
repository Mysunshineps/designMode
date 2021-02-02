package com.psq.design.model;

import com.psq.design.service.FlyWeightShape;
import com.psq.design.serviceImpl.FlyWeightCircle;

import java.util.HashMap;

/**
 * @Description 亨元模式
 * @Author psq
 * @Date 2021/2/2/16:38
 */
public class FlyWeightShapeFactory {

    /**
     * 存储重复使用的对象
     */
    private static final HashMap<String, FlyWeightShape> circleMap = new HashMap<>();

    public static FlyWeightShape getCircle(String color){
       FlyWeightCircle circle = (FlyWeightCircle) circleMap.get(color);
       if (circle == null){
           circle = new FlyWeightCircle(color);
           circleMap.put(color,circle);
           System.out.println("Creating circle of color : " + color);
       }
       return circle;
    }
}
