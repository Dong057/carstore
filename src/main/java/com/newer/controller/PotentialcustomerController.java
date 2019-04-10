package com.newer.controller;

import com.newer.domain.Potentialcustomer;
import com.newer.service.PotentialcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ResponseBody
@RestController
@RequestMapping("/potentialcustomer")
public class PotentialcustomerController {
    @Autowired
    private PotentialcustomerService potentialcustomerService;

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

    @RequestMapping("/deletePotentialcustomer/{potentialcustomerid}")
    public Map<String,Object> deletePotentialcustomer(@PathVariable("potentialcustomerid")int potentialcustomerid){
        Map<String,Object> msg=new HashMap<>();
        if(potentialcustomerService.deletePotentialcustomer(potentialcustomerid)==1){
            msg.put("msg","删除成功");
            return msg;
        }
        msg.put("msg","删除失败");
        return msg;
    }
}
