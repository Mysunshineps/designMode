package com.psq.design.model;

import com.psq.design.service.StrategyModeService;

/**
 * @Description 策略设计模式 执行上下文
 * 说明：策略模式定义了一系列的算法，并将每一个算法封装起来，而且使他们可以相互替换，让算法独立于使用它的客户而独立变化。
 * 其实策略设计模式实际上就是定义一个接口，只要实现该接口，并对接口的方法进行实现，那么不同的实现类就完成了不同的算法逻辑，而使用该接口的地方，则可以根据需要随意更改实现类，因为它们的接口是一样的。
 * @Author psq
 * @Date 2021/1/26/14:50
 */
public class StrategyMode {
    private StrategyModeService strategyModeService;

    public StrategyMode(StrategyModeService strategyModeService) {
        this.strategyModeService = strategyModeService;
    }

    public void execute(){
        System.out.println("开始------");

        String result = strategyModeService.run();
        System.out.println(result);

        System.out.println("结束------");
    }
}
