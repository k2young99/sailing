package com.boot.sailing.v2.service;

import com.boot.sailing.v2.dao.MemberDaoV2;
import com.boot.sailing.v2.dao.OrderDaoV2;
import com.boot.sailing.v2.vo.Member_list;
import com.boot.sailing.v2.vo.Order_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberSvcV2 {

    @Autowired
    MemberDaoV2 memberDaoV2;

    public List<Member_list> doList(){

        List<Member_list> list = memberDaoV2.doList();

        return list;
    }

    public List<Member_list> doSearch(String strStartDate, String strEndDate, String strName) {
        List<Member_list> list = memberDaoV2.doSearch(strStartDate,strEndDate,strName);
        return list;
    }
}
