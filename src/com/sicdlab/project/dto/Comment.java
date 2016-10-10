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
}
