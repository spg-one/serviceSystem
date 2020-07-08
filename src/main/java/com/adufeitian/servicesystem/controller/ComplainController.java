package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@Controller
public class ComplainController {

    @Autowired
    ComplainService complainService;

    public Map<String,Object> getComplainInfor(Object idORperson,String business){
        Map<String,Object> map = new HashMap<>();
        if(isNumeric((String) idORperson)){
            map = complainService.getComplainInforById((Integer) idORperson,business);
            return map;
        }
        else{
            map = complainService.getComplainInforByPerson((String) idORperson,business);
            return map;
        }
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }


}
