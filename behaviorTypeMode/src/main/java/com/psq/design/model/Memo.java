package com.psq.design.model;

/**
 * @Description 备忘录模式
 * @Author psq
 * @Date 2021/2/4/15:55
 */
public class Memo {
    private String state;

    public Memo(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
