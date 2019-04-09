package com.newer.domain;

import java.io.Serializable;

public class Clxx implements Serializable {

    private Integer clid;//车辆ID
    private String clxh;//车辆型号
    private String pp;//牌照

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }
}
