package com.sicdlab.project.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/9.
 */
public class Friends {
    private String  friendID;
    private Date friendsTime;
    //多个好友对应一个用户
    private  User  user;


    public String getFriendID() {
        return friendID;
    }

    public void setFriendID(String friendID) {
        this.friendID = friendID;
    }

    public Date getFriendsTime() {
        return friendsTime;
    }

    public void setFriendsTime(Date friendsTime) {
        this.friendsTime = friendsTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
