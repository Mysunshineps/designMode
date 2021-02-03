package com.psq.design.service;

/**
 * @Description 解释器模式
 * @Author psq
 * @Date 2021/2/3/15:59
 */
public interface Expression {
    public boolean interpret(String context);
}
