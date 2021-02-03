package com.psq.design.serviceImpl;

import com.psq.design.service.AbstractLogger;

/**
 * @Description 责任链模式
 * @Author psq
 * @Date 2021/2/3/9:31
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger: " + message);
    }
}

