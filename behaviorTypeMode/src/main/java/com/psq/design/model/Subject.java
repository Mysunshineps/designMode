package com.psq.design.model;

import com.psq.design.service.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 观察者模式
 * @Author psq
 * @Date 2021/2/5/10:01
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    //通知观察者
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
