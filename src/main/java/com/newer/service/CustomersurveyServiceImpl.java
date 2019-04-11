package com.newer.service;

import com.newer.domain.Customersurvey;
import com.newer.mapper.CustomersurveyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class CustomersurveyServiceImpl implements CustomersurveyService {
    @Autowired
    private CustomersurveyMapper customersurveyMapper;

    public CustomersurveyMapper getCustomersurveyMapper() {
        return customersurveyMapper;
    }

    public void setCustomersurveyMapper(CustomersurveyMapper customersurveyMapper) {
        this.customersurveyMapper = customersurveyMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addCustomersurvey(int potentialcustomerid, Customersurvey customersurvey, int empid) {
        return customersurveyMapper.addCustomersurvey(potentialcustomerid,customersurvey,empid);
    }
}
