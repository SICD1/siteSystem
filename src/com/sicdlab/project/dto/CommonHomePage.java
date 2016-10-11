package com.sicdlab.project.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/9.
 */
public class CommonHomePage {
    private   String homePageID;
    private   String homePageName;
    private   String homePageDescrible;
    private   String homePageURL;
    //多个公共主页表对应一个用户
    public User user;


    public String getHomePageID() {
        return homePageID;
    }

    public void setHomePageID(String homePageID) {
        this.homePageID = homePageID;
    }

    public String getHomePageName() {
        return homePageName;
    }

    public void setHomePageName(String homePageName) {
        this.homePageName = homePageName;
    }

    public String getHomePageDescrible() {
        return homePageDescrible;
    }

    public void setHomePageDescrible(String homePageDescrible) {
        this.homePageDescrible = homePageDescrible;
    }

    public String getHomePageURL() {
        return homePageURL;
    }

    public void setHomePageURL(String homePageURL) {
        this.homePageURL = homePageURL;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
