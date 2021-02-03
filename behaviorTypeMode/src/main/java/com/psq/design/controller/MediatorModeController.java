package com.psq.design.controller;

import com.psq.design.model.User;

/**
 * @Description 中介者模式 客户端
 * @Author psq
 * @Date 2021/2/3/17:18
 */
public class MediatorModeController {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello！ Robert!");
    }
}
