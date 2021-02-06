package com.psq.design.serviceImpl;

import com.psq.design.service.Game;

/**
 * @Description 模板模式
 * @Author psq
 * @Date 2021/2/5/15:33
 */
public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
