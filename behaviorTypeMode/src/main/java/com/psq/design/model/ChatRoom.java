package com.psq.design.model;

import java.util.Date;

/**
 * @Description 中介者模式 中介类
 * @Author psq
 * @Date 2021/2/3/17:13
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] " + message);
    }
}
