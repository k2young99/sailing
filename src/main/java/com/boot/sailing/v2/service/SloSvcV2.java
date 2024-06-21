package com.boot.sailing.v2.service;

import com.boot.sailing.v2.controller.SLO_DATA;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Service
@Log4j2
public class SloSvcV2 {

    public SloSvcV2() {
        log.info("================ SloSvcV2 , 생성자 ===================");
    }

    public SLO_DATA doSlodata(String v) {

        SLO_DATA sloLoginData = null;
        try {

            String sloKey = "6203b70dMOINmoin|67af8bcf6c386f7ef3ce875f0c8d5cad";
            String json = MOIN.Security.Cryptography.SymmetricDecrypt.DecryptToken(v, sloKey);
            System.out.println("DecryptToken : \n\t" + json + "\n");

            Gson gson = new Gson();
            sloLoginData = gson.fromJson(json, SLO_DATA.class);

            // SLO 확인을 위한 email 데이터 전달
            System.out.println("email : " + sloLoginData.email);

            System.out.println("timestamp : " + sloLoginData.timestamp);

        } catch (InvalidKeyException | UnsupportedEncodingException | NoSuchAlgorithmException
                 | NoSuchPaddingException | InvalidAlgorithmParameterException | IllegalBlockSizeException
                 | BadPaddingException el) {
            el.printStackTrace();
        }

        return sloLoginData;
    }

}
