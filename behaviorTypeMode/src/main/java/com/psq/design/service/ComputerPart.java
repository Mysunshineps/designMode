package com.psq.design.service;

/**
 * @Description 访问者模式
 * @Author psq
 * @Date 2021/2/5/16:10
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
