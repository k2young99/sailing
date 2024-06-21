package com.boot.sailing.v2.controller;

import com.boot.sailing.v2.service.SloSvcV2;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


@Controller
@RequestMapping("/v2")
@Log4j2
public class SloConV2 {

    @Autowired
    SloSvcV2 sloSvc;

    @GetMapping("/slo")
    public String doHome(Model model, @RequestParam(required = false, value = "v") String v){

//  (암호화 키값)   https://10.131.144.40:8080/v2/home?v=dI1OcLHwbOJeX6MQjY8II75F9YWW8RGmmMRR3SLMF8HGhHC7ryRjSEu0a-Cx5OL46y51J5g2liukHkpK7192EA
        log.info("SLO 로그 : " + v);

        SLO_DATA sloData = sloSvc.doSlodata(v);

        model.addAttribute("data",sloData);
        return "/v2/home/slo";
    }


}