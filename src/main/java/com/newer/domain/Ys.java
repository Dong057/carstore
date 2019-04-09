package com.newer.domain;

import java.io.Serializable;

public class Ys implements Serializable {

    private Integer ysid;//颜色id
    private String ys;//颜色

    public Integer getYsid() {
        return ysid;
    }

    public void setYsid(Integer ysid) {
        this.ysid = ysid;
    }

    public String getYs() {
        return ys;
    }

    public void setYs(String ys) {
        this.ys = ys;
    }
}
