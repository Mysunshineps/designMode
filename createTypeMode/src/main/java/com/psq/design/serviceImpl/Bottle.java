package com.psq.design.serviceImpl;

import com.psq.design.service.Packing;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:13
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        //Bottle：瓶
        return "Bottle";
    }
}
