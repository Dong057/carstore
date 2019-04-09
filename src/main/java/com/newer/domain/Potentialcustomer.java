package com.newer.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Date;

public class Potentialcustomer implements Serializable {
    private Integer potentialcustomerid;//客户i
    private String customername;//客户姓名
    private String sex;//客户性别
    private String customerlevel;//客户等级
    private String comeshopcause;//来店契机
    private String carpurpose;//车辆用途
    private Integer carbudget;//购车预算
    private String buycarmodel;//想购车型
    private String color;//颜色
    private Integer carprice;//想购车型价格
    private String carpurchasetext;//购车重点
    private String paymentformula;//付款方式
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birthdate;//生日
    private String marriage;//婚姻状况
    private String cardid;//身份证
    private String drivertype;//驾驶证型号
    private String profession;//职业
    private String workunit;//工作单位
    private String phone;//手机号码
    private String telephone;//座机号码
    private String site;//地址
    private String postcode;//邮编
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date registerdate;//登记日期
    private String text;//备注
    private Integer empid;//销售顾问

    public Potentialcustomer() {
    }

    public Potentialcustomer(Integer potentialcustomerid, String customername, String sex, String customerlevel, String comeshopcause, String carpurpose, Integer carbudget, String buycarmodel, String color, Integer carprice, String carpurchasetext, String paymentformula, Date birthdate, String marriage, String cardid, String drivertype, String profession, String workunit, String phone, String telephone, String site, String postcode, Date registerdate, String text, Integer empid) {
        this.potentialcustomerid = potentialcustomerid;
        this.customername = customername;
        this.sex = sex;
        this.customerlevel = customerlevel;
        this.comeshopcause = comeshopcause;
        this.carpurpose = carpurpose;
        this.carbudget = carbudget;
        this.buycarmodel = buycarmodel;
        this.color = color;
        this.carprice = carprice;
        this.carpurchasetext = carpurchasetext;
        this.paymentformula = paymentformula;
        this.birthdate = birthdate;
        this.marriage = marriage;
        this.cardid = cardid;
        this.drivertype = drivertype;
        this.profession = profession;
        this.workunit = workunit;
        this.phone = phone;
        this.telephone = telephone;
        this.site = site;
        this.postcode = postcode;
        this.registerdate = registerdate;
        this.text = text;
        this.empid = empid;
    }

    public Integer getPotentialcustomerid() {
        return potentialcustomerid;
    }

    public void setPotentialcustomerid(Integer potentialcustomerid) {
        this.potentialcustomerid = potentialcustomerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCustomerlevel() {
        return customerlevel;
    }

    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel;
    }

    public String getComeshopcause() {
        return comeshopcause;
    }

    public void setComeshopcause(String comeshopcause) {
        this.comeshopcause = comeshopcause;
    }

    public String getCarpurpose() {
        return carpurpose;
    }

    public void setCarpurpose(String carpurpose) {
        this.carpurpose = carpurpose;
    }

    public Integer getCarbudget() {
        return carbudget;
    }

    public void setCarbudget(Integer carbudget) {
        this.carbudget = carbudget;
    }

    public String getBuycarmodel() {
        return buycarmodel;
    }

    public void setBuycarmodel(String buycarmodel) {
        this.buycarmodel = buycarmodel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCarprice() {
        return carprice;
    }

    public void setCarprice(Integer carprice) {
        this.carprice = carprice;
    }

    public String getCarpurchasetext() {
        return carpurchasetext;
    }

    public void setCarpurchasetext(String carpurchasetext) {
        this.carpurchasetext = carpurchasetext;
    }

    public String getPaymentformula() {
        return paymentformula;
    }

    public void setPaymentformula(String paymentformula) {
        this.paymentformula = paymentformula;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getDrivertype() {
        return drivertype;
    }

    public void setDrivertype(String drivertype) {
        this.drivertype = drivertype;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}
