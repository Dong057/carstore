package com.newer.domain;

import java.io.Serializable;

public class clxx implements Serializable {

    private Integer clid;
    private String clxh;
    private String pp;

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
