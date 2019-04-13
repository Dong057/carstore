package com.newer.mapper;

import com.newer.domain.Emp;
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


    @Insert("insert into potentialcustomer values(null" +
            ",#{potentialcustomer.customername}" +
            ",#{potentialcustomer.sex}" +
            ",1" +
            ",#{potentialcustomer.comeshopcause}" +
            ",#{potentialcustomer.carpurpose}" +
            ",#{potentialcustomer.carbudget}" +
            ", #{potentialcustomer.buycarmodel}" +
            ", #{potentialcustomer.color}" +
            ", #{potentialcustomer.carprice}" +
            ", #{potentialcustomer.carpurchasetext}" +
            ", #{potentialcustomer.paymentformula}" +
            ", #{potentialcustomer.birthdate}" +
            ", #{potentialcustomer.marriage}" +
            ", #{potentialcustomer.cardid}" +
            ", #{potentialcustomer.drivertype}" +
            ", #{potentialcustomer.profession}" +
            ", #{potentialcustomer.workunit}" +
            ", #{potentialcustomer.phone}" +
            ", #{potentialcustomer.telephone}" +
            ", #{potentialcustomer.site}" +
            ", #{potentialcustomer.postcode}" +
            ", now()" +
            ", #{potentialcustomer.text}" +
            ", #{empid})")
    int addPotentialcustomer(@Param("potentialcustomer")Potentialcustomer potentialcustomer
            ,@Param("empid")int empid);


    @Update("update potentialcustomer set customername=#{potentialcustomer.customername}" +
            " ,sex=#{potentialcustomer.sex}" +
            ",comeshopcause=#{potentialcustomer.comeshopcause}" +
            ",carpurpose=#{potentialcustomer.carpurpose}" +
            ",carbudget=#{potentialcustomer.carbudget}" +
            ",buycarmodel=#{potentialcustomer.buycarmodel}" +
            ", color=#{potentialcustomer.color}" +
            ", carprice=#{potentialcustomer.carprice}" +
            ", carpurchasetext=#{potentialcustomer.carpurchasetext}" +
            ", paymentformula=#{potentialcustomer.paymentformula}" +
            ", birthdate=#{potentialcustomer.birthdate}" +
            ", marriage=#{potentialcustomer.marriage}" +
            ", cardid=#{potentialcustomer.cardid}" +
            ",drivertype=#{potentialcustomer.drivertype}" +
            ", profession=#{potentialcustomer.profession}" +
            ", workunit=#{potentialcustomer.workunit}" +
            ", phone=#{potentialcustomer.phone}" +
            ", telephone=#{potentialcustomer.telephone}" +
            ", site=#{potentialcustomer.site}" +
            ", postcode=#{potentialcustomer.postcode}" +
            ",registerdate=#{potentialcustomer.registerdate}" +
            ", text=#{potentialcustomer.text}" +
            ", empid=#{empid}" +
            " where potentialcustomerid=#{potentialcustomer.potentialcustomerid};"
           )
    int updatePotentialcustomer(@Param("potentialcustomer")Potentialcustomer potentialcustomer
            ,@Param("empid")int empid);

    @Select("select * from emp")
    List<Emp> findEmpInfo();
}
