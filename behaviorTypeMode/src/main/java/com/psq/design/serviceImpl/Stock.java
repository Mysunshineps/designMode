package com.psq.design.serviceImpl;

/**
 * @Description 命令模式 请求类
 * @Author psq
 * @Date 2021/2/3/14:42
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void bug(){
        System.out.println("Stock [ Name: "+name+",Quantity: "+quantity+" ] buy");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: "+quantity+" ] sell");
    }

}
