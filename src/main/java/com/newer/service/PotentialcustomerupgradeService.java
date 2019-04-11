package com.newer.service;

import com.newer.domain.Potentialcustomerupgrade;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface PotentialcustomerupgradeService {
    int updateLevel(@Param("potentialcustomerid")int potentialcustomerid, @Param("customerlevel")String customerlevel);
    int addPotentialcustomerupgrade(@Param("potentialcustomerupgrade") Potentialcustomerupgrade potentialcustomerupgrade, @Param("empid")int empid);
    int levelUpdateAndAdd(int potentialcustomerid, String customerlevel, Potentialcustomerupgrade potentialcustomerupgrade, int empid);
}
