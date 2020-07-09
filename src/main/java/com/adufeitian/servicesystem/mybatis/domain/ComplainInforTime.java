package com.adufeitian.servicesystem.mybatis.domain;


public class ComplainInforTime {

    private Integer complainId;

    private Integer servicerId;

    private String comPerson;

    private String personPhone;

    private String comWork;

    private String comBusiness;

    private String busiPhone;

    private String dealState;

    private String comInfo;

    private String dealPerson;

    private String dealDate;

    private String dealEnding;

    public Integer getComplainId() {
        return complainId;
    }

    public Integer getServicerId() {
        return servicerId;
    }

    public String getComPerson() {
        return comPerson;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public String getComWork() {
        return comWork;
    }

    public String getComBusiness() {
        return comBusiness;
    }

    public String getBusiPhone() {
        return busiPhone;
    }

    public String getDealState() {
        return dealState;
    }

    public String getComInfo() {
        return comInfo;
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public String getDealDate() {
        return dealDate;
    }

    public String getDealEnding() {
        return dealEnding;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public void setServicerId(Integer servicerId) {
        this.servicerId = servicerId;
    }

    public void setComPerson(String comPerson) {
        this.comPerson = comPerson;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public void setComWork(String comWork) {
        this.comWork = comWork;
    }

    public void setComBusiness(String comBusiness) {
        this.comBusiness = comBusiness;
    }

    public void setBusiPhone(String busiPhone) {
        this.busiPhone = busiPhone;
    }

    public void setDealState(String dealState) {
        this.dealState = dealState;
    }

    public void setComInfo(String comInfo) {
        this.comInfo = comInfo;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public void setDealEnding(String dealEnding) {
        this.dealEnding = dealEnding;
    }

    @Override
    public String toString() {
        return "ComplainInforTime{" +
                "complainId=" + complainId +
                ", servicerId=" + servicerId +
                ", comPerson='" + comPerson + '\'' +
                ", personPhone='" + personPhone + '\'' +
                ", comWork='" + comWork + '\'' +
                ", comBusiness='" + comBusiness + '\'' +
                ", busiPhone='" + busiPhone + '\'' +
                ", dealState='" + dealState + '\'' +
                ", comInfo='" + comInfo + '\'' +
                ", dealPerson='" + dealPerson + '\'' +
                ", dealDate='" + dealDate + '\'' +
                ", dealEnding='" + dealEnding + '\'' +
                '}';
    }
}
