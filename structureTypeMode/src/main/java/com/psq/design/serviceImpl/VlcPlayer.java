package com.psq.design.serviceImpl;

import com.psq.design.service.AdvancedMediaPlayer;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/1/15:08
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name："+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
