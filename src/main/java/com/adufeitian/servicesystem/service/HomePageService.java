package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.config.MySessionContext;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrder;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrderExample;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInfor;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInforExample;
import com.adufeitian.servicesystem.mybatis.mapper.PendingOrderMapper;
import com.adufeitian.servicesystem.mybatis.mapper.PersonalInforMapper;
import com.adufeitian.servicesystem.security.PasswordCipher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Service
public class HomePageService {
    @Autowired
    private PersonalInforMapper personalInforMapper;
    @Autowired
    private PendingOrderMapper pendingOrderMapper;

    //获取首页上的服务商个人信息
    public boolean getPersonalInfo(HttpDomain httpd){
        //通过Session获取personId
        Integer personId = (Integer)httpd.session.getAttribute("personId");
        
        //通过personId获取个人信息
        PersonalInfor personalInfor = personalInforMapper.selectByPrimaryKey(personId);
        httpd.put("user_role", personalInfor.getUserRole());
        httpd.put("real_name", personalInfor.getRealName());
        httpd.put("tell", personalInfor.getTell());
        httpd.put("address", personalInfor.getAddress());
        return true;
    }

    //获取首页上的待处理工单
    public boolean getPendingOrder(HttpDomain httpd){
        PendingOrderExample pendingOrderExample = new PendingOrderExample();

        //通过Session获取personId，通过personId获取servicerId，再获取服务商的待处理工单
        Integer personId = (Integer)httpd.session.getAttribute("personId");
        Integer servicerId = (Integer)personalInforMapper.selectByPrimaryKey(personId).getServicerId();
        pendingOrderExample.createCriteria().andServicerIdEqualTo(servicerId);
        List<PendingOrder> pendingOrders = pendingOrderMapper.selectByExample(pendingOrderExample);

        int i=1;
        //获取该服务商的全部待处理工单
        for(PendingOrder pendingOrder : pendingOrders){
            HashMap pendingOrderMap=new HashMap<>();
            pendingOrderMap.put("number", pendingOrder.getNumber());
            pendingOrderMap.put("service_add", pendingOrder.getServiceAdd());
            pendingOrderMap.put("dispatch_time", pendingOrder.getDispatchTime());
            pendingOrderMap.put("customer_name", pendingOrder.getCustomerName());
            pendingOrderMap.put("phone", pendingOrder.getPhone());
            pendingOrderMap.put("service_name", pendingOrder.getServiceName());
            pendingOrderMap.put("deadline", pendingOrder.getDeadline());
            httpd.put(i, pendingOrderMap);
            i++;
        }
        return true;
    }

  
}