package com.psq.design.service;

/**
 * @Description 模板模式
 * @Author psq
 * @Date 2021/2/5/15:20
 */
public abstract class Game {
    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    /**
     * 模板方法设置为 final，这样它就不会被重写
     */
    public final void play(){
        initialize();

        startPlay();

        endPlay();
    }

}
