package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.mybatis.domain.*;
import com.adufeitian.servicesystem.mybatis.mapper.PersonalInforMapper;
import com.adufeitian.servicesystem.mybatis.mapper.CommentInforMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

@Service
public  class CommentService{
    @Autowired
    private CommentInforMapper commentInforMapper;
    @Autowired
    private PersonalInforMapper personalInforMapper;

    public boolean getCommentDetails(HttpDomain httpd){
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if(personId == null){
            httpd.setStatus(400);
            httpd.put("error","请登录");
            return false;
        }
        String orderNumber = httpd.request.getParameter("orderNumber");
        System.out.println(orderNumber);
        CommentInfor commentDetail = commentInforMapper.selectByPrimaryKey(orderNumber);
        httpd.put("commentDetail", commentDetail);
        return true;
    } 

    public boolean getComment(final HttpDomain httpd){
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if(personId == null){
            httpd.setStatus(400);
            httpd.put("error","请登录");
            return false;
        }
        
        final  CommentInforExample commentInforExample = new CommentInforExample();
        final Integer servicerId = (Integer) personalInforMapper.selectByPrimaryKey(personId).getServicerId();
        commentInforExample.createCriteria().andServicerIdEqualTo(servicerId);
        final List<CommentInfor> commentInfors = commentInforMapper.selectByExample(commentInforExample);
        httpd.put("commentInfors", commentInfors);
        return true;
    }
}