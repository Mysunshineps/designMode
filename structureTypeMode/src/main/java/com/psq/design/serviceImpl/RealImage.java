package com.psq.design.serviceImpl;

import com.psq.design.service.Image;

/**
 * @Description
 * @Author psq
 * @Date 2021/2/2/17:00
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void disPlay() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
