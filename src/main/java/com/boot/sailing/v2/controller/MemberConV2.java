package com.boot.sailing.v2.controller;

import com.boot.sailing.v2.service.MemberSvcV2;
import com.boot.sailing.v2.vo.Member_list;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/v2")
@Log4j2
public class MemberConV2 {

    @Autowired
    MemberSvcV2 memberSvcV2;
    @RequestMapping("/member")
    public String doMember(Model model){

        List<Member_list> list = memberSvcV2.doList();

        log.info("==========MemberCon==============");
        log.info(list);

        model.addAttribute("list",list);

        return "/v2/member/member";
    }

    @RequestMapping("/member_search")
    public String doSearch(
            @RequestParam("start_date") String strStartDate,
            @RequestParam("end_date") String strEndDate,
            @RequestParam("name") String strName,
            Model model){

        List<Member_list> list = memberSvcV2.doSearch(strStartDate,strEndDate,strName);

        log.info("멤버리스트 : "+ list);

        model.addAttribute("list",list);
        return "/v2/member/member";
    }

}
