package com.psq.design.serviceImpl;

import com.psq.design.service.AdvancedMediaPlayer;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/1/15:10
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name："+ fileName);
    }
}
