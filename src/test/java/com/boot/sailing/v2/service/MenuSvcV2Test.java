package com.boot.sailing.v2.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MenuSvcV2Test {

    @Autowired
    MenuSvcV2 menuSvcV2;

    @Test
    void doUpdateInsert() {
        List<String> chkList = new ArrayList<>();
        chkList.add("1");
        chkList.add("2");

        String strPrice = "898989";

        try{
            menuSvcV2.doUpdateInsert(chkList,strPrice);
        } catch(Exception e){
            System.out.println("=============== Test =="+e.getMessage());
        }
    }
}