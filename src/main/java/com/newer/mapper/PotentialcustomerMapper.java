package com.newer.mapper;

import com.newer.domain.Potentialcustomer;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PotentialcustomerMapper {
    @Results(value = {
            @Result(property = "potentialcustomerid",column = "potentialcustomerid",id = true),
            @Result(property="customername" ,column="customername"),
            @Result(property="sex", column="sex"),
            @Result(property="customerlevel", column="customerlevel"),
            @Result(property="drivertype", column="drivertype"),
            @Result(property="phone", column="phone"),
            @Result(property="registerdate", column="registerdate"),
            @Result(property = "emp",javaType = com.newer.domain.Emp.class
                    ,column = "empid",one = @One(select = "com.newer.mapper.EmpMapper.findById"))
    })
    @Select("select * from potentialcustomer pm\n" +
            "  LEFT JOIN emp ep on pm.empid=ep.empno")
    List<Potentialcustomer> findAll();

    @Results(value = {
            @Result(property = "potentialcustomerid",column = "potentialcustomerid",id = true),
            @Result(property="customername" ,column="customername"),
            @Result(property="sex", column="sex"),
            @Result(property="customerlevel", column="customerlevel"),
            @Result(property="drivertype", column="drivertype"),
            @Result(property="phone", column="phone"),
            @Result(property="registerdate", column="registerdate"),
            @Result(property = "emp",javaType = com.newer.domain.Emp.class
                    ,column = "empid",one = @One(select = "com.newer.mapper.EmpMapper.findById"))
    })
    @Select("select * from potentialcustomer pm\n" +
            " LEFT JOIN emp ep on pm.empid=ep.empno\n" +
            " where potentialcustomerid=#{potentialcustomerid}")
    Potentialcustomer findById(@Param("potentialcustomerid")int potentialcustomerid);

    @Delete("delete from potentialcustomer where potentialcustomerid=#{potentialcustomerid}")
    int deletePotentialcustomer(@Param("potentialcustomerid")int potentialcustomerid);
}
