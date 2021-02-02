package com.psq.design.model;

import com.psq.design.service.MediaPlayer;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/1/15:40
 */
public class AudioPlayer implements MediaPlayer {
    //适配器
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name："+fileName);
        }else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid media. "+audioType + " format not supported");
        }
    }
}
