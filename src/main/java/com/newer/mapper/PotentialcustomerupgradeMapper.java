package com.newer.mapper;

import com.newer.domain.Potentialcustomerupgrade;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface PotentialcustomerupgradeMapper {
    @Update("update potentialcustomer set customerlevel=#{customerlevel} where potentialcustomerid=#{potentialcustomerid} ")
    int updateLevel(@Param("potentialcustomerid")int potentialcustomerid,@Param("customerlevel")String customerlevel);
    @Insert("insert into potentialcustomer values(null" +
            ",#{Potentialcustomerupgrade.Potentialcustomerupgradeid}" +
            ",now()" +
            ",#{Potentialcustomerupgrade.upgradedlevel}" +
            ",#{Potentialcustomerupgrade.upgradelevel}" +
            ",#{empid}" +
            ",#{Potentialcustomerupgrade.text})")
    int addPotentialcustomerupgrade(@Param("potentialcustomerupgrade") Potentialcustomerupgrade potentialcustomerupgrade, @Param("empid")int empid);
}
