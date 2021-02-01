package com.psq.design.controller;

import com.psq.design.model.BuilderMode;
import com.psq.design.model.BuilderModeBuilder;

/**
 * @Description 建造者模式 客户端
 * @Author psq
 * @Date 2021/1/28/17:33
 */
public class BuilderModeController {
    /**
     * 优点： 1、建造者BuilderModeBuilder独立，易扩展。 2、便于控制细节风险。
     * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
     *
     * 使用场景： 1、需要生成的对象具有复杂的内部结构。 2、需要生成的对象内部属性本身相互依赖。
     * 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
     * @param args
     */
    public static void main(String[] args){
        BuilderModeBuilder builder = new BuilderModeBuilder();
        BuilderMode vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        BuilderMode nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

        BuilderMode vegMeal2 = builder.prepareVegMeal2();
        System.out.println("Veg Meal2");
        vegMeal2.showItems();
        System.out.println("Total Cost: " +vegMeal2.getCost());

        BuilderMode nonVegMeal2 = builder.prepareNonVegMeal2();
        System.out.println("Non-Veg2 Meal");
        nonVegMeal2.showItems();
        System.out.println("Total Cost: " +nonVegMeal2.getCost());
    }
}
