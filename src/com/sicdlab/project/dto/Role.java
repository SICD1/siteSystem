package com.sicdlab.project.dto;

/**
 * Created by maninit on 2016/10/9.
 */
public class Role {
    private  String roleID;
    private  String commonUser;
    private  String VIP;

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getCommonUser() {
        return commonUser;
    }

    public void setCommonUser(String commonUser) {
        this.commonUser = commonUser;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }
}
