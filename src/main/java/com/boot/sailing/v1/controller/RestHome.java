package com.boot.sailing.v1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHome {

    @RequestMapping("v1/rest")
    public String doRest(){

        String str = "rest controller";

        return str;

    }
}
