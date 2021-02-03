package com.psq.design.controller;

import com.psq.design.model.Broker;
import com.psq.design.serviceImpl.BuyStock;
import com.psq.design.serviceImpl.SellStock;
import com.psq.design.serviceImpl.Stock;

/**
 * @Description 命令模式 客户端
 * @Author psq
 * @Date 2021/2/3/15:03
 */
public class CommandModeController {

    /**
     * 优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。
     * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
     *
     * 使用场景：认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
     * 注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
     * @param args
     */
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }

}
