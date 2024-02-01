package com.boot.sailing.v2.dao;

import com.boot.sailing.v2.vo.Member_list;
import com.boot.sailing.v2.vo.Order_list;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberDaoV2 {

    List<Member_list> doList();

    List<Member_list> doSearch(@Param("strStartDate") String strStartDate,@Param("strEndDate") String strEndDate,@Param("strName") String strName);


}


