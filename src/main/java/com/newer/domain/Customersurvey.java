package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Customersurvey implements Serializable {
    private Integer surveyid;//跟进id
    private Integer potentialcustomerid;//客户id
    private Date surveydate;//跟进日期
    private String surveytype;//跟进类型
    private String surveystate;//跟进状态
    private String surveytext;//跟进内容
    private String surveyresults;//跟进结果
    private Integer empid;//跟进员

    public Integer getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Integer surveyid) {
        this.surveyid = surveyid;
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

    public String getSurveystate() {
        return surveystate;
    }

    public void setSurveystate(String surveystate) {
        this.surveystate = surveystate;
    }

    public String getSurveytext() {
        return surveytext;
    }

    public void setSurveytext(String surveytext) {
        this.surveytext = surveytext;
    }

    public String getSurveyresults() {
        return surveyresults;
    }

    public void setSurveyresults(String surveyresults) {
        this.surveyresults = surveyresults;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Customersurvey(Integer surveyid, Integer potentialcustomerid, Date surveydate, String surveytype, String surveystate, String surveytext, String surveyresults, Integer empid) {

        this.surveyid = surveyid;
        this.potentialcustomerid = potentialcustomerid;
        this.surveydate = surveydate;
        this.surveytype = surveytype;
        this.surveystate = surveystate;
        this.surveytext = surveytext;
        this.surveyresults = surveyresults;
        this.empid = empid;
    }

    public Customersurvey() {

    }
}
