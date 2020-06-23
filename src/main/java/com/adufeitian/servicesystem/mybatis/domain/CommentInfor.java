package com.adufeitian.servicesystem.mybatis.domain;

import java.util.Date;

public class CommentInfor {
    private String orderNumber;

    private Integer servicerId;

    private String urgency;

    private String customerName;

    private String phone;

    private String serviceLcName;

    private String serviceScName;

    private String serviceAcName;

    private String servicePersonname;

    private String servicePersonphone;

    private Date dealData;

    private String dealState;

    private String serviceComment;

    private String commentInfor;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Integer getServicerId() {
        return servicerId;
    }

    public void setServicerId(Integer servicerId) {
        this.servicerId = servicerId;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency == null ? null : urgency.trim();
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

    public String getServiceAcName() {
        return serviceAcName;
    }

    public void setServiceAcName(String serviceAcName) {
        this.serviceAcName = serviceAcName == null ? null : serviceAcName.trim();
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

    public Date getDealData() {
        return dealData;
    }

    public void setDealData(Date dealData) {
        this.dealData = dealData;
    }

    public String getDealState() {
        return dealState;
    }

    public void setDealState(String dealState) {
        this.dealState = dealState == null ? null : dealState.trim();
    }

    public String getServiceComment() {
        return serviceComment;
    }

    public void setServiceComment(String serviceComment) {
        this.serviceComment = serviceComment == null ? null : serviceComment.trim();
    }

    public String getCommentInfor() {
        return commentInfor;
    }

    public void setCommentInfor(String commentInfor) {
        this.commentInfor = commentInfor == null ? null : commentInfor.trim();
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
        CommentInfor other = (CommentInfor) that;
        return (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()))
            && (this.getServicerId() == null ? other.getServicerId() == null : this.getServicerId().equals(other.getServicerId()))
            && (this.getUrgency() == null ? other.getUrgency() == null : this.getUrgency().equals(other.getUrgency()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getServiceLcName() == null ? other.getServiceLcName() == null : this.getServiceLcName().equals(other.getServiceLcName()))
            && (this.getServiceScName() == null ? other.getServiceScName() == null : this.getServiceScName().equals(other.getServiceScName()))
            && (this.getServiceAcName() == null ? other.getServiceAcName() == null : this.getServiceAcName().equals(other.getServiceAcName()))
            && (this.getServicePersonname() == null ? other.getServicePersonname() == null : this.getServicePersonname().equals(other.getServicePersonname()))
            && (this.getServicePersonphone() == null ? other.getServicePersonphone() == null : this.getServicePersonphone().equals(other.getServicePersonphone()))
            && (this.getDealData() == null ? other.getDealData() == null : this.getDealData().equals(other.getDealData()))
            && (this.getDealState() == null ? other.getDealState() == null : this.getDealState().equals(other.getDealState()))
            && (this.getServiceComment() == null ? other.getServiceComment() == null : this.getServiceComment().equals(other.getServiceComment()))
            && (this.getCommentInfor() == null ? other.getCommentInfor() == null : this.getCommentInfor().equals(other.getCommentInfor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        result = prime * result + ((getServicerId() == null) ? 0 : getServicerId().hashCode());
        result = prime * result + ((getUrgency() == null) ? 0 : getUrgency().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getServiceLcName() == null) ? 0 : getServiceLcName().hashCode());
        result = prime * result + ((getServiceScName() == null) ? 0 : getServiceScName().hashCode());
        result = prime * result + ((getServiceAcName() == null) ? 0 : getServiceAcName().hashCode());
        result = prime * result + ((getServicePersonname() == null) ? 0 : getServicePersonname().hashCode());
        result = prime * result + ((getServicePersonphone() == null) ? 0 : getServicePersonphone().hashCode());
        result = prime * result + ((getDealData() == null) ? 0 : getDealData().hashCode());
        result = prime * result + ((getDealState() == null) ? 0 : getDealState().hashCode());
        result = prime * result + ((getServiceComment() == null) ? 0 : getServiceComment().hashCode());
        result = prime * result + ((getCommentInfor() == null) ? 0 : getCommentInfor().hashCode());
        return result;
    }
}