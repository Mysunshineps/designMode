package com.psq.design.service;

import com.psq.design.serviceImpl.Computer;
import com.psq.design.serviceImpl.Keyboard;
import com.psq.design.serviceImpl.Monitor;
import com.psq.design.serviceImpl.Mouse;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/5/17:08
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
