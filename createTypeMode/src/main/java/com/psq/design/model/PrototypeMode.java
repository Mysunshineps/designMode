package com.psq.design.model;

import com.psq.design.service.PrototypeModeService;
import com.psq.design.serviceImpl.Rectangle;
import com.psq.design.serviceImpl.Square;

import java.util.Hashtable;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/29/15:41
 */
public class PrototypeMode {

    private static Hashtable<String, PrototypeModeService> shapeMape = new Hashtable<>();

    public static PrototypeModeService getShape(String shapeId){
        PrototypeModeService prototypeModeService = shapeMape.get(shapeId);
        return (PrototypeModeService) prototypeModeService.clone();
    }

    public static void loadCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMape.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("2");
        shapeMape.put(square.getId(),square);
    }

}
