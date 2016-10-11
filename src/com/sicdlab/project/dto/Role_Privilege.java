package com.sicdlab.project.dto;

/**
 * Created by maninit on 2016/10/11.
 */
public class Role_Privilege {
    private String role_privilegeID;
    //多个个角色权限表对应一个角色表
    private Role role;
    //多个个角色权限表对应一个权限表
    private Privilege privilege;

    public String getRole_privilegeID() {
        return role_privilegeID;
    }

    public void setRole_privilegeID(String role_privilegeID) {
        this.role_privilegeID = role_privilegeID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }
}
