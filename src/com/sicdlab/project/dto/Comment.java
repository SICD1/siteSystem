package com.sicdlab.project.dto;

import java.util.Date;

/**
 * Created by maninit on 2016/10/9.
 */
public class Comment {
    private  String   commentID;
    private  Date     commentTime;
    private  String   commentContent;
    private  String   parentID;
    private  Integer  commentPraiseNumber;
    //多个评论对应一个用户
    private User user;
    //多个评论对应一个博客
    private Blog blog;
    //多个评论对应一个照片
    private Pictures picture;
    // 多个评论对应一个新鲜事
    private Novelty novelty;

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public Integer getCommentPraiseNumber() {
        return commentPraiseNumber;
    }

    public void setCommentPraiseNumber(Integer commentPraiseNumber) {
        this.commentPraiseNumber = commentPraiseNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Pictures getPicture() {
        return picture;
    }

    public void setPicture(Pictures picture) {
        this.picture = picture;
    }

    public Novelty getNovelty() {
        return novelty;
    }

    public void setNovelty(Novelty novelty) {
        this.novelty = novelty;
    }
}
