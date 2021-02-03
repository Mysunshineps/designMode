package com.psq.design.serviceImpl;

import com.psq.design.service.Order;

/**
 * @Description 命令模式
 * @Author psq
 * @Date 2021/2/3/14:54
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.bug();
    }
}
