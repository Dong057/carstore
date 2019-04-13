package com.newer.service;

import com.newer.domain.Emp;
import com.newer.domain.Potentialcustomer;
import com.newer.domain.Potentialcustomerupgrade;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PotentialcustomerService {
    List<Potentialcustomer> findAll();
    Potentialcustomer findById(@Param("potentialcustomerid")int potentialcustomerid);
    int deletePotentialcustomer(@Param("potentialcustomerid")int potentialcustomerid);
    int addPotentialcustomer(@Param("potentialcustomer")Potentialcustomer potentialcustomer
            ,@Param("empid")int empid);
    int updatePotentialcustomer(@Param("potentialcustomer")Potentialcustomer potentialcustomer
            ,@Param("empid")int empid);
    List<Emp> findEmpInfo();
}
