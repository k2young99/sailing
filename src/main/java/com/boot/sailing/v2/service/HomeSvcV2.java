package com.boot.sailing.v2.service;

import com.boot.sailing.v2.dao.MenuDaoV2;
import com.boot.sailing.v2.vo.Coffee_menu;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class HomeSvcV2 {

    public HomeSvcV2() {
        log.info("================ MenuSvc , 생성자 ===================");
    }

}
