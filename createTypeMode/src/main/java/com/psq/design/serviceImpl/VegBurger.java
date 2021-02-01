package com.psq.design.serviceImpl;

import com.psq.design.model.Burger;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:19
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
