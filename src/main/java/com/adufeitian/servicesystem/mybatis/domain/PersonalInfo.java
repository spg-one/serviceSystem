package com.adufeitian.servicesystem.mybatis.domain;

public class PersonalInfo {
    private Integer personId;

    private Integer servicerId;

    private String acoount;

    private String password;

    private String character;

    private String name;

    private String tell;

    private String address;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getServicerId() {
        return servicerId;
    }

    public void setServicerId(Integer servicerId) {
        this.servicerId = servicerId;
    }

    public String getAcoount() {
        return acoount;
    }

    public void setAcoount(String acoount) {
        this.acoount = acoount == null ? null : acoount.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell == null ? null : tell.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        PersonalInfo other = (PersonalInfo) that;
        return (this.getPersonId() == null ? other.getPersonId() == null : this.getPersonId().equals(other.getPersonId()))
            && (this.getServicerId() == null ? other.getServicerId() == null : this.getServicerId().equals(other.getServicerId()))
            && (this.getAcoount() == null ? other.getAcoount() == null : this.getAcoount().equals(other.getAcoount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getCharacter() == null ? other.getCharacter() == null : this.getCharacter().equals(other.getCharacter()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTell() == null ? other.getTell() == null : this.getTell().equals(other.getTell()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonId() == null) ? 0 : getPersonId().hashCode());
        result = prime * result + ((getServicerId() == null) ? 0 : getServicerId().hashCode());
        result = prime * result + ((getAcoount() == null) ? 0 : getAcoount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getCharacter() == null) ? 0 : getCharacter().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTell() == null) ? 0 : getTell().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return result;
    }
}