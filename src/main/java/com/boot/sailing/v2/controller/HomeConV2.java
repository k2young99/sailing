package com.boot.sailing.v2.controller;

import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
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
public class HomeConV2 {

    @GetMapping("/home")
    public String doHome(Model model, @RequestParam("v") String v){

        log.info("SLO 로그 : " + v);

        try{

      String sloKey = "6203b70dMOINmoin|67af8bcf6c386f7ef3ce875f0c8d5cad";
        String json = MOIN.Security.Cryptography.SymmetricDecrypt.DecryptToken(v, sloKey);
        System.out.println("DecryptToken : \n\t" + json + "\n");

        Gson gson = new Gson();
        SLO_DATA sloLoginData = gson.fromJson(json, SLO_DATA.class);

            // SLO 확인을 위한 email 데이터 전달
            System.out.println("email : " + sloLoginData.email);

            System.out.println("timestamp : " + sloLoginData.timestamp);

            model.addAttribute("data",sloLoginData.email);

        } catch (InvalidKeyException | UnsupportedEncodingException | NoSuchAlgorithmException
                | NoSuchPaddingException | InvalidAlgorithmParameterException | IllegalBlockSizeException
                | BadPaddingException el) {
            el.printStackTrace();
        }

        return "/v2/home/home";
    }

    @GetMapping("/rest2")
    @ResponseBody
    public String doRest(){

        String str = "<html><body>rest con+respnse body</body></html>";

        return str;
    }

    class SLO_DATA{
        public String employee_num;
        public String login_id;
        public String timestamp;
        public String hostaddress;
        public String email;
    }

}