package com.newer.mapper;

import com.newer.domain.Emp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EmpMapper {
    @Select("select * from emp where empno=#{empid}")
    Emp findById(@Param("empid")int empid);
}
