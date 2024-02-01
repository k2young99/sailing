package com.boot.sailing.v2.controller;

import com.boot.sailing.v2.service.MenuSvcV2;
import com.boot.sailing.v2.service.OrderSvcV2;
import com.boot.sailing.v2.vo.Coffee_menu;
import com.boot.sailing.v2.vo.Order_list;
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
public class OrderConV2 {

    @Autowired
    OrderSvcV2 orderSvcV2;
    @RequestMapping("/order")
    public String doOrder(Model model){

        // Data 만들기 , List , Map
        List<Order_list> list = orderSvcV2.doList();

        log.info("==========OrderCon==============");
        log.info(list);

        // Data 송부
        model.addAttribute("list", list);
        model.addAttribute("hello", " ========== OrderCon V2 ======== ");


        return "/v2/order/order";
    }

    @RequestMapping("/order_search")
    public String doSearch(
        @RequestParam("start_date") String strStartDate,
        @RequestParam("end_date") String strEndDate,
        @RequestParam("coffee") String strCoffee,
        @RequestParam("name") String strName,
        Model model
    ){

        log.info("리퀘스트 파라미터 :"+ strStartDate +" "+ strEndDate +" "+ strCoffee +" "+ strName);

        List<Order_list> list = orderSvcV2.doSearch(strStartDate,strEndDate,strCoffee,strName);
        log.info("==========OrderCon==============");
        log.info(list);

        model.addAttribute("list",list);

        log.info("주문서치 리스트 :"+ list);

        return "/v2/order/order";
    }

}
