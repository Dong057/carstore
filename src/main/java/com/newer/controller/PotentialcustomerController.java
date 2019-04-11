package com.newer.controller;

import com.newer.domain.Customersurvey;
import com.newer.domain.Emp;
import com.newer.domain.Potentialcustomer;
import com.newer.domain.Potentialcustomerupgrade;
import com.newer.service.CustomersurveyService;
import com.newer.service.PotentialcustomerService;
import com.newer.service.PotentialcustomerupgradeService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ResponseBody
@RestController
@RequestMapping("/potentialcustomer")
public class PotentialcustomerController {
    @Autowired
    private PotentialcustomerService potentialcustomerService;
    @Autowired
    private CustomersurveyService customersurveyService;
    @Autowired
    private PotentialcustomerupgradeService potentialcustomerupgradeService;


    @RequestMapping("/findAll")
    public List<Potentialcustomer> findAll(){
        List<Potentialcustomer> potentialcustomers=potentialcustomerService.findAll();
        return potentialcustomers;
    }

    @RequestMapping("/findById/{potentialcustomerid}")
    public Potentialcustomer findById(@PathVariable("potentialcustomerid")int potentialcustomerid){
        System.out.println(potentialcustomerid);
        Potentialcustomer potentialcustomer=potentialcustomerService.findById(potentialcustomerid);
        return potentialcustomer;
    }

    @DeleteMapping("/deletePotentialcustomer/{potentialcustomerid}")
    public Map<String,Object> deletePotentialcustomer(@PathVariable("potentialcustomerid")int potentialcustomerid){
        Map<String,Object> msg=new HashMap<>();
        if(potentialcustomerService.deletePotentialcustomer(potentialcustomerid)==1){
            msg.put("msg","删除成功");
            return msg;
        }
        msg.put("msg","删除失败");
        return msg;
    }

    @PostMapping("/addPotentialcustomer")
    public Map<String,Object> addPotentialcustomer(
            @RequestParam("customername")String customername
            , @RequestParam(value = "sex",required = false)String sex
            , @RequestParam(value = "comeshopcause",required = false)String comeshopcause
            , @RequestParam(value = "carpurpose",required = false)String carpurpose
            , @RequestParam(value = "carbudget",required = false)Integer carbudget
            , @RequestParam(value = "buycarmodel",required = false)String buycarmodel
            , @RequestParam(value = "color",required = false)String color
            , @RequestParam(value = "carprice",required = false)Integer carprice
            , @RequestParam(value = "carpurchasetext",required = false)String carpurchasetext
            , @RequestParam(value = "paymentformula",required = false)String paymentformula
            , @RequestParam(value = "birthdate",required = false)Date birthdate
            , @RequestParam(value = "marriage",required = false)String marriage
            , @RequestParam(value = "cardid",required = false)String cardid
            , @RequestParam(value = "drivertype")String drivertype
            , @RequestParam(value = "profession",required = false)String profession
            , @RequestParam(value = "workunit",required = false)String workunit
            , @RequestParam(value = "phone")String phone
            , @RequestParam(value = "telephone",required = false)String telephone
            , @RequestParam(value = "site",required = false)String site
            , @RequestParam(value = "postcode",required = false)String postcode
            , @RequestParam(value = "text",required = false)String text
            , @RequestParam(value = "empid") int empid){
        Map<String,Object> msg=new HashMap<>();
        Potentialcustomer potentialcustomer=new Potentialcustomer();
        potentialcustomer.setCustomername(customername);
        potentialcustomer.setSex(sex);
        potentialcustomer.setComeshopcause(comeshopcause);
        potentialcustomer.setCarpurpose(carpurpose);
        potentialcustomer.setCarbudget(carbudget);
        potentialcustomer.setBuycarmodel(buycarmodel);
        potentialcustomer.setColor(color);
        potentialcustomer.setCarprice(carprice);
        potentialcustomer.setCarpurchasetext(carpurchasetext);
        potentialcustomer.setPaymentformula(paymentformula);
        potentialcustomer.setBirthdate(birthdate);
        potentialcustomer.setMarriage(marriage);
        potentialcustomer.setCardid(cardid);
        potentialcustomer.setDrivertype(drivertype);
        potentialcustomer.setProfession(profession);
        potentialcustomer.setWorkunit(workunit);
        potentialcustomer.setPhone(phone);
        potentialcustomer.setTelephone(telephone);
        potentialcustomer.setSite(site);
        potentialcustomer.setPostcode(postcode);
        potentialcustomer.setText(text);

        System.out.println(potentialcustomer.toString());
        if(potentialcustomerService.addPotentialcustomer(potentialcustomer,empid)==1){
            msg.put("msg","添加成功");
            return msg;
        }
        msg.put("msg","添加失败");
        return msg;
    }

