package com.sicdlab.project.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/9.
 */
public class Role {
    private  String roleID;
    private  String roleName;
    //一个角色表对应一个用户表
    private User user;
    //一个角色表对应多个角色中间表
    private Set<Role_Privilege>  role_privileges= new HashSet<Role_Privilege>();


    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Role_Privilege> getRole_privileges() {
        return role_privileges;
    }

    public void setRole_privileges(Set<Role_Privilege> role_privileges) {
        this.role_privileges = role_privileges;
    }
}
