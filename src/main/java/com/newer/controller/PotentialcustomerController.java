package com.newer.controller;

import com.newer.domain.Potentialcustomer;
import com.newer.service.PotentialcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
