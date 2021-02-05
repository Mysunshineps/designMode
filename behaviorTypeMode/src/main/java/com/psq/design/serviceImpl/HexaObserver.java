package com.psq.design.serviceImpl;

import com.psq.design.model.Subject;
import com.psq.design.service.Observer;

/**
 * @Description 观察者模式
 * @Author psq
 * @Date 2021/2/5/10:20
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
