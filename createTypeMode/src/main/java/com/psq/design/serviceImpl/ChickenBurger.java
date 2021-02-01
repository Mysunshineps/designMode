package com.psq.design.serviceImpl;

import com.psq.design.model.Burger;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:19
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
