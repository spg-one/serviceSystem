package com.adufeitian.servicesystem.mybatis.domain;

public class ServicerInfor {
    private Integer servicerId;

    private String servicerPhone;

    private String servicerName;

    private String servicerType;

    private String serviceStatus;

    private String managePerson;

    private String weekendService;

    private String licenseNumber;

    private String holidayService;

    private String province;

    private String city;

    private String county;

    private String servicerAddress;

    private String businessHours;

    private String servicerInfo;

    public Integer getServicerId() {
        return servicerId;
    }

    public void setServicerId(Integer servicerId) {
        this.servicerId = servicerId;
    }

    public String getServicerPhone() {
        return servicerPhone;
    }

    public void setServicerPhone(String servicerPhone) {
        this.servicerPhone = servicerPhone == null ? null : servicerPhone.trim();
    }

    public String getServicerName() {
        return servicerName;
    }

    public void setServicerName(String servicerName) {
        this.servicerName = servicerName == null ? null : servicerName.trim();
    }

    public String getServicerType() {
        return servicerType;
    }

    public void setServicerType(String servicerType) {
        this.servicerType = servicerType == null ? null : servicerType.trim();
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus == null ? null : serviceStatus.trim();
    }

    public String getManagePerson() {
        return managePerson;
    }

    public void setManagePerson(String managePerson) {
        this.managePerson = managePerson == null ? null : managePerson.trim();
    }

    public String getWeekendService() {
        return weekendService;
    }

    public void setWeekendService(String weekendService) {
        this.weekendService = weekendService == null ? null : weekendService.trim();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    public String getHolidayService() {
        return holidayService;
    }

    public void setHolidayService(String holidayService) {
        this.holidayService = holidayService == null ? null : holidayService.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getServicerAddress() {
        return servicerAddress;
    }

    public void setServicerAddress(String servicerAddress) {
        this.servicerAddress = servicerAddress == null ? null : servicerAddress.trim();
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours == null ? null : businessHours.trim();
    }

    public String getServicerInfo() {
        return servicerInfo;
    }

    public void setServicerInfo(String servicerInfo) {
        this.servicerInfo = servicerInfo == null ? null : servicerInfo.trim();
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
        ServicerInfor other = (ServicerInfor) that;
        return (this.getServicerId() == null ? other.getServicerId() == null : this.getServicerId().equals(other.getServicerId()))
            && (this.getServicerPhone() == null ? other.getServicerPhone() == null : this.getServicerPhone().equals(other.getServicerPhone()))
            && (this.getServicerName() == null ? other.getServicerName() == null : this.getServicerName().equals(other.getServicerName()))
            && (this.getServicerType() == null ? other.getServicerType() == null : this.getServicerType().equals(other.getServicerType()))
            && (this.getServiceStatus() == null ? other.getServiceStatus() == null : this.getServiceStatus().equals(other.getServiceStatus()))
            && (this.getManagePerson() == null ? other.getManagePerson() == null : this.getManagePerson().equals(other.getManagePerson()))
            && (this.getWeekendService() == null ? other.getWeekendService() == null : this.getWeekendService().equals(other.getWeekendService()))
            && (this.getLicenseNumber() == null ? other.getLicenseNumber() == null : this.getLicenseNumber().equals(other.getLicenseNumber()))
            && (this.getHolidayService() == null ? other.getHolidayService() == null : this.getHolidayService().equals(other.getHolidayService()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCounty() == null ? other.getCounty() == null : this.getCounty().equals(other.getCounty()))
            && (this.getServicerAddress() == null ? other.getServicerAddress() == null : this.getServicerAddress().equals(other.getServicerAddress()))
            && (this.getBusinessHours() == null ? other.getBusinessHours() == null : this.getBusinessHours().equals(other.getBusinessHours()))
            && (this.getServicerInfo() == null ? other.getServicerInfo() == null : this.getServicerInfo().equals(other.getServicerInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServicerId() == null) ? 0 : getServicerId().hashCode());
        result = prime * result + ((getServicerPhone() == null) ? 0 : getServicerPhone().hashCode());
        result = prime * result + ((getServicerName() == null) ? 0 : getServicerName().hashCode());
        result = prime * result + ((getServicerType() == null) ? 0 : getServicerType().hashCode());
        result = prime * result + ((getServiceStatus() == null) ? 0 : getServiceStatus().hashCode());
        result = prime * result + ((getManagePerson() == null) ? 0 : getManagePerson().hashCode());
        result = prime * result + ((getWeekendService() == null) ? 0 : getWeekendService().hashCode());
        result = prime * result + ((getLicenseNumber() == null) ? 0 : getLicenseNumber().hashCode());
        result = prime * result + ((getHolidayService() == null) ? 0 : getHolidayService().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCounty() == null) ? 0 : getCounty().hashCode());
        result = prime * result + ((getServicerAddress() == null) ? 0 : getServicerAddress().hashCode());
        result = prime * result + ((getBusinessHours() == null) ? 0 : getBusinessHours().hashCode());
        result = prime * result + ((getServicerInfo() == null) ? 0 : getServicerInfo().hashCode());
        return result;
    }
}