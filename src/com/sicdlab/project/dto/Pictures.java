package com.sicdlab.project.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/9.
 */
public class Pictures {
    private  String  pictureID;
    private  String  pictureName;
    private  String  pictureDescrible;
    private  String  pictureURL;
    private  Date    uploadTime;
    private  Boolean picturesShow;
    private  Integer browseNumber;

    //多个照片对应一个相册
    private  Album album;
    //一个照片对应多个评论
    private Set<Comment>  comments=new HashSet<Comment>();

    public String getPictureID() {
        return pictureID;
    }

    public void setPictureID(String pictureID) {
        this.pictureID = pictureID;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureDescrible() {
        return pictureDescrible;
    }

    public void setPictureDescrible(String pictureDescrible) {
        this.pictureDescrible = pictureDescrible;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Boolean getPicturesShow() {
        return picturesShow;
    }

    public void setPicturesShow(Boolean picturesShow) {
        this.picturesShow = picturesShow;
    }

    public Integer getBrowseNumber() {
        return browseNumber;
    }

    public void setBrowseNumber(Integer browseNumber) {
        this.browseNumber = browseNumber;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
