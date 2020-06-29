package com.adufeitian.servicesystem.mybatis.domain;

import java.util.ArrayList;
import java.util.List;

public class ServicerInforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicerInforExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andServicerIdIsNull() {
            addCriterion("servicer_id is null");
            return (Criteria) this;
        }

        public Criteria andServicerIdIsNotNull() {
            addCriterion("servicer_id is not null");
            return (Criteria) this;
        }

        public Criteria andServicerIdEqualTo(Integer value) {
            addCriterion("servicer_id =", value, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdNotEqualTo(Integer value) {
            addCriterion("servicer_id <>", value, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdGreaterThan(Integer value) {
            addCriterion("servicer_id >", value, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicer_id >=", value, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdLessThan(Integer value) {
            addCriterion("servicer_id <", value, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdLessThanOrEqualTo(Integer value) {
            addCriterion("servicer_id <=", value, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdIn(List<Integer> values) {
            addCriterion("servicer_id in", values, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdNotIn(List<Integer> values) {
            addCriterion("servicer_id not in", values, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdBetween(Integer value1, Integer value2) {
            addCriterion("servicer_id between", value1, value2, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("servicer_id not between", value1, value2, "servicerId");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneIsNull() {
            addCriterion("servicer_phone is null");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneIsNotNull() {
            addCriterion("servicer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneEqualTo(String value) {
            addCriterion("servicer_phone =", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneNotEqualTo(String value) {
            addCriterion("servicer_phone <>", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneGreaterThan(String value) {
            addCriterion("servicer_phone >", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("servicer_phone >=", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneLessThan(String value) {
            addCriterion("servicer_phone <", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneLessThanOrEqualTo(String value) {
            addCriterion("servicer_phone <=", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneLike(String value) {
            addCriterion("servicer_phone like", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneNotLike(String value) {
            addCriterion("servicer_phone not like", value, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneIn(List<String> values) {
            addCriterion("servicer_phone in", values, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneNotIn(List<String> values) {
            addCriterion("servicer_phone not in", values, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneBetween(String value1, String value2) {
            addCriterion("servicer_phone between", value1, value2, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerPhoneNotBetween(String value1, String value2) {
            addCriterion("servicer_phone not between", value1, value2, "servicerPhone");
            return (Criteria) this;
        }

        public Criteria andServicerNameIsNull() {
            addCriterion("servicer_name is null");
            return (Criteria) this;
        }

        public Criteria andServicerNameIsNotNull() {
            addCriterion("servicer_name is not null");
            return (Criteria) this;
        }

        public Criteria andServicerNameEqualTo(String value) {
            addCriterion("servicer_name =", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameNotEqualTo(String value) {
            addCriterion("servicer_name <>", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameGreaterThan(String value) {
            addCriterion("servicer_name >", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameGreaterThanOrEqualTo(String value) {
            addCriterion("servicer_name >=", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameLessThan(String value) {
            addCriterion("servicer_name <", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameLessThanOrEqualTo(String value) {
            addCriterion("servicer_name <=", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameLike(String value) {
            addCriterion("servicer_name like", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameNotLike(String value) {
            addCriterion("servicer_name not like", value, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameIn(List<String> values) {
            addCriterion("servicer_name in", values, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameNotIn(List<String> values) {
            addCriterion("servicer_name not in", values, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameBetween(String value1, String value2) {
            addCriterion("servicer_name between", value1, value2, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerNameNotBetween(String value1, String value2) {
            addCriterion("servicer_name not between", value1, value2, "servicerName");
            return (Criteria) this;
        }

        public Criteria andServicerTypeIsNull() {
            addCriterion("servicer_type is null");
            return (Criteria) this;
        }

        public Criteria andServicerTypeIsNotNull() {
            addCriterion("servicer_type is not null");
            return (Criteria) this;
        }

        public Criteria andServicerTypeEqualTo(String value) {
            addCriterion("servicer_type =", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeNotEqualTo(String value) {
            addCriterion("servicer_type <>", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeGreaterThan(String value) {
            addCriterion("servicer_type >", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("servicer_type >=", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeLessThan(String value) {
            addCriterion("servicer_type <", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeLessThanOrEqualTo(String value) {
            addCriterion("servicer_type <=", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeLike(String value) {
            addCriterion("servicer_type like", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeNotLike(String value) {
            addCriterion("servicer_type not like", value, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeIn(List<String> values) {
            addCriterion("servicer_type in", values, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeNotIn(List<String> values) {
            addCriterion("servicer_type not in", values, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeBetween(String value1, String value2) {
            addCriterion("servicer_type between", value1, value2, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServicerTypeNotBetween(String value1, String value2) {
            addCriterion("servicer_type not between", value1, value2, "servicerType");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIsNull() {
            addCriterion("service_status is null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIsNotNull() {
            addCriterion("service_status is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStatusEqualTo(String value) {
            addCriterion("service_status =", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotEqualTo(String value) {
            addCriterion("service_status <>", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThan(String value) {
            addCriterion("service_status >", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("service_status >=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThan(String value) {
            addCriterion("service_status <", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLessThanOrEqualTo(String value) {
            addCriterion("service_status <=", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusLike(String value) {
            addCriterion("service_status like", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotLike(String value) {
            addCriterion("service_status not like", value, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusIn(List<String> values) {
            addCriterion("service_status in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotIn(List<String> values) {
            addCriterion("service_status not in", values, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusBetween(String value1, String value2) {
            addCriterion("service_status between", value1, value2, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andServiceStatusNotBetween(String value1, String value2) {
            addCriterion("service_status not between", value1, value2, "serviceStatus");
            return (Criteria) this;
        }

        public Criteria andManagePersonIsNull() {
            addCriterion("manage_person is null");
            return (Criteria) this;
        }

        public Criteria andManagePersonIsNotNull() {
            addCriterion("manage_person is not null");
            return (Criteria) this;
        }

        public Criteria andManagePersonEqualTo(String value) {
            addCriterion("manage_person =", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonNotEqualTo(String value) {
            addCriterion("manage_person <>", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonGreaterThan(String value) {
            addCriterion("manage_person >", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonGreaterThanOrEqualTo(String value) {
            addCriterion("manage_person >=", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonLessThan(String value) {
            addCriterion("manage_person <", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonLessThanOrEqualTo(String value) {
            addCriterion("manage_person <=", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonLike(String value) {
            addCriterion("manage_person like", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonNotLike(String value) {
            addCriterion("manage_person not like", value, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonIn(List<String> values) {
            addCriterion("manage_person in", values, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonNotIn(List<String> values) {
            addCriterion("manage_person not in", values, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonBetween(String value1, String value2) {
            addCriterion("manage_person between", value1, value2, "managePerson");
            return (Criteria) this;
        }

        public Criteria andManagePersonNotBetween(String value1, String value2) {
            addCriterion("manage_person not between", value1, value2, "managePerson");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceIsNull() {
            addCriterion("weekend_service is null");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceIsNotNull() {
            addCriterion("weekend_service is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceEqualTo(String value) {
            addCriterion("weekend_service =", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceNotEqualTo(String value) {
            addCriterion("weekend_service <>", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceGreaterThan(String value) {
            addCriterion("weekend_service >", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceGreaterThanOrEqualTo(String value) {
            addCriterion("weekend_service >=", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceLessThan(String value) {
            addCriterion("weekend_service <", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceLessThanOrEqualTo(String value) {
            addCriterion("weekend_service <=", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceLike(String value) {
            addCriterion("weekend_service like", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceNotLike(String value) {
            addCriterion("weekend_service not like", value, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceIn(List<String> values) {
            addCriterion("weekend_service in", values, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceNotIn(List<String> values) {
            addCriterion("weekend_service not in", values, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceBetween(String value1, String value2) {
            addCriterion("weekend_service between", value1, value2, "weekendService");
            return (Criteria) this;
        }

        public Criteria andWeekendServiceNotBetween(String value1, String value2) {
            addCriterion("weekend_service not between", value1, value2, "weekendService");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceIsNull() {
            addCriterion("holiday_service is null");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceIsNotNull() {
            addCriterion("holiday_service is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceEqualTo(String value) {
            addCriterion("holiday_service =", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceNotEqualTo(String value) {
            addCriterion("holiday_service <>", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceGreaterThan(String value) {
            addCriterion("holiday_service >", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceGreaterThanOrEqualTo(String value) {
            addCriterion("holiday_service >=", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceLessThan(String value) {
            addCriterion("holiday_service <", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceLessThanOrEqualTo(String value) {
            addCriterion("holiday_service <=", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceLike(String value) {
            addCriterion("holiday_service like", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceNotLike(String value) {
            addCriterion("holiday_service not like", value, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceIn(List<String> values) {
            addCriterion("holiday_service in", values, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceNotIn(List<String> values) {
            addCriterion("holiday_service not in", values, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceBetween(String value1, String value2) {
            addCriterion("holiday_service between", value1, value2, "holidayService");
            return (Criteria) this;
        }

        public Criteria andHolidayServiceNotBetween(String value1, String value2) {
            addCriterion("holiday_service not between", value1, value2, "holidayService");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andServicerAddressIsNull() {
            addCriterion("servicer_address is null");
            return (Criteria) this;
        }

        public Criteria andServicerAddressIsNotNull() {
            addCriterion("servicer_address is not null");
            return (Criteria) this;
        }

        public Criteria andServicerAddressEqualTo(String value) {
            addCriterion("servicer_address =", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressNotEqualTo(String value) {
            addCriterion("servicer_address <>", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressGreaterThan(String value) {
            addCriterion("servicer_address >", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("servicer_address >=", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressLessThan(String value) {
            addCriterion("servicer_address <", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressLessThanOrEqualTo(String value) {
            addCriterion("servicer_address <=", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressLike(String value) {
            addCriterion("servicer_address like", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressNotLike(String value) {
            addCriterion("servicer_address not like", value, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressIn(List<String> values) {
            addCriterion("servicer_address in", values, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressNotIn(List<String> values) {
            addCriterion("servicer_address not in", values, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressBetween(String value1, String value2) {
            addCriterion("servicer_address between", value1, value2, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andServicerAddressNotBetween(String value1, String value2) {
            addCriterion("servicer_address not between", value1, value2, "servicerAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNull() {
            addCriterion("business_hours is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNotNull() {
            addCriterion("business_hours is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEqualTo(String value) {
            addCriterion("business_hours =", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotEqualTo(String value) {
            addCriterion("business_hours <>", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThan(String value) {
            addCriterion("business_hours >", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThanOrEqualTo(String value) {
            addCriterion("business_hours >=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThan(String value) {
            addCriterion("business_hours <", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThanOrEqualTo(String value) {
            addCriterion("business_hours <=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLike(String value) {
            addCriterion("business_hours like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotLike(String value) {
            addCriterion("business_hours not like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIn(List<String> values) {
            addCriterion("business_hours in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotIn(List<String> values) {
            addCriterion("business_hours not in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursBetween(String value1, String value2) {
            addCriterion("business_hours between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotBetween(String value1, String value2) {
            addCriterion("business_hours not between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andServicerInfoIsNull() {
            addCriterion("servicer_info is null");
            return (Criteria) this;
        }

        public Criteria andServicerInfoIsNotNull() {
            addCriterion("servicer_info is not null");
            return (Criteria) this;
        }

        public Criteria andServicerInfoEqualTo(String value) {
            addCriterion("servicer_info =", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoNotEqualTo(String value) {
            addCriterion("servicer_info <>", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoGreaterThan(String value) {
            addCriterion("servicer_info >", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("servicer_info >=", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoLessThan(String value) {
            addCriterion("servicer_info <", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoLessThanOrEqualTo(String value) {
            addCriterion("servicer_info <=", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoLike(String value) {
            addCriterion("servicer_info like", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoNotLike(String value) {
            addCriterion("servicer_info not like", value, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoIn(List<String> values) {
            addCriterion("servicer_info in", values, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoNotIn(List<String> values) {
            addCriterion("servicer_info not in", values, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoBetween(String value1, String value2) {
            addCriterion("servicer_info between", value1, value2, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andServicerInfoNotBetween(String value1, String value2) {
            addCriterion("servicer_info not between", value1, value2, "servicerInfo");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}