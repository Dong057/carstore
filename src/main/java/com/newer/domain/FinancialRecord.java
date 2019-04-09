package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class FinancialRecord implements Serializable {

    private Integer cyid;//财务ID
    private Integer khid;//客户ID
    private Date sj;//时间
    private double je;//金额
    private String kxlb;//款项类别
    private String dkht;//贷款合同
    private Integer lsph;//流水票号

    public Integer getCyid() {
        return cyid;
    }

    public void setCyid(Integer cyid) {
        this.cyid = cyid;
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

    public double getJe() {
        return je;
    }

    public void setJe(double je) {
        this.je = je;
    }

    public String getKxlb() {
        return kxlb;
    }

    public void setKxlb(String kxlb) {
        this.kxlb = kxlb;
    }

    public String getDkht() {
        return dkht;
    }

    public void setDkht(String dkht) {
        this.dkht = dkht;
    }

    public Integer getLsph() {
        return lsph;
    }

    public void setLsph(Integer lsph) {
        this.lsph = lsph;
    }
}
