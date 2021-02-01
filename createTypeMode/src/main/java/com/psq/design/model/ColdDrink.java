package com.psq.design.model;

import com.psq.design.service.BuilderModeService;
import com.psq.design.service.Packing;
import com.psq.design.serviceImpl.Bottle;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:17
 */
public abstract class ColdDrink implements BuilderModeService {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
