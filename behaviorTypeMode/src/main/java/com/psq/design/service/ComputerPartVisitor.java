package com.psq.design.service;

import com.psq.design.serviceImpl.Computer;
import com.psq.design.serviceImpl.Keyboard;
import com.psq.design.serviceImpl.Monitor;
import com.psq.design.serviceImpl.Mouse;

/**
 * @Description 访问者模式
 * @Author psq
 * @Date 2021/2/5/16:11
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
