package com.sicdlab.project.dto;

import java.util.Date;

/**
 * Created by maninit on 2016/10/9.
 */
public class Browse {
    private String browseID;
    private String browseContent;
    private Date browseTime;
    private String browseURL;

    public String getBrowseID() {
        return browseID;
    }

    public void setBrowseID(String browseID) {
        this.browseID = browseID;
    }

    public String getBrowseContent() {
        return browseContent;
    }

    public void setBrowseContent(String browseContent) {
        this.browseContent = browseContent;
    }

    public Date getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Date browseTime) {
        this.browseTime = browseTime;
    }

    public String getBrowseURL() {
        return browseURL;
    }

    public void setBrowseURL(String browseURL) {
        this.browseURL = browseURL;
    }
}
