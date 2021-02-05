package com.psq.design.model;

/**
 * @Description 备忘录模式
 * @Author psq
 * @Date 2021/2/4/15:57
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memo saveStateToMemento(){
        return new Memo(state);
    }

    public void getStateFromMemento(Memo memo){
        state = memo.getState();
    }

}
