package com.newer.service;

import com.newer.domain.Customersurvey;
import org.apache.ibatis.annotations.Param;

public interface CustomersurveyService {
    int addCustomersurvey(@Param("potentialcustomerid")int potentialcustomerid, Customersurvey customersurvey, int empid);
}
