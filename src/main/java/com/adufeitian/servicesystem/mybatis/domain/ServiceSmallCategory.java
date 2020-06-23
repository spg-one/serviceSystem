package com.adufeitian.servicesystem.mybatis.domain;

public class ServiceSmallCategory {
    private Integer scId;

    private String systemId;

    private String systemLcName;

    private String systemScName;

    private String description;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        ServiceSmallCategory other = (ServiceSmallCategory) that;
        return (this.getScId() == null ? other.getScId() == null : this.getScId().equals(other.getScId()))
            && (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getSystemLcName() == null ? other.getSystemLcName() == null : this.getSystemLcName().equals(other.getSystemLcName()))
            && (this.getSystemScName() == null ? other.getSystemScName() == null : this.getSystemScName().equals(other.getSystemScName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScId() == null) ? 0 : getScId().hashCode());
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getSystemLcName() == null) ? 0 : getSystemLcName().hashCode());
        result = prime * result + ((getSystemScName() == null) ? 0 : getSystemScName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}