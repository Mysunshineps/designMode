package com.psq.design.serviceImpl;

import com.psq.design.service.Expression;

/**
 * @Description 解释器模式
 * @Author psq
 * @Date 2021/2/3/16:02
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
