package com.adufeitian.servicesystem.controller;


import com.adufeitian.servicesystem.mybatis.domain.ComplainInforTime;
import com.adufeitian.servicesystem.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Controller
public class ComplainController {

    @Autowired
    ComplainService complainService;


    @ResponseBody
    @RequestMapping("/getComInfor")
    public List<ComplainInforTime> getComplainInfor(String idORperson, String business, String dealState){
        List<ComplainInforTime> list;
        Object obj = idORperson;
        if(isNumeric((String) obj)){
            list = complainService.getComplainInforById((Integer) obj,business,dealState);
            return list;
        }
        else{
            list = complainService.getComplainInforByPerson((String) obj,business,dealState);
            return list;
        }
    }

    @ResponseBody
    @RequestMapping("/getComInforAll")
    public List<ComplainInforTime> getComInforAll(){
        List<ComplainInforTime> list = complainService.getComInforAll();
        return list;
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }



}
