package com.boot.sailing.v2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeV2 {

    @RequestMapping("v2/rest")
    public String doRest(){

        String str = "rest controller";

        return str;

    }
}
