package com.psq.design.model;

import com.psq.design.service.State;

/**
 * @Description 状态模式
 * @Author psq
 * @Date 2021/2/5/14:30
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
