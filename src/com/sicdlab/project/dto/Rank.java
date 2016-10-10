package com.sicdlab.project.dto;

/**
 * Created by maninit on 2016/10/9.
 */
public class Rank {
    private String  rankID;
    private String  rankName;
    private String  rankClassName;
    private String  points;

    public String getRankID() {
        return rankID;
    }

    public void setRankID(String rankID) {
        this.rankID = rankID;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getRankClassName() {
        return rankClassName;
    }

    public void setRankClassName(String rankClassName) {
        this.rankClassName = rankClassName;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
