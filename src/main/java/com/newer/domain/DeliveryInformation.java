package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class DeliveryInformation implements Serializable {

    private Integer jcid;//交车ID
    private Integer khid;//客户ID
    private Date sj;//时间
    private Integer empno;//经手人id
    private String jqkx;//结清款项
    private String pzqk;//牌照情况

    public Integer getJcid() {
        return jcid;
    }

    public void setJcid(Integer jcid) {
        this.jcid = jcid;
    }

    public Integer getKhid() {
        return khid;
    }

    public void setKhid(Integer khid) {
        this.khid = khid;
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getJqkx() {
        return jqkx;
    }

    public void setJqkx(String jqkx) {
        this.jqkx = jqkx;
    }

    public String getPzqk() {
        return pzqk;
    }

    public void setPzqk(String pzqk) {
        this.pzqk = pzqk;
    }
}
