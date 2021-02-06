package com.psq.design.serviceImpl;

import com.psq.design.service.ComputerPart;
import com.psq.design.service.ComputerPartVisitor;

/**
 * @Description 访问者模式
 * @Author psq
 * @Date 2021/2/5/16:15
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
