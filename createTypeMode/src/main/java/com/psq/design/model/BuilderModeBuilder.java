package com.psq.design.model;

import com.psq.design.serviceImpl.ChickenBurger;
import com.psq.design.serviceImpl.Coke;
import com.psq.design.serviceImpl.Pepsi;
import com.psq.design.serviceImpl.VegBurger;

/**
 * @Description 建造者模式 builder类负责创建BuilderMode
 * @Author psq
 * @Date 2021/1/28/17:30
 */
public class BuilderModeBuilder {

    public BuilderMode prepareVegMeal(){
        BuilderMode builderMode = new BuilderMode();
        builderMode.addItem(new VegBurger());
        builderMode.addItem(new Coke());
        return builderMode;
    }

    public BuilderMode prepareNonVegMeal(){
        BuilderMode builderMode = new BuilderMode();
        builderMode.addItem(new ChickenBurger());
        builderMode.addItem(new Pepsi());
        return builderMode;
    }

    public BuilderMode prepareVegMeal2(){
        BuilderMode builderMode = new BuilderMode();
        builderMode.addItem(new VegBurger());
        builderMode.addItem(new Pepsi());
        return builderMode;
    }

    public BuilderMode prepareNonVegMeal2(){
        BuilderMode builderMode = new BuilderMode();
        builderMode.addItem(new ChickenBurger());
        builderMode.addItem(new Coke());
        return builderMode;
    }
}
