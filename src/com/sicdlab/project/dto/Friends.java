package com.sicdlab.project.dto;

import java.util.Date;

/**
 * Created by maninit on 2016/10/9.
 */
public class Friends {
    private String  friendID;
    private Date friendsTime;

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
}
