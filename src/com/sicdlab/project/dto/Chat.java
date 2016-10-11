package com.sicdlab.project.dto;

import java.util.Date;

/**
 * Created by maninit on 2016/10/9.
 */
public class Chat {
    private String chatID;
    private String  chatContent;
    private Date chatTime;

    //多个聊天记录表对应一个用户表
    private User user;

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public Date getChatTime() {
        return chatTime;
    }

    public void setChatTime(Date chatTime) {
        this.chatTime = chatTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
