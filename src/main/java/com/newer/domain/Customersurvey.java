package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Customersurvey implements Serializable {
    private Integer surveyid;//跟进id
    private Potentialcustomer potentialcustomer;//客户id
    private Date surveydate;//跟进日期
    private String surveytype;//跟进类型
    private String surveystate;//跟进状态
    private String surveytext;//跟进内容
    private String surveyresults;//跟进结果
    private Emp emp;//跟进员

    public Integer getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Integer surveyid) {
        this.surveyid = surveyid;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Potentialcustomer getPotentialcustomer() {
        return potentialcustomer;
    }

    public void setPotentialcustomer(Potentialcustomer potentialcustomer) {
        this.potentialcustomer = potentialcustomer;
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


    public Customersurvey(Integer surveyid, Potentialcustomer potentialcustomer, Date surveydate, String surveytype, String surveystate, String surveytext, String surveyresults, Emp emp) {
        this.surveyid = surveyid;
        this.potentialcustomer = potentialcustomer;
        this.surveydate = surveydate;
        this.surveytype = surveytype;
        this.surveystate = surveystate;
        this.surveytext = surveytext;
        this.surveyresults = surveyresults;
        this.emp = emp;
    }

    public Customersurvey() {

    }
}
