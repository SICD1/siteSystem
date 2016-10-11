package com.sicdlab.project.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/9.
 */
public class User {
    private String userID;
    private String userName;
    private String password;
    private String telephone;
    private String email;
    private Date birthday;
    private Integer sex;
    private String  homePageURL;
    private String  Domainhacks;
    private String  headSculpture;
    private String coverURL;
    private String recievePoints;
  //一个用户对应多个好友
  private Set<Friends> friends=new HashSet<Friends>();
  //一个用户对应多个相册
  private Set<Album> albums=new HashSet<Album>();
  //一个用户可以对应多个博客
  private Set<Blog>  blogs=new HashSet<Blog>();
  //一个用户可以发表多个评论
  private Set<Comment> comments=new HashSet<Comment>();
  //一个用户可以多处留言
  private Set<Leave> leaves=new HashSet<Leave>();
  //一个用户可以发表多个新鲜事
  private Set<Novelty> noveltys=new HashSet<Novelty>();
  //一个用户可以访问多个公共主页
  private  Set<CommonHomePage> commonHomePages=new HashSet<CommonHomePage>();
  //多个用户对应一个角色
  private Role role;
  //一个用户对应多个聊天记录
  private Set<Chat> chats=new HashSet<Chat>();
  //一个用户对应多个浏览记录
  private Set<Browse>  browse=new HashSet<Browse>();


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHomePageURL() {
        return homePageURL;
    }

    public void setHomePageURL(String homePageURL) {
        this.homePageURL = homePageURL;
    }

    public String getDomainhacks() {
        return Domainhacks;
    }

    public void setDomainhacks(String domainhacks) {
        Domainhacks = domainhacks;
    }

    public String getHeadSculpture() {
        return headSculpture;
    }

    public void setHeadSculpture(String headSculpture) {
        this.headSculpture = headSculpture;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }

    public String getRecievePoints() {
        return recievePoints;
    }

    public void setRecievePoints(String recievePoints) {
        this.recievePoints = recievePoints;
    }


    public Set<Friends> getFriends() {
        return friends;
    }

    public void setFriends(Set<Friends> friends) {
        this.friends = friends;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    public Set<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Leave> getLeaves() {
        return leaves;
    }

    public void setLeaves(Set<Leave> leaves) {
        this.leaves = leaves;
    }

    public Set<Novelty> getNoveltys() {
        return noveltys;
    }

    public void setNoveltys(Set<Novelty> noveltys) {
        this.noveltys = noveltys;
    }

    public Set<CommonHomePage> getCommonHomePages() {
        return commonHomePages;
    }

    public void setCommonHomePages(Set<CommonHomePage> commonHomePages) {
        this.commonHomePages = commonHomePages;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Chat> getChats() {
        return chats;
    }

    public void setChats(Set<Chat> chats) {
        this.chats = chats;
    }

    public Set<Browse> getBrowse() {
        return browse;
    }

    public void setBrowse(Set<Browse> browse) {
        this.browse = browse;
    }
}
