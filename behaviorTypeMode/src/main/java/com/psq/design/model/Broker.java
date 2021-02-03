package com.psq.design.model;

import com.psq.design.service.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 命令模式 命令调用类
 * @Author psq
 * @Date 2021/2/3/14:57
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
