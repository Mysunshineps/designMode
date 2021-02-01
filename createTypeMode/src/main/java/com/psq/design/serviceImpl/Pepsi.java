package com.psq.design.serviceImpl;

import com.psq.design.model.ColdDrink;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:21
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
