package com.newer.service;

import com.newer.domain.Potentialcustomerupgrade;
import com.newer.mapper.PotentialcustomerupgradeMapper;
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
        return potentialcustomerupgradeMapper.updateLevel(potentialcustomerid,customerlevel);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addPotentialcustomerupgrade(Potentialcustomerupgrade potentialcustomerupgrade, int empid) {
        return potentialcustomerupgradeMapper.addPotentialcustomerupgrade(potentialcustomerupgrade,empid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int levelUpdateAndAdd(int potentialcustomerid, String customerlevel, Potentialcustomerupgrade potentialcustomerupgrade, int empid){
        if(updateLevel(potentialcustomerid,customerlevel)==1) {
            if(addPotentialcustomerupgrade(potentialcustomerupgrade, empid)==1){
                return 1;
            }
        }
        return 0;
    }
}
