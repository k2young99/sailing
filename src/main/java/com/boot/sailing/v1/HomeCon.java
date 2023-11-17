package com.boot.sailing.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCon {
    @RequestMapping("/v1/home")
    public String doHome(){

        return "/v1/home/home";
    }
}
