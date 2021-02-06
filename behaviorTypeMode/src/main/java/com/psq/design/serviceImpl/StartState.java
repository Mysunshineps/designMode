package com.psq.design.serviceImpl;

import com.psq.design.model.Context;
import com.psq.design.service.State;

/**
 * @Description 状态模式
 * @Author psq
 * @Date 2021/2/5/14:31
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
