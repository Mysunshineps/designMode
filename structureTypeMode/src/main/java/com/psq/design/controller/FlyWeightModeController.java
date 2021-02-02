package com.psq.design.controller;

import com.psq.design.model.FlyWeightShapeFactory;
import com.psq.design.serviceImpl.FlyWeightCircle;

/**
 * @Description 享元模式 客户端
 * @Author psq
 * @Date 2021/2/2/16:43
 */
public class FlyWeightModeController {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    /**
     * 优点：大大减少对象的创建，降低系统的内存，使效率提高。
     * 缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
     *
     * 使用场景： 1、系统有大量相似对象。 2、需要缓冲池的场景。
     * 注意事项： 1、注意划分外部状态和内部状态，否则可能会引起线程安全问题。 2、这些类必须有一个工厂对象加以控制。
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
             FlyWeightCircle flyWeightCircle = (FlyWeightCircle)FlyWeightShapeFactory.getCircle(getRandomColor());
            flyWeightCircle.setX(getRandomX());
            flyWeightCircle.setY(getRandomY());
            flyWeightCircle.setRadius(100);
            flyWeightCircle.draw();
        }

    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
