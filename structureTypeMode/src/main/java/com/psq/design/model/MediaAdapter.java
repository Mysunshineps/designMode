package com.psq.design.model;


import com.psq.design.service.AdvancedMediaPlayer;
import com.psq.design.service.MediaPlayer;
import com.psq.design.serviceImpl.Mp4Player;
import com.psq.design.serviceImpl.VlcPlayer;

/**
 * @Description MediaPlayer接口的适配器
 * @Author psq
 * @Date 2021/2/1/15:24
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
