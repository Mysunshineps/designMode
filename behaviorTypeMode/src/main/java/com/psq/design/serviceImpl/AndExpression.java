package com.psq.design.serviceImpl;

import com.psq.design.service.Expression;

/**
 * @Description 解释器模式
 * @Author psq
 * @Date 2021/2/3/16:07
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
