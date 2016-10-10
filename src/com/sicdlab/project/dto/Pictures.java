package com.sicdlab.project.dto;

import java.util.Date;

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
}
