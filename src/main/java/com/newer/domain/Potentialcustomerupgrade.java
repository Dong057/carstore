package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Potentialcustomerupgrade implements Serializable {
    private Integer potentialcustomerupgradeid;//升级id
    private Integer potentialcustomerid;//客户id
    private Date upgradedate;//升级日期
    private String upgradedlevel;//升级前等级
    private String upgradelevel;//升级后等级
    private Integer empid;//操作员
    private String text;//备注

    public Integer getPotentialcustomerupgradeid() {
        return potentialcustomerupgradeid;
    }

    public void setPotentialcustomerupgradeid(Integer potentialcustomerupgradeid) {
        this.potentialcustomerupgradeid = potentialcustomerupgradeid;
    }

    public Integer getPotentialcustomerid() {
        return potentialcustomerid;
    }

    public void setPotentialcustomerid(Integer potentialcustomerid) {
        this.potentialcustomerid = potentialcustomerid;
    }

    public Date getUpgradedate() {
        return upgradedate;
    }

    public void setUpgradedate(Date upgradedate) {
        this.upgradedate = upgradedate;
    }

    public String getUpgradedlevel() {
        return upgradedlevel;
    }

    public void setUpgradedlevel(String upgradedlevel) {
        this.upgradedlevel = upgradedlevel;
    }

    public String getUpgradelevel() {
        return upgradelevel;
    }

    public void setUpgradelevel(String upgradelevel) {
        this.upgradelevel = upgradelevel;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Potentialcustomerupgrade(Integer potentialcustomerupgradeid, Integer potentialcustomerid, Date upgradedate, String upgradedlevel, String upgradelevel, Integer empid, String text) {

        this.potentialcustomerupgradeid = potentialcustomerupgradeid;
        this.potentialcustomerid = potentialcustomerid;
        this.upgradedate = upgradedate;
        this.upgradedlevel = upgradedlevel;
        this.upgradelevel = upgradelevel;
        this.empid = empid;
        this.text = text;
    }

    public Potentialcustomerupgrade() {

    }
}
