package com.boot.sailing.v2.controller;

import com.boot.sailing.v2.service.HomeSvcV2;
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

    HomeSvcV2 homeSvc;

    @GetMapping("/home")
    public String doHome(Model model, @RequestParam(required = false, value = "v") String v){
/*

//  (암호화 키값)   https://10.131.144.40:8080/v2/home?v=dI1OcLHwbOJeX6MQjY8II75F9YWW8RGmmMRR3SLMF8HGhHC7ryRjSEu0a-Cx5OL46y51J5g2liukHkpK7192EA
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

            model.addAttribute("data",sloLoginData);

        } catch (InvalidKeyException | UnsupportedEncodingException | NoSuchAlgorithmException
                | NoSuchPaddingException | InvalidAlgorithmParameterException | IllegalBlockSizeException
                | BadPaddingException el) {
            el.printStackTrace();
        }
*/



        return "/v2/home/home";
    }

    @GetMapping("/rest2")
    @ResponseBody
    public String doRest(){

        String str = "<html><body>rest con+respnse body</body></html>";

        return str;
    }

    /*
    class SLO_DATA{
        public String employee_num;
        public String login_id;
        public String timestamp;
        public String hostaddress;
        public String email;
    }*/

}