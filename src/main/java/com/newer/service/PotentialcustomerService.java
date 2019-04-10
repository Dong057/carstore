package com.newer.service;

import com.newer.domain.Potentialcustomer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PotentialcustomerService {
    List<Potentialcustomer> findAll();
    Potentialcustomer findById(@Param("potentialcustomerid")int potentialcustomerid);
    int deletePotentialcustomer(@Param("potentialcustomerid")int potentialcustomerid);
}
