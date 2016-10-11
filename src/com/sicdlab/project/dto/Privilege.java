package com.sicdlab.project.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by maninit on 2016/10/11.
 */
public class Privilege {
    private String privilegeID;
    private String privilegeType;

    //一个权限表对应多个角色权限中间表
    private Set<Role_Privilege>  role_privileges= new HashSet<Role_Privilege>();
    public String getPrivilegeID() {
        return privilegeID;
    }

    public void setPrivilegeID(String privilegeID) {
        this.privilegeID = privilegeID;
    }

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public Set<Role_Privilege> getRole_privileges() {
        return role_privileges;
    }

    public void setRole_privileges(Set<Role_Privilege> role_privileges) {
        this.role_privileges = role_privileges;
    }
}
