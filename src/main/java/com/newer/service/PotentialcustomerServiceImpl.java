package com.newer.service;

import com.newer.domain.Emp;
import com.newer.domain.Potentialcustomer;
import com.newer.domain.Potentialcustomerupgrade;
import com.newer.mapper.EmpMapper;
import com.newer.mapper.PotentialcustomerMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class PotentialcustomerServiceImpl implements PotentialcustomerService{
    @Autowired
    private PotentialcustomerMapper potentialcustomerMapper;


    public PotentialcustomerMapper getPotentialcustomerMapper() {
        return potentialcustomerMapper;
    }

    public void setPotentialcustomerMapper(PotentialcustomerMapper potentialcustomerMapper) {
        this.potentialcustomerMapper = potentialcustomerMapper;
    }

    @Override
    public List<Potentialcustomer> findAll() {
        return potentialcustomerMapper.findAll();
    }

    @Override
    public Potentialcustomer findById(int potentialcustomerid) {
        return potentialcustomerMapper.findById(potentialcustomerid);
    }

    @Override
    public int deletePotentialcustomer(int potentialcustomerid) {
        return potentialcustomerMapper.deletePotentialcustomer(potentialcustomerid);
    }

    @Override
    public int addPotentialcustomer(Potentialcustomer potentialcustomer, int empid) {
        return potentialcustomerMapper.addPotentialcustomer(potentialcustomer,empid);
    }

    @Override
    public int updatePotentialcustomer(Potentialcustomer potentialcustomer, int empid) {
        return potentialcustomerMapper.updatePotentialcustomer(potentialcustomer,empid);
    }

    @Override
    public List<Emp> findEmpInfo() {
        return potentialcustomerMapper.findEmpInfo();
    }
}
