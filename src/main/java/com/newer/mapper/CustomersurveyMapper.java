package com.newer.mapper;

import com.newer.domain.Customersurvey;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface CustomersurveyMapper {
    @Insert("insert into customersurvey values(null" +
            ",#{potentialcustomerid}" +
            ",now()" +
            ",#{customersurvey.surveytype}" +
            ",#{customersurvey.surveystate}" +
            ",#{customersurvey.surveytext}" +
            ",#{customersurvey.surveyresults}" +
            ",#{empid})")
    int addCustomersurvey(@Param("potentialcustomerid")int potentialcustomerid,@Param("customersurvey") Customersurvey customersurvey,@Param("empid") int empid);
}
