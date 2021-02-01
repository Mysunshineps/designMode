package com.psq.design.model;

import com.psq.design.service.BuilderModeService;
import com.psq.design.service.Packing;
import com.psq.design.serviceImpl.Wrapper;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:15
 */
public abstract class Burger implements BuilderModeService {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
