package com.boot.sailing.v2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDaoV2 {
    List<Map<String, Object>> doList();

    int doInsert(@Param("strCoffee") String strCoffee,@Param("strKind")  String strKind,@Param("strPrice") String strPrice);


    int doDelete(@Param("strNo") String strNo);
    Map<String, Object> doListOne(@Param("strNo") String strNo);

    int doUpdate(@Param("strNo") String strNo,  @Param("strCoffee") String strCoffee,@Param("strKind")  String strKind,@Param("strPrice") String strPrice);

    List<Map<String, Object>> doSearch(@Param("strStartDate") String strStartDate,@Param("strEndDate") String strEndDate,@Param("strCoffee") String strCoffee,@Param("strKind") String strKind);

    int doUpdatePrice(@Param("strNo") String strNo, @Param("strPrice") String strPrice);

    int doInsertLog(@Param("strNo") String strNo, @Param("strPrice") String strPrice);

    int doInsertLogOne(@Param("chkList") List<String> chkList, @Param("strPrice") String strPrice);

    int doUpdatePriceOne(@Param("chkList") List<String> chkList,@Param("strPrice") String strPrice);
}
