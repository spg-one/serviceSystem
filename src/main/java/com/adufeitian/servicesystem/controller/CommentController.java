package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgument;
import com.adufeitian.servicesystem.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
@Controller
@RequestMapping("comment")
public class CommentController{
    @Autowired
    private CommentService commentService;

    @GetMapping("get-comment")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getComment(HttpDomain httpd){
        commentService.getComment(httpd);
        return httpd.getResponseBody();
    }
    /**
     * 请求路径为get:{controllerMapping}/get-comment-details
     * 返回数据为
     *   获取成功 code:200{"CommentDetails"
     *   {
     *       "orderId":number,
     *       "servicerId":number,
     *       "urgency":"一般"/"紧急",
     *       "customerName":string,
     *       "phone":string,
     *       "serviceLcName":string,
     *       "serviceScName":string,
     *       "provideName":string,
     *       "servicePersonname":string,
     *       "servicePersonphone":string,
     *       "dealDate":timestamp(ms),
     *       "dealState":string,
     *       "serviceComment":"差评"/"一般"/"好评",
     *       "commentinfo":spring
     *   }
     * }
     * @param httpd
     * @return
     */
    @GetMapping("get-comment-details")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getCommentDetails(HttpDomain httpd){
        
        commentService.getCommentDetails(httpd);
        return httpd.getResponseBody();
    }
}