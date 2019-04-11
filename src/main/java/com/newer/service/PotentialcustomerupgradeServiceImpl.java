package com.newer.service;

import com.newer.domain.Potentialcustomerupgrade;
import com.newer.mapper.PotentialcustomerupgradeMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class PotentialcustomerupgradeServiceImpl implements PotentialcustomerupgradeService {
    @Autowired
    private PotentialcustomerupgradeMapper potentialcustomerupgradeMapper;

    public PotentialcustomerupgradeMapper getPotentialcustomerupgradeMapper() {
        return potentialcustomerupgradeMapper;
    }

    public void setPotentialcustomerupgradeMapper(PotentialcustomerupgradeMapper potentialcustomerupgradeMapper) {
        this.potentialcustomerupgradeMapper = potentialcustomerupgradeMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int updateLevel(int potentialcustomerid, String customerlevel) {
        System.out.println("333333333333333333333333333333");
        return potentialcustomerupgradeMapper.updateLevel(potentialcustomerid,customerlevel);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addPotentialcustomerupgrade(int potentialcustomerid, Potentialcustomerupgrade potentialcustomerupgrade, int empid) {
        System.out.println("22222222222222222222222222222");
        return potentialcustomerupgradeMapper.addPotentialcustomerupgrade(potentialcustomerid,potentialcustomerupgrade,empid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int levelUpdateAndAdd(int potentialcustomerid, String customerlevel, Potentialcustomerupgrade potentialcustomerupgrade, int empid){
        System.out.println("11111111111111111111111111111111111111");
        int a=updateLevel(potentialcustomerid,customerlevel);
        System.out.println(a);
        if(a==1) {
            int b=addPotentialcustomerupgrade(potentialcustomerid,potentialcustomerupgrade, empid);
            if(b==1){
                System.out.println(b);
                return 1;
            }
        }
        return 0;
    }
}
