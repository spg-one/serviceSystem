package com.adufeitian.servicesystem.mybatis.domain;

import java.util.Date;

public class PendingOrder {
    private Integer orderId;

    private Integer servicerId;

    private String serviceAdd;

    private Date dispatchTime;

    private String customerName;

    private String phone;

    private String serviceName;

    private Date deadline;

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

    public String getServiceAdd() {
        return serviceAdd;
    }

    public void setServiceAdd(String serviceAdd) {
        this.serviceAdd = serviceAdd == null ? null : serviceAdd.trim();
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
        PendingOrder other = (PendingOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getServicerId() == null ? other.getServicerId() == null : this.getServicerId().equals(other.getServicerId()))
            && (this.getServiceAdd() == null ? other.getServiceAdd() == null : this.getServiceAdd().equals(other.getServiceAdd()))
            && (this.getDispatchTime() == null ? other.getDispatchTime() == null : this.getDispatchTime().equals(other.getDispatchTime()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getServiceName() == null ? other.getServiceName() == null : this.getServiceName().equals(other.getServiceName()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getServicerId() == null) ? 0 : getServicerId().hashCode());
        result = prime * result + ((getServiceAdd() == null) ? 0 : getServiceAdd().hashCode());
        result = prime * result + ((getDispatchTime() == null) ? 0 : getDispatchTime().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        return result;
    }
}