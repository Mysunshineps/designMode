package com.psq.design.controller;

import com.psq.design.model.StrategyMode;
import com.psq.design.service.StrategyModeService;
import com.psq.design.serviceImpl.StrategyModeServiceImplV1;
import com.psq.design.serviceImpl.StrategyModeServiceImplV2;

/**
 * @Description 策略设计模式 客户端
 * @Author psq
 * @Date 2021/1/26/14:33
 */
public class StrategyModeController {

    /**
     *    策略设计模式一般实现步骤如下：
     *     a、编写策略接口
     *     b、编写策略实现类
     *     c、编写策略执行上下文，一般这个类持有一个策略接口属性，通过构造函数为其赋值，并且该类有一个主要的入口函数，该函数有很多个操作步骤，其中某一个步骤要使用算法（也就是接口方法）。
     *     d、客户端在使用的时候，首先使用策略执行上下文这个类的构造函数传入策略实现类，接着调用策略执行上下文这个类的主要入口函数，就可以执行到算法。通过构造函数传入不同的策略实现类，就可以更换程序的算法逻辑。
     *
     *     优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
     *     缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露(策略设计模式缺点就是客户端需要知道所有的策略实现类)。
     *
     *     使用场景： 1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。 2、一个系统需要动态地在几种算法中选择一种。 3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
     *     注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
     * @param args
     */
    public static void main(String[] args){
        StrategyModeService serviceImplV1 = new StrategyModeServiceImplV1();
        StrategyMode strategyMode1 = new StrategyMode(serviceImplV1);
        strategyMode1.execute();

        StrategyModeService serviceImplV2 = new StrategyModeServiceImplV2();
        StrategyMode strategyMode2 = new StrategyMode(serviceImplV2);
        strategyMode2.execute();

    }
}
