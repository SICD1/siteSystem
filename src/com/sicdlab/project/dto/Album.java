package com.sicdlab.project.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/11.
 */
public class Album {
    private  String albumID;
    private  String albumClassfyName;
    private  Date   albumCreateTime;
    //多个相册对应一个用户
    private User user;
    //一个相册对应多个照片
    private Set<Pictures> pictures=new HashSet<Pictures>();

    public String getAlbumID() {
        return albumID;
    }

    public void setAlbumID(String albumID) {
        this.albumID = albumID;
    }

    public String getAlbumClassfyName() {
        return albumClassfyName;
    }

    public void setAlbumClassfyName(String albumClassfyName) {
        this.albumClassfyName = albumClassfyName;
    }

    public Date getAlbumCreateTime() {
        return albumCreateTime;
    }

    public void setAlbumCreateTime(Date albumCreateTime) {
        this.albumCreateTime = albumCreateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Pictures> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Pictures> pictures) {
        this.pictures = pictures;
    }
}
