package com.psq.design.serviceImpl;

import com.psq.design.service.ComputerPart;
import com.psq.design.service.ComputerPartVisitor;

/**
 * @Description 访问者模式
 * @Author psq
 * @Date 2021/2/5/16:12
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
