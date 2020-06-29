package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.enums.OrderState;
import com.adufeitian.servicesystem.mybatis.domain.AcceptedOrder;
import com.adufeitian.servicesystem.mybatis.domain.AcceptedOrderExample;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrder;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrderExample;
import com.adufeitian.servicesystem.mybatis.mapper.AcceptedOrderMapper;
import com.adufeitian.servicesystem.mybatis.mapper.PendingOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class OrderService {
    @Autowired
    private PendingOrderMapper pendingOrderMapper;

    @Autowired
    private AcceptedOrderMapper acceptedOrderMapper;

    private ConcurrentHashMap<Integer, Boolean> lockMap;

    public boolean getPendingOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error","请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        PendingOrderExample pendingOrderExample = new PendingOrderExample();
        pendingOrderExample.createCriteria().andServicerIdEqualTo(servicerId);
        List res = pendingOrderMapper.selectByExample(pendingOrderExample);
        httpd.put("pendingOrders",res);
        return true;
    }

    public boolean getAcceptedOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error","请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        AcceptedOrderExample example = new AcceptedOrderExample();
        example.createCriteria().andServicerIdEqualTo(servicerId).andOrderStateEqualTo(OrderState.ACCEPTED.getState());
        List res = acceptedOrderMapper.selectByExample(example);
        httpd.put("acceptedOrders",res);
        return true;
    }

    public boolean acceptOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error","请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");

        Integer orderId = null;
        String orderIdString = httpd.request.getParameter("orderId");
        try {
            orderId = Integer.parseInt(orderIdString);
        } catch (Exception e) {
            httpd.put("error","请输入正确的订单号");
            return false;
        }
        PendingOrder pendingOrder = pendingOrderMapper.selectByPrimaryKey(orderId);

        if(pendingOrder == null|| pendingOrder.getServicerId()!=servicerId) {
            httpd.put("error","该订单号无效");
            return false;
        }

        if(lockMap.get(pendingOrder.getOrderId())!=null) {
            synchronized (OrderService.class) {
                if(lockMap.get(pendingOrder.getOrderId())!=null) {

                }
            }
        }
        //continue...
        return true;
    }
    private void transform(PendingOrder pendingOrder, AcceptedOrder acceptedOrder) {
        acceptedOrder.setOrderId(pendingOrder.getOrderId());
        acceptedOrder.setCustomerName(pendingOrder.getCustomerName());
        acceptedOrder.setOrderTime(new Date());
        acceptedOrder.setPhone(pendingOrder.getPhone());
        acceptedOrder.setServiceAdd(pendingOrder.getServiceAdd());
        acceptedOrder.setServiceScName(pendingOrder.getServiceName());
        acceptedOrder.setRequireTime(pendingOrder.getDeadline());
    }
}
