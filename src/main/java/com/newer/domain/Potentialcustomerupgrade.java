package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Potentialcustomerupgrade implements Serializable {
    private Integer potentialcustomerupgradeid;//升级id
    private Potentialcustomer potentialcustomer;//客户id
    private Date upgradedate;//升级日期
    private String upgradedlevel;//升级前等级
    private String upgradelevel;//升级后等级
    private Emp emp;//操作员
    private String text;//备注

    public Integer getPotentialcustomerupgradeid() {
        return potentialcustomerupgradeid;
    }

    public void setPotentialcustomerupgradeid(Integer potentialcustomerupgradeid) {
        this.potentialcustomerupgradeid = potentialcustomerupgradeid;
    }

    public Potentialcustomer getPotentialcustomer() {
        return potentialcustomer;
    }

    public void setPotentialcustomer(Potentialcustomer potentialcustomer) {
        this.potentialcustomer = potentialcustomer;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
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



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Potentialcustomerupgrade(Integer potentialcustomerupgradeid, Potentialcustomer potentialcustomer, Date upgradedate, String upgradedlevel, String upgradelevel, Emp emp, String text) {
        this.potentialcustomerupgradeid = potentialcustomerupgradeid;
        this.potentialcustomer = potentialcustomer;
        this.upgradedate = upgradedate;
        this.upgradedlevel = upgradedlevel;
        this.upgradelevel = upgradelevel;
        this.emp = emp;
        this.text = text;
    }

    public Potentialcustomerupgrade() {

    }
}
