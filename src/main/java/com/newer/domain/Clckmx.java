package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Clckmx implements Serializable {

    private Integer ckdbh;//出库单编号
    private Integer cgsq;//采购申请单id
    private String sqr;//申请人
    private Date  sqrq;//申请日期
    private String shr;//审核人
    private Date shrq;//审核日期
    private Integer ddbh;//订单编号
    private String ckr; //出库人
    private Date ckrq;//出库日期
    private String khmc;//客户名称
    private String sfbp;//是否包牌
    private String djzt;//单据状态
    private String hgzh;//合格证号
    private String cjh;//车架号
    private String fdjh;//发动机号


    public Integer getCkdbh() {
        return ckdbh;
    }

    public void setCkdbh(Integer ckdbh) {
        this.ckdbh = ckdbh;
    }

    public Integer getCgsq() {
        return cgsq;
    }

    public void setCgsq(Integer cgsq) {
        this.cgsq = cgsq;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public Date getSqrq() {
        return sqrq;
    }

    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public Date getShrq() {
        return shrq;
    }

    public void setShrq(Date shrq) {
        this.shrq = shrq;
    }

    public Integer getDdbh() {
        return ddbh;
    }

    public void setDdbh(Integer ddbh) {
        this.ddbh = ddbh;
    }

    public String getCkr() {
        return ckr;
    }

    public void setCkr(String ckr) {
        this.ckr = ckr;
    }

    public Date getCkrq() {
        return ckrq;
    }

    public void setCkrq(Date ckrq) {
        this.ckrq = ckrq;
    }

    public String getKhmc() {
        return khmc;
    }

    public void setKhmc(String khmc) {
        this.khmc = khmc;
    }

    public String getSfbp() {
        return sfbp;
    }

    public void setSfbp(String sfbp) {
        this.sfbp = sfbp;
    }

    public String getDjzt() {
        return djzt;
    }

    public void setDjzt(String djzt) {
        this.djzt = djzt;
    }

    public String getHgzh() {
        return hgzh;
    }

    public void setHgzh(String hgzh) {
        this.hgzh = hgzh;
    }

    public String getCjh() {
        return cjh;
    }

    public void setCjh(String cjh) {
        this.cjh = cjh;
    }

    public String getFdjh() {
        return fdjh;
    }

    public void setFdjh(String fdjh) {
        this.fdjh = fdjh;
    }
}
