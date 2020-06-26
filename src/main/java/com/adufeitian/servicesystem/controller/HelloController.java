package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgument;
import com.adufeitian.servicesystem.service.HelloService;
import com.adufeitian.servicesystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


@Controller
@RequestMapping("hello")
public class HelloController{
    @Autowired
    private HelloService helloservice;
    @RequestMapping("/helloa")
    public String hhh(){
        return helloservice.hello();
    }
    

}