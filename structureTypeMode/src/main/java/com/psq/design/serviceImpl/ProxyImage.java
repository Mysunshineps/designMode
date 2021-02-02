package com.psq.design.serviceImpl;

import com.psq.design.service.Image;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/2/17:02
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void disPlay() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.disPlay();
    }
}
