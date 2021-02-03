package com.psq.design.model;

/**
 * @Description 中介者模式
 * @Author psq
 * @Date 2021/2/3/17:14
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
