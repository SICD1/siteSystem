package com.sicdlab.project.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/9.
 */
public class Novelty {
    private  String  noveltyID;
    private  String  noveltyContent;
    private  Date    noveltyTime;
    private  String  noveltyPictureURL;
    private  String  noveltyHref;
    private  Boolean noveltyShow;
    private  Integer noveltyPraiseNumber;
    private  Integer noveltyForwardNumber;
    private  Integer noveltyReadNumber;
    private  Integer noveltyCommentNumber;
    private  Integer noveltyShareNumber;
    //多个新鲜事对应一个用户
    private  User user;
    //一个新鲜事对应多个评论
    private Set<Comment> comments= new HashSet<Comment>();


    public String getNoveltyID() {
        return noveltyID;
    }

    public void setNoveltyID(String noveltyID) {
        this.noveltyID = noveltyID;
    }

    public String getNoveltyContent() {
        return noveltyContent;
    }

    public void setNoveltyContent(String noveltyContent) {
        this.noveltyContent = noveltyContent;
    }

    public Date getNoveltyTime() {
        return noveltyTime;
    }

    public void setNoveltyTime(Date noveltyTime) {
        this.noveltyTime = noveltyTime;
    }

    public String getNoveltyPictureURL() {
        return noveltyPictureURL;
    }

    public void setNoveltyPictureURL(String noveltyPictureURL) {
        this.noveltyPictureURL = noveltyPictureURL;
    }

    public String getNoveltyHref() {
        return noveltyHref;
    }

    public void setNoveltyHref(String noveltyHref) {
        this.noveltyHref = noveltyHref;
    }

    public Boolean getNoveltyShow() {
        return noveltyShow;
    }

    public void setNoveltyShow(Boolean noveltyShow) {
        this.noveltyShow = noveltyShow;
    }

    public Integer getNoveltyPraiseNumber() {
        return noveltyPraiseNumber;
    }

    public void setNoveltyPraiseNumber(Integer noveltyPraiseNumber) {
        this.noveltyPraiseNumber = noveltyPraiseNumber;
    }

    public Integer getNoveltyForwardNumber() {
        return noveltyForwardNumber;
    }

    public void setNoveltyForwardNumber(Integer noveltyForwardNumber) {
        this.noveltyForwardNumber = noveltyForwardNumber;
    }

    public Integer getNoveltyReadNumber() {
        return noveltyReadNumber;
    }

    public void setNoveltyReadNumber(Integer noveltyReadNumber) {
        this.noveltyReadNumber = noveltyReadNumber;
    }

    public Integer getNoveltyCommentNumber() {
        return noveltyCommentNumber;
    }

    public void setNoveltyCommentNumber(Integer noveltyCommentNumber) {
        this.noveltyCommentNumber = noveltyCommentNumber;
    }

    public Integer getNoveltyShareNumber() {
        return noveltyShareNumber;
    }

    public void setNoveltyShareNumber(Integer noveltyShareNumber) {
        this.noveltyShareNumber = noveltyShareNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
