package com.sicdlab.project.dto;

import java.util.Date;

/**
 * Created by maninit on 2016/10/9.
 */
public class Leave {
    private String leaveID;
    private String leaveContent;
    private Date   leaveTime;
    private Boolean leaveShow;

    public String getLeaveID() {
        return leaveID;
    }

    public void setLeaveID(String leaveID) {
        this.leaveID = leaveID;
    }

    public String getLeaveContent() {
        return leaveContent;
    }

    public void setLeaveContent(String leaveContent) {
        this.leaveContent = leaveContent;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Boolean getLeaveShow() {
        return leaveShow;
    }

    public void setLeaveShow(Boolean leaveShow) {
        this.leaveShow = leaveShow;
    }
}
