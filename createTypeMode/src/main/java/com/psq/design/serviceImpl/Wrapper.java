package com.psq.design.serviceImpl;

import com.psq.design.service.Packing;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:12
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        //Wrapper：包装纸
        return "Wrapper";
    }
}
