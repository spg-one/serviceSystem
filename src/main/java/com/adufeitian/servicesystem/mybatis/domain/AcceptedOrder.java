package com.adufeitian.servicesystem.mybatis.domain;

import java.util.Date;

public class AcceptedOrder {
    private Integer orderId;

    private Integer servicerId;

    private String marchantAdd;

    private String customerName;

    private Date orderTime;

    private String phone;

    private String serviceAdd;

    private String serviceLcName;

    private String serviceScName;

    private Date requireTime;

    private String urgency;

    private String orderState;

    private String orderSourse;

    private String serviceMode;

    private String serviceProName;

    private String servicePhone;

    private String serviceCharge;

    private String serviceDuration;

    private String serviceCount;

    private String servicePersonname;

    private String servicePersonphone;

    private String serviceRequire;

    private Integer serviceTimes;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getServicerId() {
        return servicerId;
    }

    public void setServicerId(Integer servicerId) {
        this.servicerId = servicerId;
    }

    public String getMarchantAdd() {
        return marchantAdd;
    }

    public void setMarchantAdd(String marchantAdd) {
        this.marchantAdd = marchantAdd == null ? null : marchantAdd.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getServiceAdd() {
        return serviceAdd;
    }

    public void setServiceAdd(String serviceAdd) {
        this.serviceAdd = serviceAdd == null ? null : serviceAdd.trim();
    }

    public String getServiceLcName() {
        return serviceLcName;
    }

    public void setServiceLcName(String serviceLcName) {
        this.serviceLcName = serviceLcName == null ? null : serviceLcName.trim();
    }

    public String getServiceScName() {
        return serviceScName;
    }

    public void setServiceScName(String serviceScName) {
        this.serviceScName = serviceScName == null ? null : serviceScName.trim();
    }

    public Date getRequireTime() {
        return requireTime;
    }

    public void setRequireTime(Date requireTime) {
        this.requireTime = requireTime;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency == null ? null : urgency.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public String getOrderSourse() {
        return orderSourse;
    }

    public void setOrderSourse(String orderSourse) {
        this.orderSourse = orderSourse == null ? null : orderSourse.trim();
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode == null ? null : serviceMode.trim();
    }

    public String getServiceProName() {
        return serviceProName;
    }

    public void setServiceProName(String serviceProName) {
        this.serviceProName = serviceProName == null ? null : serviceProName.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public String getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge == null ? null : serviceCharge.trim();
    }

    public String getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(String serviceDuration) {
        this.serviceDuration = serviceDuration == null ? null : serviceDuration.trim();
    }

    public String getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(String serviceCount) {
        this.serviceCount = serviceCount == null ? null : serviceCount.trim();
    }

    public String getServicePersonname() {
        return servicePersonname;
    }

    public void setServicePersonname(String servicePersonname) {
        this.servicePersonname = servicePersonname == null ? null : servicePersonname.trim();
    }

    public String getServicePersonphone() {
        return servicePersonphone;
    }

    public void setServicePersonphone(String servicePersonphone) {
        this.servicePersonphone = servicePersonphone == null ? null : servicePersonphone.trim();
    }

    public String getServiceRequire() {
        return serviceRequire;
    }

    public void setServiceRequire(String serviceRequire) {
        this.serviceRequire = serviceRequire == null ? null : serviceRequire.trim();
    }

    public Integer getServiceTimes() {
        return serviceTimes;
    }

    public void setServiceTimes(Integer serviceTimes) {
        this.serviceTimes = serviceTimes;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AcceptedOrder other = (AcceptedOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getServicerId() == null ? other.getServicerId() == null : this.getServicerId().equals(other.getServicerId()))
            && (this.getMarchantAdd() == null ? other.getMarchantAdd() == null : this.getMarchantAdd().equals(other.getMarchantAdd()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getServiceAdd() == null ? other.getServiceAdd() == null : this.getServiceAdd().equals(other.getServiceAdd()))
            && (this.getServiceLcName() == null ? other.getServiceLcName() == null : this.getServiceLcName().equals(other.getServiceLcName()))
            && (this.getServiceScName() == null ? other.getServiceScName() == null : this.getServiceScName().equals(other.getServiceScName()))
            && (this.getRequireTime() == null ? other.getRequireTime() == null : this.getRequireTime().equals(other.getRequireTime()))
            && (this.getUrgency() == null ? other.getUrgency() == null : this.getUrgency().equals(other.getUrgency()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getOrderSourse() == null ? other.getOrderSourse() == null : this.getOrderSourse().equals(other.getOrderSourse()))
            && (this.getServiceMode() == null ? other.getServiceMode() == null : this.getServiceMode().equals(other.getServiceMode()))
            && (this.getServiceProName() == null ? other.getServiceProName() == null : this.getServiceProName().equals(other.getServiceProName()))
            && (this.getServicePhone() == null ? other.getServicePhone() == null : this.getServicePhone().equals(other.getServicePhone()))
            && (this.getServiceCharge() == null ? other.getServiceCharge() == null : this.getServiceCharge().equals(other.getServiceCharge()))
            && (this.getServiceDuration() == null ? other.getServiceDuration() == null : this.getServiceDuration().equals(other.getServiceDuration()))
            && (this.getServiceCount() == null ? other.getServiceCount() == null : this.getServiceCount().equals(other.getServiceCount()))
            && (this.getServicePersonname() == null ? other.getServicePersonname() == null : this.getServicePersonname().equals(other.getServicePersonname()))
            && (this.getServicePersonphone() == null ? other.getServicePersonphone() == null : this.getServicePersonphone().equals(other.getServicePersonphone()))
            && (this.getServiceRequire() == null ? other.getServiceRequire() == null : this.getServiceRequire().equals(other.getServiceRequire()))
            && (this.getServiceTimes() == null ? other.getServiceTimes() == null : this.getServiceTimes().equals(other.getServiceTimes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getServicerId() == null) ? 0 : getServicerId().hashCode());
        result = prime * result + ((getMarchantAdd() == null) ? 0 : getMarchantAdd().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getServiceAdd() == null) ? 0 : getServiceAdd().hashCode());
        result = prime * result + ((getServiceLcName() == null) ? 0 : getServiceLcName().hashCode());
        result = prime * result + ((getServiceScName() == null) ? 0 : getServiceScName().hashCode());
        result = prime * result + ((getRequireTime() == null) ? 0 : getRequireTime().hashCode());
        result = prime * result + ((getUrgency() == null) ? 0 : getUrgency().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getOrderSourse() == null) ? 0 : getOrderSourse().hashCode());
        result = prime * result + ((getServiceMode() == null) ? 0 : getServiceMode().hashCode());
        result = prime * result + ((getServiceProName() == null) ? 0 : getServiceProName().hashCode());
        result = prime * result + ((getServicePhone() == null) ? 0 : getServicePhone().hashCode());
        result = prime * result + ((getServiceCharge() == null) ? 0 : getServiceCharge().hashCode());
        result = prime * result + ((getServiceDuration() == null) ? 0 : getServiceDuration().hashCode());
        result = prime * result + ((getServiceCount() == null) ? 0 : getServiceCount().hashCode());
        result = prime * result + ((getServicePersonname() == null) ? 0 : getServicePersonname().hashCode());
        result = prime * result + ((getServicePersonphone() == null) ? 0 : getServicePersonphone().hashCode());
        result = prime * result + ((getServiceRequire() == null) ? 0 : getServiceRequire().hashCode());
        result = prime * result + ((getServiceTimes() == null) ? 0 : getServiceTimes().hashCode());
        return result;
    }
}