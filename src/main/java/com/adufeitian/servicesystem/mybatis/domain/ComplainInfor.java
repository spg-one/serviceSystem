package com.adufeitian.servicesystem.mybatis.domain;

import java.util.Date;

public class ComplainInfor {
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

    private Date dealDate;

    private String dealEnding;

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public Integer getServicerId() {
        return servicerId;
    }

    public void setServicerId(Integer servicerId) {
        this.servicerId = servicerId;
    }

    public String getComPerson() {
        return comPerson;
    }

    public void setComPerson(String comPerson) {
        this.comPerson = comPerson == null ? null : comPerson.trim();
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    public String getComWork() {
        return comWork;
    }

    public void setComWork(String comWork) {
        this.comWork = comWork == null ? null : comWork.trim();
    }

    public String getComBusiness() {
        return comBusiness;
    }

    public void setComBusiness(String comBusiness) {
        this.comBusiness = comBusiness == null ? null : comBusiness.trim();
    }

    public String getBusiPhone() {
        return busiPhone;
    }

    public void setBusiPhone(String busiPhone) {
        this.busiPhone = busiPhone == null ? null : busiPhone.trim();
    }

    public String getDealState() {
        return dealState;
    }

    public void setDealState(String dealState) {
        this.dealState = dealState == null ? null : dealState.trim();
    }

    public String getComInfo() {
        return comInfo;
    }

    public void setComInfo(String comInfo) {
        this.comInfo = comInfo == null ? null : comInfo.trim();
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson == null ? null : dealPerson.trim();
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealEnding() {
        return dealEnding;
    }

    public void setDealEnding(String dealEnding) {
        this.dealEnding = dealEnding == null ? null : dealEnding.trim();
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
        ComplainInfor other = (ComplainInfor) that;
        return (this.getComplainId() == null ? other.getComplainId() == null : this.getComplainId().equals(other.getComplainId()))
            && (this.getServicerId() == null ? other.getServicerId() == null : this.getServicerId().equals(other.getServicerId()))
            && (this.getComPerson() == null ? other.getComPerson() == null : this.getComPerson().equals(other.getComPerson()))
            && (this.getPersonPhone() == null ? other.getPersonPhone() == null : this.getPersonPhone().equals(other.getPersonPhone()))
            && (this.getComWork() == null ? other.getComWork() == null : this.getComWork().equals(other.getComWork()))
            && (this.getComBusiness() == null ? other.getComBusiness() == null : this.getComBusiness().equals(other.getComBusiness()))
            && (this.getBusiPhone() == null ? other.getBusiPhone() == null : this.getBusiPhone().equals(other.getBusiPhone()))
            && (this.getDealState() == null ? other.getDealState() == null : this.getDealState().equals(other.getDealState()))
            && (this.getComInfo() == null ? other.getComInfo() == null : this.getComInfo().equals(other.getComInfo()))
            && (this.getDealPerson() == null ? other.getDealPerson() == null : this.getDealPerson().equals(other.getDealPerson()))
            && (this.getDealDate() == null ? other.getDealDate() == null : this.getDealDate().equals(other.getDealDate()))
            && (this.getDealEnding() == null ? other.getDealEnding() == null : this.getDealEnding().equals(other.getDealEnding()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComplainId() == null) ? 0 : getComplainId().hashCode());
        result = prime * result + ((getServicerId() == null) ? 0 : getServicerId().hashCode());
        result = prime * result + ((getComPerson() == null) ? 0 : getComPerson().hashCode());
        result = prime * result + ((getPersonPhone() == null) ? 0 : getPersonPhone().hashCode());
        result = prime * result + ((getComWork() == null) ? 0 : getComWork().hashCode());
        result = prime * result + ((getComBusiness() == null) ? 0 : getComBusiness().hashCode());
        result = prime * result + ((getBusiPhone() == null) ? 0 : getBusiPhone().hashCode());
        result = prime * result + ((getDealState() == null) ? 0 : getDealState().hashCode());
        result = prime * result + ((getComInfo() == null) ? 0 : getComInfo().hashCode());
        result = prime * result + ((getDealPerson() == null) ? 0 : getDealPerson().hashCode());
        result = prime * result + ((getDealDate() == null) ? 0 : getDealDate().hashCode());
        result = prime * result + ((getDealEnding() == null) ? 0 : getDealEnding().hashCode());
        return result;
    }
}