package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgument;
import com.adufeitian.servicesystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("get-pending-order")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getPendingOrder(HttpDomain httpd) {
        orderService.getPendingOrder(httpd);
        return httpd.getResponseBody();
    }

    @GetMapping("get-accepted-order")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getAcceptedOrder(HttpDomain httpd) {

    }

}
