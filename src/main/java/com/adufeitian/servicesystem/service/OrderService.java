package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.enums.OrderServiceMode;
import com.adufeitian.servicesystem.enums.OrderState;
import com.adufeitian.servicesystem.enums.OrderUrgency;
import com.adufeitian.servicesystem.mybatis.domain.AcceptedOrder;
import com.adufeitian.servicesystem.mybatis.domain.AcceptedOrderExample;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrder;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrderExample;
import com.adufeitian.servicesystem.mybatis.mapper.AcceptedOrderMapper;
import com.adufeitian.servicesystem.mybatis.mapper.PendingOrderMapper;
import com.adufeitian.servicesystem.util.CheckString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
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

    private ConcurrentHashMap<Integer, Boolean> lockMap = new ConcurrentHashMap<>();

    public boolean getPendingOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error", "请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        PendingOrderExample pendingOrderExample = new PendingOrderExample();
        pendingOrderExample.createCriteria().andServicerIdEqualTo(servicerId);
        List res = pendingOrderMapper.selectByExample(pendingOrderExample);
        httpd.put("pendingOrders", res);
        return true;
    }

    public boolean getAcceptedOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error", "请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        AcceptedOrderExample example = new AcceptedOrderExample();
        example.createCriteria().andServicerIdEqualTo(servicerId).andOrderStateEqualTo(OrderState.ACCEPTED.getState());
        AcceptedOrderExample example2 = new AcceptedOrderExample();
        
        example.or(example2.createCriteria().andServicerIdEqualTo(servicerId).andOrderStateEqualTo(OrderState.PROCESSING.getState()));
        List res = acceptedOrderMapper.selectByExample(example);
        httpd.put("acceptedOrders", res);
        return true;
    }

    public boolean getHandledOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error", "请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        AcceptedOrderExample example = new AcceptedOrderExample();
        example.createCriteria().andServicerIdEqualTo(servicerId).andOrderStateEqualTo(OrderState.HANDLED.getState());
        List res = acceptedOrderMapper.selectByExample(example);
        httpd.put("handledOrders", res);
        return true;
    }

    public boolean getHandledOrderInfor(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error", "请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        Integer orderId = null;
        String orderIdString = httpd.request.getParameter("orderId");
        try {
            orderId = Integer.parseInt(orderIdString);
        } catch (Exception e) {
            httpd.setStatus(400);
            httpd.put("error", "请输入正确的订单号");
            return false;
        }
        AcceptedOrder acceptedOrder = acceptedOrderMapper.selectByPrimaryKey(orderId);
        if (acceptedOrder == null || acceptedOrder.getServicerId() != servicerId
                || acceptedOrder.getOrderState().equals(OrderState.HANDLED.getState())) {
            httpd.setStatus(400);
            httpd.put("error", "该订单号无效");
            return false;
        }
        httpd.put("handledOrderInfor", acceptedOrder);
        return true;
    }

    public boolean acceptOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error", "请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");

        Integer orderId = null;
        String orderIdString = httpd.request.getParameter("orderId");
        try {
            orderId = Integer.parseInt(orderIdString);
        } catch (Exception e) {
            httpd.setStatus(400);
            httpd.put("error", "请输入正确的订单号");
            return false;
        }
        PendingOrder pendingOrder = pendingOrderMapper.selectByPrimaryKey(orderId);

        if (pendingOrder == null || pendingOrder.getServicerId() != servicerId) {
            httpd.setStatus(400);
            httpd.put("error", "该订单号无效");
            return false;
        }

        if (lockMap.get(pendingOrder.getOrderId()) == null) {
            synchronized (OrderService.class) {
                if (lockMap.get(pendingOrder.getOrderId()) == null) {
                    lockMap.put(pendingOrder.getOrderId(), true);
                    AcceptedOrder acceptedOrder = new AcceptedOrder();
                    transform(pendingOrder, acceptedOrder);
                    pendingOrderMapper.deleteByPrimaryKey(pendingOrder.getOrderId());
                    acceptedOrder.setOrderState(OrderState.ACCEPTED.getState());
                    acceptedOrderMapper.insertSelective(acceptedOrder);
                    httpd.put("success", "接受成功");
                    return true;
                } else {
                    httpd.setStatus(400);
                    httpd.put("error", "该订单号无效");
                    return false;
                }
            }
        } else {
            httpd.setStatus(400);
            httpd.put("error", "该订单号无效");
            return false;
        }
    }

    private void transform(PendingOrder pendingOrder, AcceptedOrder acceptedOrder) {
        acceptedOrder.setOrderId(pendingOrder.getOrderId());
        acceptedOrder.setCustomerName(pendingOrder.getCustomerName());
        acceptedOrder.setOrderTime(new Date());
        acceptedOrder.setPhone(pendingOrder.getPhone());
        acceptedOrder.setServiceAdd(pendingOrder.getServiceAdd());
        acceptedOrder.setServiceScName(pendingOrder.getServiceName());
        acceptedOrder.setServicerId(pendingOrder.getServicerId());
        acceptedOrder.setRequireTime(pendingOrder.getDeadline());
    }

    public boolean rejectOrder(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error", "请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        Integer orderId = null;
        String orderIdString = httpd.request.getParameter("orderId");
        try {
            orderId = Integer.parseInt(orderIdString);
        } catch (Exception e) {
            httpd.setStatus(400);
            httpd.put("error", "请输入正确的订单号");
            return false;
        }
        PendingOrder pendingOrder = pendingOrderMapper.selectByPrimaryKey(orderId);

        if (pendingOrder == null || pendingOrder.getServicerId() != servicerId) {
            httpd.setStatus(400);
            httpd.put("error", "该订单号无效");
            return false;
        }

        if (lockMap.get(pendingOrder.getOrderId()) == null) {
            synchronized (OrderService.class) {
                if (lockMap.get(pendingOrder.getOrderId()) == null) {
                    lockMap.put(pendingOrder.getOrderId(), false);
                    pendingOrderMapper.deleteByPrimaryKey(orderId);
                    httpd.put("success", "拒绝成功");
                    return true;
                } else {
                    httpd.setStatus(400);
                    httpd.put("error", "该订单号无效");
                    return false;
                }
            }
        } else {
            httpd.setStatus(400);
            httpd.put("error", "该订单号无效");
            return false;
        }
    }

    public boolean checkHandle(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId == null) {
            httpd.setStatus(400);
            httpd.put("error", "请登录");
            return false;
        }
        Integer servicerId = (Integer) httpd.session.getAttribute("servicerId");
        Integer orderId = null;
        String orderIdString = httpd.request.getParameter("orderId");
        try {
            orderId = Integer.parseInt(orderIdString);
        } catch (Exception e) {
            httpd.setStatus(400);
            httpd.put("error", "请输入正确的订单号");
            return false;
        }
        AcceptedOrder acceptedOrder = acceptedOrderMapper.selectByPrimaryKey(orderId);

        if (acceptedOrder == null || acceptedOrder.getServicerId() != servicerId) {
            httpd.put("error", "该订单号无效");
            httpd.setStatus(400);
            return false;
        } else if (acceptedOrder.getOrderState().equals(OrderState.HANDLED.getState())) {
            httpd.put("error", "该订单已被处理");
            httpd.setStatus(400);
            return false;
        } else {
            return true;
        }
    }

    public boolean handleOrder(HttpDomain httpd) {
        if (!checkHandle(httpd)) {
            return false;
        }
        Integer orderIdString = Integer.parseInt(httpd.request.getParameter("orderId"));
        AcceptedOrder acceptedOrder = acceptedOrderMapper.selectByPrimaryKey(orderIdString);
        // check the input
        /* String serviceLcName = httpd.request.getParameter("serviceLcName"); */
        /* String marchantAdd = httpd.request.getParameter("marchantAdd"); */
        String urgency = httpd.request.getParameter("urgency");
        /* String orderSource = httpd.request.getParameter("orderSource"); */
        /* String serviceMode = httpd.request.getParameter("serviceMode"); */
        /* String serviceProName = httpd.request.getParameter("serviceProName"); */
        /* String servicePhone = httpd.request.getParameter("servicePhone"); */
        String serviceCharge = httpd.request.getParameter("serviceCharge");
        String serviceDuration = httpd.request.getParameter("serviceDuration");
        String serviceCount = httpd.request.getParameter("serviceCount");
        String servicePersonname = httpd.request.getParameter("servicePersonname");
        String servicePersonphone = httpd.request.getParameter("servicePersonphone");
        /* String serviceRequire = httpd.request.getParameter("serviceRequire"); */
        String serviceTimes = httpd.request.getParameter("serviceTimes");

        /* if (serviceLcName == null || !CheckString.stringLengthcheck(serviceLcName, 1, 10)) {
            httpd.put("error", "请输入服务大类信息");
            httpd.setStatus(400);
            return false;
        }
        if (marchantAdd == null || !CheckString.stringLengthcheck(marchantAdd, 1, 20)) {
            httpd.put("error", "请输入商家服务点信息");
            httpd.setStatus(400);
            return false;
        } */
        OrderUrgency orderUrgency = OrderUrgency.getOrderUrgency(urgency);
        if (orderUrgency == null) {
            httpd.put("error", "请输入正确的工单紧急程度信息");
            httpd.setStatus(400);
            return false;
        }
        /* if (orderSource == null || !CheckString.stringLengthcheck(orderSource, 1, 10)) {
            httpd.put("error", "请输入正确的工单来源信息");
            httpd.setStatus(400);
            return false;
        } */
       /*  OrderServiceMode orderServiceMode = OrderServiceMode.getOrderServiceMode(serviceMode);
        if (orderServiceMode == null) {
            httpd.put("error", "请输入正确的服务方式信息");
            httpd.setStatus(400);
            return false;
        } */
        /* if (serviceProName == null || !CheckString.stringLengthcheck(serviceProName, 1, 10)) {
            httpd.put("error", "请输入正确的服务方名称信息");
            httpd.setStatus(400);
            return false;
        }
        if (servicePhone == null || !CheckString.stringLengthcheck(servicePhone, 1, 20)) {
            httpd.put("error", "请输入正确的服务电话信息");
            httpd.setStatus(400);
            return false;
        } */
        if (serviceCharge == null || !CheckString.stringLengthcheck(serviceCharge, 1, 10)) {
            httpd.put("error", "请输入正确的服务单价信息");
            httpd.setStatus(400);
            return false;
        }
        if (serviceDuration == null || !CheckString.stringLengthcheck(serviceDuration, 1, 10)) {
            httpd.put("error", "请输入正确的服务时长信息");
            httpd.setStatus(400);
            return false;
        }
        if (serviceCount == null || !CheckString.stringLengthcheck(serviceCount, 1, 10)) {
            httpd.put("error", "请输入正确的服务总价信息");
            httpd.setStatus(400);
            return false;
        }
        if (servicePersonname == null || !CheckString.stringLengthcheck(servicePersonname, 1, 10)) {
            httpd.put("error", "请输入正确的服务人员姓名信息");
            httpd.setStatus(400);
            return false;
        }
        if (servicePersonphone == null || !CheckString.stringLengthcheck(servicePersonphone, 1, 20)) {
            httpd.put("error", "请输入正确的服务人员电话信息");
            httpd.setStatus(400);
            return false;
        }
        /* if (serviceRequire == null || !CheckString.stringLengthcheck(serviceRequire, 1, 100)) {
            httpd.put("error", "请输入正确的服务要求信息");
            httpd.setStatus(400);
            return false;
        }  */
        Integer serviceTimesInt = null;
        try {
            serviceTimesInt = Integer.parseInt(serviceTimes);
        } catch (NumberFormatException e) {
            httpd.put("error", "请输入正确的服务次数信息");
            httpd.setStatus(400);
            return false;
        }
        /* acceptedOrder.setServiceLcName(serviceLcName);
        acceptedOrder.setMarchantAdd(marchantAdd); */
        acceptedOrder.setUrgency(urgency);
        /* acceptedOrder.setOrderSourse(orderSource);
        acceptedOrder.setServiceMode(serviceMode);
        acceptedOrder.setServiceProName(serviceProName);
        acceptedOrder.setServicePhone(servicePhone); */
        acceptedOrder.setServiceCharge(serviceCharge);
        acceptedOrder.setServiceDuration(serviceDuration);
        acceptedOrder.setServiceCount(serviceCount);
        acceptedOrder.setServicePersonname(servicePersonname);
        acceptedOrder.setServicePersonphone(servicePersonphone);
        /* acceptedOrder.setServiceRequire(serviceRequire); */
        acceptedOrder.setServiceTimes(serviceTimesInt);
        acceptedOrder.setOrderState(OrderState.HANDLED.getState());
        if (lockMap.get(acceptedOrder.getOrderId()) == null) {
            synchronized (OrderService.class) {
                if (lockMap.get(acceptedOrder.getOrderId()) == null) {
                    lockMap.put(acceptedOrder.getOrderId(), true);
                    acceptedOrderMapper.updateByPrimaryKeySelective(acceptedOrder);
                    httpd.put("success", "处理成功");
                    return true;
                } else {
                    httpd.setStatus(400);
                    httpd.put("error", "该订单号无效");
                    return false;
                }
            }
        } else {
            httpd.setStatus(400);
            httpd.put("error", "该订单号无效");
            return false;
        }
    }

    public boolean setServicePerson(HttpDomain httpd) {
        Integer orderIdString = Integer.parseInt(httpd.request.getParameter("orderId"));
        String servicePersonname = httpd.request.getParameter("servicePersonname");
        String orderState = httpd.request.getParameter("orderState");
        AcceptedOrder orderToUpdate =new AcceptedOrder();
        orderToUpdate.setOrderId(orderIdString);
        orderToUpdate.setServicePersonname(servicePersonname);
        orderToUpdate.setOrderState(orderState);
        acceptedOrderMapper.updateByPrimaryKeySelective(orderToUpdate);
        return true;
    }

   

}