    @PostMapping("/updatePotentialcustomer")
    public Map<String,Object> updatePotentialcustomer(
            @RequestParam("potentialcustomerid")int potentialcustomerid
            ,@RequestParam("customername")String customername
            , @RequestParam(value = "sex",required = false)String sex
            , @RequestParam(value = "comeshopcause",required = false)String comeshopcause
            , @RequestParam(value = "carpurpose",required = false)String carpurpose
            , @RequestParam(value = "carbudget",required = false)Integer carbudget
            , @RequestParam(value = "buycarmodel",required = false)String buycarmodel
            , @RequestParam(value = "color",required = false)String color
            , @RequestParam(value = "carprice",required = false)Integer carprice
            , @RequestParam(value = "carpurchasetext",required = false)String carpurchasetext
            , @RequestParam(value = "paymentformula",required = false)String paymentformula
            , @RequestParam(value = "birthdate",required = false)Date birthdate
            , @RequestParam(value = "marriage",required = false)String marriage
            , @RequestParam(value = "cardid",required = false)String cardid
            , @RequestParam(value = "drivertype")String drivertype
            , @RequestParam(value = "profession",required = false)String profession
            , @RequestParam(value = "workunit",required = false)String workunit
            , @RequestParam(value = "phone")String phone
            , @RequestParam(value = "telephone",required = false)String telephone
            , @RequestParam(value = "site",required = false)String site
            , @RequestParam(value = "postcode",required = false)String postcode
            , @RequestParam(value = "text",required = false)String text
            , @RequestParam(value = "empid") int empid
    ) {
        Map<String, Object> msg = new HashMap<>();
        Potentialcustomer potentialcustomer = new Potentialcustomer();
        potentialcustomer.setPotentialcustomerid(potentialcustomerid);
        potentialcustomer.setCustomername(customername);
        potentialcustomer.setSex(sex);
        potentialcustomer.setComeshopcause(comeshopcause);
        potentialcustomer.setCarpurpose(carpurpose);
        potentialcustomer.setCarbudget(carbudget);
        potentialcustomer.setBuycarmodel(buycarmodel);
        potentialcustomer.setColor(color);
        potentialcustomer.setCarprice(carprice);
        potentialcustomer.setCarpurchasetext(carpurchasetext);
        potentialcustomer.setPaymentformula(paymentformula);
        potentialcustomer.setBirthdate(birthdate);
        potentialcustomer.setMarriage(marriage);
        potentialcustomer.setCardid(cardid);
        potentialcustomer.setDrivertype(drivertype);
        potentialcustomer.setProfession(profession);
        potentialcustomer.setWorkunit(workunit);
        potentialcustomer.setPhone(phone);
        potentialcustomer.setTelephone(telephone);
        potentialcustomer.setSite(site);
        potentialcustomer.setPostcode(postcode);
        potentialcustomer.setText(text);
        System.out.println(potentialcustomer.toString());
        if (potentialcustomerService.updatePotentialcustomer(potentialcustomer, empid) == 1) {
            msg.put("msg", "修改成功");
            return msg;
        }
        msg.put("msg", "修改失败");
        return msg;
    }

    @PostMapping("/addCustomersurvey")
    public Map<String,Object> addCustomersurvey(
            @RequestParam("potentialcustomerid")int potentialcustomerid
            ,@RequestParam("surveytype")String surveytype
            ,@RequestParam("surveystate")String surveystate
            ,@RequestParam("surveytext")String surveytext
            ,@RequestParam("surveyresults")String surveyresults
            ,@RequestParam("empid")int empid
    ){
        Map<String, Object> msg = new HashMap<>();
        Customersurvey customersurvey=new Customersurvey();
        customersurvey.setSurveytype(surveytype);
        customersurvey.setSurveystate(surveystate);
        customersurvey.setSurveytext(surveytext);
        customersurvey.setSurveyresults(surveyresults);
        if(customersurveyService.addCustomersurvey(potentialcustomerid,customersurvey,empid)==1){
            msg.put("msg", "跟进成功");
            return msg;
        }
        msg.put("msg", "跟进失败");
        return msg;
    }

    @PostMapping("/levelUpdateAndAdd")
    public Map<String,Object> levelUpdateAndAdd(
            @RequestParam("potentialcustomerid")int potentialcustomerid
            ,@RequestParam("upgradedlevel")String upgradedlevel
            ,@RequestParam("upgradelevel")String upgradelevel
            ,@RequestParam("empid")int empid
            ,@RequestParam("text")String text
    ){
        Map<String, Object> msg = new HashMap<>();
        Potentialcustomerupgrade potentialcustomerupgrade=new Potentialcustomerupgrade();
        potentialcustomerupgrade.setUpgradedlevel(upgradedlevel);
        potentialcustomerupgrade.setUpgradelevel(upgradelevel);
        potentialcustomerupgrade.setText(text);
        System.out.println(potentialcustomerupgrade.toString());
        if(potentialcustomerupgradeService.levelUpdateAndAdd(potentialcustomerid,upgradelevel,potentialcustomerupgrade,empid)==1){
            msg.put("msg", "流失成功");
            return msg;
        }
        msg.put("msg", "流失失败");
        return msg;
    }
}
