package com.adufeitian.servicesystem.mybatis.domain;

public class ServiceInfor {
    private Integer serviceId;

    private String systemLcName;

    private String systemScName;

    private String simpleInfo;

    private String charge;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getSystemLcName() {
        return systemLcName;
    }

    public void setSystemLcName(String systemLcName) {
        this.systemLcName = systemLcName == null ? null : systemLcName.trim();
    }

    public String getSystemScName() {
        return systemScName;
    }

    public void setSystemScName(String systemScName) {
        this.systemScName = systemScName == null ? null : systemScName.trim();
    }

    public String getSimpleInfo() {
        return simpleInfo;
    }

    public void setSimpleInfo(String simpleInfo) {
        this.simpleInfo = simpleInfo == null ? null : simpleInfo.trim();
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge == null ? null : charge.trim();
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
        ServiceInfor other = (ServiceInfor) that;
        return (this.getServiceId() == null ? other.getServiceId() == null : this.getServiceId().equals(other.getServiceId()))
            && (this.getSystemLcName() == null ? other.getSystemLcName() == null : this.getSystemLcName().equals(other.getSystemLcName()))
            && (this.getSystemScName() == null ? other.getSystemScName() == null : this.getSystemScName().equals(other.getSystemScName()))
            && (this.getSimpleInfo() == null ? other.getSimpleInfo() == null : this.getSimpleInfo().equals(other.getSimpleInfo()))
            && (this.getCharge() == null ? other.getCharge() == null : this.getCharge().equals(other.getCharge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        result = prime * result + ((getSystemLcName() == null) ? 0 : getSystemLcName().hashCode());
        result = prime * result + ((getSystemScName() == null) ? 0 : getSystemScName().hashCode());
        result = prime * result + ((getSimpleInfo() == null) ? 0 : getSimpleInfo().hashCode());
        result = prime * result + ((getCharge() == null) ? 0 : getCharge().hashCode());
        return result;
    }
}