package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgument;
import com.adufeitian.servicesystem.mybatis.domain.ServicerInforExample;
import com.adufeitian.servicesystem.mybatis.mapper.ServicerInforMapper;
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
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    /**
     * 请求的路径为 get:{controllerMapping}/login
     * @return 返回login页面
     */
    @GetMapping(value = {"","/"})
    String getLoginTemplate() {
        return "login";
    }

    /**
     * 请求的路径为 post:{controllerMapping}/login-post
     * 请求数据为
     *  user_name(string): 用户名
     *  password(string): 密码
     * 返回数据为
     *  登录成功返回 code:200 {"success":"登录成功"}
     *  用户名或密码错误 code:400 {"error":"用户名或者密码不正确"}
     *  重复登录 code:400 {"error":"请勿重复登录"}
     *  过多设备登录 code:400 {"error":"登录失败，该用户在不同设备上登录数量达到上限"}
     * @param httpd
     * @return 返回回馈信息
     */
    @PostMapping("/login-post")
    @HttpDomainArgument
    @ResponseBody
    HashMap LoginPost(HttpDomain httpd) {
        loginService.login(httpd);
        return httpd.getResponseBody();
    }

    /**
     * 请求的路径为 get:{controllerMapping}/logout
     * 返回的数据为
     *  登出成功 code:200 {"success","登出成功"}
     *  登出失败(还未登录) code:400 {"error","请先登录"}
     * @param httpd
     * @return
     */
    @GetMapping("/logout")
    @HttpDomainArgument
    @ResponseBody
    HashMap Logout(HttpDomain httpd) {
        loginService.logout(httpd);
        return httpd.getResponseBody();
    }
}


