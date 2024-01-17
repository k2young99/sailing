package com.boot.sailing.v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v2")
public class HomeConV2 {

    @GetMapping("/home")
    public String doHome(){

        return "/v2/home/home";
    }

    @GetMapping("/rest2")
    @ResponseBody
    public String doRest(){

        String str = "<html><body>rest con+respnse body</body></html>";

        return str;
    }

}