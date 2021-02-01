package com.psq.design.serviceImpl;

import com.psq.design.model.ColdDrink;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:21
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
