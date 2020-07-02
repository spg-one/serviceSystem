package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.config.MySessionContext;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.mybatis.domain.AcceptedOrder;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrder;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrderExample;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInfor;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInforExample;
import com.adufeitian.servicesystem.mybatis.mapper.AcceptedOrderMapper;
import com.adufeitian.servicesystem.mybatis.mapper.PendingOrderMapper;
import com.adufeitian.servicesystem.mybatis.mapper.PersonalInforMapper;
import com.adufeitian.servicesystem.security.PasswordCipher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.crypto.Data;

@Service
public class HomePageService {
    @Autowired
    private PersonalInforMapper personalInforMapper;
    @Autowired
    private PendingOrderMapper pendingOrderMapper;
    @Autowired
    private AcceptedOrderMapper acceptedOrderMapper;

    //获取首页上的服务商个人信息
    public boolean getPersonalInfo(final HttpDomain httpd) {
        // 通过Session获取personId
       
        
        final Integer personId = (Integer) httpd.session.getAttribute("personId");

        // 通过personId获取个人信息
        final PersonalInfor personalInfor = personalInforMapper.selectByPrimaryKey(personId);
        httpd.put("user_role", personalInfor.getUserRole());
        httpd.put("real_name", personalInfor.getRealName());
        httpd.put("tell", personalInfor.getTell());
        httpd.put("address", personalInfor.getAddress());
        return true;
    }

    // 获取首页上的待处理工单
    public boolean getPendingOrder(final HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error","请登录");
            return false;
        }

        final PendingOrderExample pendingOrderExample = new PendingOrderExample();

        // 通过Session获取personId，通过personId获取servicerId，再获取服务商的待处理工单
        final Integer servicerId = (Integer) personalInforMapper.selectByPrimaryKey(personId).getServicerId();
        pendingOrderExample.createCriteria().andServicerIdEqualTo(servicerId);
        final List<PendingOrder> pendingOrders = pendingOrderMapper.selectByExample(pendingOrderExample);

        Date date = new Date();
        
        // 获取该服务商的全部待处理工单
        for (final PendingOrder pendingOrder : pendingOrders) {
            final HashMap pendingOrderMap = new HashMap<>();
            pendingOrderMap.put("order_id", pendingOrder.getOrderId());
            pendingOrderMap.put("service_add", pendingOrder.getServiceAdd());
            pendingOrderMap.put("dispatch_time",pendingOrder.getDispatchTime().toString());
            pendingOrderMap.put("customer_name", pendingOrder.getCustomerName());
            pendingOrderMap.put("phone", pendingOrder.getPhone());
            pendingOrderMap.put("service_name", pendingOrder.getServiceName());
            pendingOrderMap.put("deadline", pendingOrder.getDeadline().toString());
            httpd.putToList(pendingOrderMap);
        }
        return true;
    }

   public boolean acceptPendingOrder(HttpDomain httpd) {
       Integer order_id = Integer.parseInt(httpd.request.getParameter("order_id"));
       PendingOrder pendingOrderToAccept = pendingOrderMapper.selectByPrimaryKey(order_id);
       pendingOrderMapper.deleteByPrimaryKey(order_id);
       AcceptedOrder newItem = new AcceptedOrder();
       newItem.setOrderId(pendingOrderToAccept.getOrderId());
       newItem.setServicerId(pendingOrderToAccept.getServicerId());
       newItem.setCustomerName(pendingOrderToAccept.getCustomerName());
       newItem.setServiceAdd(pendingOrderToAccept.getServiceAdd());
       newItem.setOrderTime(pendingOrderToAccept.getDispatchTime());
       newItem.setRequireTime(pendingOrderToAccept.getDeadline());
       newItem.setPhone(pendingOrderToAccept.getPhone());
       newItem.setServiceScName(pendingOrderToAccept.getServiceName());
       newItem.setOrderState("accepted");
       acceptedOrderMapper.insert(newItem);
      return true;
   }

   public boolean refusePendingOrder(HttpDomain httpd) {
    Integer order_id = Integer.parseInt(httpd.request.getParameter("order_id"));
    pendingOrderMapper.deleteByPrimaryKey(order_id);
   return true;
}
}