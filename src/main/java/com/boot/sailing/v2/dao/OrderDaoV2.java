package com.boot.sailing.v2.dao;

import com.boot.sailing.v2.vo.Order_list;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDaoV2 {

    List<Order_list> doList();

    List<Order_list> doSearch(@Param("strStartDate") String strStartDate, @Param("strEndDate") String strEndDate,@Param("strCoffee") String strCoffee,@Param("strName") String strName);
}


