package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgument;
import com.adufeitian.servicesystem.service.HomePageService;
import com.adufeitian.servicesystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("home-page")
public class HomePageController {
   @Autowired
   HomePageService homepageService;

   /**
    * 请求的路径为 get:home-page/personal-info return 返回首页上的服务商个人信息
    */
   @GetMapping("/personal-info")
   @HttpDomainArgument
   @ResponseBody
   HashMap getHomePagePersonalData(HttpDomain httpd) {
      // HashMap hh = new HashMap<>();
      // hh.put("1", 2222);
      // return hh;
      homepageService.getPersonalInfo(httpd);
      return httpd.getResponseBody();
   }

   /**
    * 请求的路径为 get:home-page/pending-order return 返回首页上的待处理工单
    */
   @GetMapping("/pending-order")
   @HttpDomainArgument
   @ResponseBody
   Object getHomePagePendingOrder(HttpDomain httpd) {
      homepageService.getPendingOrder(httpd);
      if (httpd.getResponseBody()!=null && httpd.getResponseBody().containsKey("error")) {
         return httpd.getResponseBody();
      } else {
         return httpd.getResponseBodyList();
      }

   }

   @PostMapping("/accept-order")
   @HttpDomainArgument
   @ResponseBody
   Object acceptPendingOrder(HttpDomain httpd) {
      homepageService.acceptPendingOrder(httpd);
      return true;
   }

   @PostMapping("/refuse-order")
   @HttpDomainArgument
   @ResponseBody
   Object refusePendingOrder(HttpDomain httpd) {
         homepageService.refusePendingOrder(httpd);
      return true;
   }
}