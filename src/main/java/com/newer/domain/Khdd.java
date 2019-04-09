package com.newer.domain;



import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Khdd {
    private Integer ddbh;//订单编号
    private Integer clid;//车辆ID
    private Integer khbh;//客户编号
    private Date dgrq;//订购日期
    private String jdzt;//订单状态
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date yjsj;//预交时间
    private String cjh;//车架号
    private String fdjh;//发动机号
    private String fplx;//发票类型
    private Double fpje;//发票金额
    private Double cljg;//车辆价格
    private Double gzs;//购置税
    private Double bxf;//保险费
    private Double zsf;//装饰费
    private Double spf;//上牌费
    private Integer shr;//审核人
    private Date shrq;//审核时间
    private Double ysk;//已收款
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date kprq;//开票日期
    private String hth;//合同号
    private String sfzf;//是否作废
    private String bz;//备注

    public Integer getDdbh() {
        return ddbh;
    }

    public void setDdbh(Integer ddbh) {
        this.ddbh = ddbh;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getKhbh() {
        return khbh;
    }

    public void setKhbh(Integer khbh) {
        this.khbh = khbh;
    }

    public Date getDgrq() {
        return dgrq;
    }

    public void setDgrq(Date dgrq) {
        this.dgrq = dgrq;
    }

    public String getJdzt() {
        return jdzt;
    }

    public void setJdzt(String jdzt) {
        this.jdzt = jdzt;
    }

    public Date getYjsj() {
        return yjsj;
    }

    public void setYjsj(Date yjsj) {
        this.yjsj = yjsj;
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

    public String getFplx() {
        return fplx;
    }

    public void setFplx(String fplx) {
        this.fplx = fplx;
    }

    public Double getFpje() {
        return fpje;
    }

    public void setFpje(Double fpje) {
        this.fpje = fpje;
    }

    public Double getCljg() {
        return cljg;
    }

    public void setCljg(Double cljg) {
        this.cljg = cljg;
    }

    public Double getGzs() {
        return gzs;
    }

    public void setGzs(Double gzs) {
        this.gzs = gzs;
    }

    public Double getBxf() {
        return bxf;
    }

    public void setBxf(Double bxf) {
        this.bxf = bxf;
    }

    public Double getZsf() {
        return zsf;
    }

    public void setZsf(Double zsf) {
        this.zsf = zsf;
    }

    public Double getSpf() {
        return spf;
    }

    public void setSpf(Double spf) {
        this.spf = spf;
    }

    public Integer getShr() {
        return shr;
    }

    public void setShr(Integer shr) {
        this.shr = shr;
    }

    public Date getShrq() {
        return shrq;
    }

    public void setShrq(Date shrq) {
        this.shrq = shrq;
    }

    public Double getYsk() {
        return ysk;
    }

    public void setYsk(Double ysk) {
        this.ysk = ysk;
    }

    public Date getKprq() {
        return kprq;
    }

    public void setKprq(Date kprq) {
        this.kprq = kprq;
    }

    public String getHth() {
        return hth;
    }

    public void setHth(String hth) {
        this.hth = hth;
    }

    public String getSfzf() {
        return sfzf;
    }

    public void setSfzf(String sfzf) {
        this.sfzf = sfzf;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}