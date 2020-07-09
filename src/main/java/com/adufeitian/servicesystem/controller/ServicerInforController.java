package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.service.ServicerInforService;
import com.adufeitian.servicesystem.mybatis.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgument;



@Controller
@RequestMapping("servicer-info")
public class ServicerInforController {
    @Autowired
    ServicerInforService servicerInforService;

    @RequestMapping(value ="/get-info", method= RequestMethod.GET)
    @ResponseBody
    @HttpDomainArgument
    public  HashMap getServicerInfoHtml(HttpDomain httpd){
        servicerInforService.getServicerInfo(httpd);
        return httpd.getResponseBody();
    }

    @RequestMapping(value ="/getDetail",method = RequestMethod.GET)
    @ResponseBody
    @HttpDomainArgument
    public ServicerInfor getDetail(HttpDomain httpd){
        int servicer_id = (int)httpd.session.getAttribute("servicerId");
        return servicerInforService.getDetail(servicer_id);
    }
}
