package com.newer.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Date;

public class Customerdrain implements Serializable {
    private Integer customerdrainid;//流失客户id
    private Integer potentialcustomerid;//客户id
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date surveydate;//调查日期
    private String surveytype;//调查方式
    private String surveytext;//调查内容
    private String draintext;//流失结果
    private Integer empid;//调查员

    public Customerdrain() {
    }

    public Customerdrain(Integer customerdrainid, Integer potentialcustomerid, Date surveydate, String surveytype, String surveytext, String draintext, Integer empid) {
        this.customerdrainid = customerdrainid;
        this.potentialcustomerid = potentialcustomerid;
        this.surveydate = surveydate;
        this.surveytype = surveytype;
        this.surveytext = surveytext;
        this.draintext = draintext;
        this.empid = empid;
    }

    public Integer getCustomerdrainid() {
        return customerdrainid;
    }

    public void setCustomerdrainid(Integer customerdrainid) {
        this.customerdrainid = customerdrainid;
    }

    public Integer getPotentialcustomerid() {
        return potentialcustomerid;
    }

    public void setPotentialcustomerid(Integer potentialcustomerid) {
        this.potentialcustomerid = potentialcustomerid;
    }

    public Date getSurveydate() {
        return surveydate;
    }

    public void setSurveydate(Date surveydate) {
        this.surveydate = surveydate;
    }

    public String getSurveytype() {
        return surveytype;
    }

    public void setSurveytype(String surveytype) {
        this.surveytype = surveytype;
    }

    public String getSurveytext() {
        return surveytext;
    }

    public void setSurveytext(String surveytext) {
        this.surveytext = surveytext;
    }

    public String getDraintext() {
        return draintext;
    }

    public void setDraintext(String draintext) {
        this.draintext = draintext;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}
