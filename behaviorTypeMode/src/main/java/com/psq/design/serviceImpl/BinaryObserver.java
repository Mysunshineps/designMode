package com.psq.design.serviceImpl;

import com.psq.design.model.Subject;
import com.psq.design.service.Observer;

/**
 * @Description 观察者模式
 * @Author psq
 * @Date 2021/2/5/10:09
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
