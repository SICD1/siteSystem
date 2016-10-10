package com.sicdlab.project.dto;

import java.util.Date;

/**
 * Created by maninit on 2016/10/9.
 */
public class Blog {
    private  String   blogID;
    private  String   blogTitle;
    private  String   blogContent;
    private  Date     blogTime;
    private  Integer  praiseNumber;
    private  Integer  commentNumber;
    private  Integer  forwardNumber;
    private  Integer  shareNumber;
    private  Boolean  blogShow;
    private  String   blogClassifyName;

    public String getBlogID() {
        return blogID;
    }

    public void setBlogID(String blogID) {
        this.blogID = blogID;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Date getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(Date blogTime) {
        this.blogTime = blogTime;
    }

    public Integer getPraiseNumber() {
        return praiseNumber;
    }

    public void setPraiseNumber(Integer praiseNumber) {
        this.praiseNumber = praiseNumber;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public Integer getForwardNumber() {
        return forwardNumber;
    }

    public void setForwardNumber(Integer forwardNumber) {
        this.forwardNumber = forwardNumber;
    }

    public Integer getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(Integer shareNumber) {
        this.shareNumber = shareNumber;
    }

    public Boolean getBlogShow() {
        return blogShow;
    }

    public void setBlogShow(Boolean blogShow) {
        this.blogShow = blogShow;
    }

    public String getBlogClassifyName() {
        return blogClassifyName;
    }

    public void setBlogClassifyName(String blogClassifyName) {
        this.blogClassifyName = blogClassifyName;
    }
}
