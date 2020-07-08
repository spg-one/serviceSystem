package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomainArgument;
import com.adufeitian.servicesystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 请求的路径为 get:{controllerMapping}/get-pending-order
     * 返回的数据为
     *  获取成功 code:200 {"pendingOrders",
     *      [{
     *          "orderId":number,
     *          "servicerId":number,
     *          "serviceAdd":string,
     *          "dispatchTime":timestamp(ms),
     *          "customerName":string,
     *          "phone":string,
     *          "serviceName":string,
     *          "deadline":timestamp(ms)
     *      }]
     *  }
     *  获取失败(还未登录) code:400 {"error","请登录"}
     * @param httpd
     * @return
     */
    @GetMapping("get-pending-order")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getPendingOrder(HttpDomain httpd) {
        orderService.getPendingOrder(httpd);
        return httpd.getResponseBody();
    }

    /**
     * 请求的路径为 get:{controllerMapping}/get-accepted-order
     * 返回的数据为
     *  获取成功 code:200 {"acceptedOrders",
     *      [{
     *          "orderId":number,
     *          "servicerId":number,
     *          "marchantAdd":null,
     *          "customerName":string,
     *          "orderTime":timestamp(ms),
     *          "phone":string,
     *          "serviceAdd":string,
     *          "serviceLcName":null,
     *          "serviceScName":string,
     *          "requireTime":timestamp(ms),
     *          "urgency":null,
     *          "orderState":"accepted",
     *          "orderSourse":null,
     *          "serviceMode":null,
     *          "serviceProName":null,
     *          "servicePhone":null,
     *          "serviceCharge":null,
     *          "serviceDuration":null,
     *          "serviceCount":null,
     *          "servicePersonname":null,
     *          "servicePersonphone":null,
     *          "serviceRequire":null,
     *          "serviceTimes":null
     *      }]
     *  }
     *  获取失败(还未登录) code:400 {"error","请登录"}
     * @param httpd
     * @return
     */
    @GetMapping("get-accepted-order")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getAcceptedOrder(HttpDomain httpd) {
        orderService.getAcceptedOrder(httpd);
        return httpd.getResponseBody();
    }

    /**
     * 请求的路径为 get:{controllerMapping}/get-handled-order
     * 返回的数据为
     *  获取成功 code:200 {"handledOrders",
     *      [{
     *          "orderId":number,
     *          "servicerId":number,
     *          "marchantAdd":string,
     *          "customerName":string,
     *          "orderTime":timestamp(ms),
     *          "phone":string,
     *          "serviceAdd":string,
     *          "serviceLcName":string,
     *          "serviceScName":string,
     *          "requireTime":timestamp(ms),
     *          "urgency":"一般"/"紧急",
     *          "orderState":"accepted",
     *          "orderSourse":string,
     *          "serviceMode":"按分钟"/"按小时"/"按天数",
     *          "serviceProName":string,
     *          "servicePhone":string,
     *          "serviceCharge":string,
     *          "serviceDuration":string,
     *          "serviceCount":string,
     *          "servicePersonname":string,
     *          "servicePersonphone":string,
     *          "serviceRequire":string,
     *          "serviceTimes":number
     *      }]
     *  }
     *  获取失败(还未登录) code:400 {"error","请登录"}
     * @param httpd
     * @return
     */
    @GetMapping("get-handled-order")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getHandledOrder(HttpDomain httpd) {
        orderService.getHandledOrder(httpd);
        return httpd.getResponseBody();
    }

    /**
     * 请求的路径为 get:{controllerMapping}/get-handled-order
     * 请求数据为
     * orderId(int): 订单号
     * 返回的数据为
     *  获取成功 code:200 {"handledOrderInfor",
     *      {
     *          "orderId":number,
     *          "servicerId":number,
     *          "marchantAdd":string,
     *          "customerName":string,
     *          "orderTime":timestamp(ms),
     *          "phone":string,
     *          "serviceAdd":string,
     *          "serviceLcName":string,
     *          "serviceScName":string,
     *          "requireTime":timestamp(ms),
     *          "urgency":"一般"/"紧急",
     *          "orderState":"accepted",
     *          "orderSourse":string,
     *          "serviceMode":"按分钟"/"按小时"/"按天数",
     *          "serviceProName":string,
     *          "servicePhone":string,
     *          "serviceCharge":string,
     *          "serviceDuration":string,
     *          "serviceCount":string,
     *          "servicePersonname":string,
     *          "servicePersonphone":string,
     *          "serviceRequire":string,
     *          "serviceTimes":number
     *      }
     *  }
     *  获取失败(还未登录) code:400 {"error","请登录"}
     *  订单号不为有效数字 code:400 {"error","请输入正确的订单号"}
     *  订单不存在；用户所在serviceId与订单不一致；订单不是已处理订单 code:400 {"error","该订单号无效"}
     * @param httpd
     * @return
     */
    @GetMapping("get-handled-order-infor")
    @ResponseBody
    @HttpDomainArgument
    public HashMap getHandledOrderInfor(HttpDomain httpd) {
        orderService.getHandledOrderInfor(httpd);
        return httpd.getResponseBody();
    }

    /**
     * 请求的路径为 post:{controllerMapping}/accept
     * 请求数据为
     *  orderId(int): 订单号
     * 返回数据为
     *  接受成功返回 code:200 {"success":"接受成功"}
     *  接受失败(还未登录) code:400 {"error","请登录"}
     *  订单号不为有效数字 code:400 {"error","请输入正确的订单号"}
     *  订单不存在；用户所在serviceId与订单不一致；订单正在其他用户所接受 code:400 {"error","该订单号无效"}
     * @param httpd
     * @return 返回回馈信息
     */
    @PostMapping("accept")
    @ResponseBody
    @HttpDomainArgument
    public HashMap accept(HttpDomain httpd) {
        orderService.acceptOrder(httpd);
        return httpd.getResponseBody();
    }

    /**
     * 请求的路径为 post:{controllerMapping}/reject
     * 请求数据为
     *  orderId(int): 订单号
     * 返回数据为
     *  拒绝成功返回 code:200 {"success":"拒绝成功"}
     *  拒绝失败(还未登录) code:400 {"error","请登录"}
     *  订单号不为有效数字 code:400 {"error","请输入正确的订单号"}
     *  订单不存在；用户所在serviceId与订单不一致；订单正在其他用户所拒绝 code:400 {"error","该订单号无效"}
     * @param httpd
     * @return 返回回馈信息
     */
    @PostMapping("reject")
    @ResponseBody
    @HttpDomainArgument
    public HashMap reject(HttpDomain httpd) {
        orderService.rejectOrder(httpd);
        return httpd.getResponseBody();
    }

    /**
     * 请求的路径为 post:{controllerMapping}/handle
     * 请求数据为
     *  orderId(int): 订单号
     *  serviceLcName(string): 服务大类信息
     *  marchantAdd(string): 商家服务点
     *  urgency(string){"一般","紧急"}: 工单紧急程度
     *  orderSource(string): 工单来源
     *  serviceMode(string){"按分钟","按小时","按天数"}: 服务方式
     *  serviceProName(string): 服务方名称
     *  servicePhone(string): 服务电话
     *  serviceCharge(string): 服务单价
     *  serviceDuration(string): 服务时长
     *  serviceCount(string): 服务总价
     *  servicePersonname(string): 服务人员姓名
     *  servicePersonphone(string): 服务人员电话
     *  serviceRequire(string): 服务要求
     *  serviceTimes(int): 服务次数
     * 返回数据为
     *  处理成功返回 code:200 {"success":"处理成功"}
     *  处理失败(还未登录) code:400 {"error","请登录"}
     *  订单号不为有效数字 code:400 {"error","请输入正确的订单号"}
     *  订单不存在；用户所在serviceId与订单不一致；订单正在其他用户所处理 code:400 {"error","该订单号无效"}
     *  订单已被处理 code:400 {"error","该订单已被处理"}
     *  请求数据不合格（长度过长过短或无，格式不正确）code:400 {"error","请输入正确的****信息"}
     * @param httpd
     * @return 返回回馈信息
     */
    @PostMapping("handle")
    @ResponseBody
    @HttpDomainArgument
    public HashMap handle(HttpDomain httpd) {
        orderService.handleOrder(httpd);
        return httpd.getResponseBody();
    }

    
}
