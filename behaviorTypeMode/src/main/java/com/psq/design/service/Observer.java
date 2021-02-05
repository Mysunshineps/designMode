package com.psq.design.service;

import com.psq.design.model.Subject;

/**
 * @Description 观察者模式
 * @Author psq
 * @Date 2021/2/5/10:02
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
