package com.psq.design.serviceImpl;

import com.psq.design.service.Game;

/**
 * @Description 模板模式
 * @Author psq
 * @Date 2021/2/5/15:21
 */
public class Cricket extends Game {

    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
