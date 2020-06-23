package com.adufeitian.servicesystem.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentInforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentInforExample() {
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

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
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

        public Criteria andUrgencyIsNull() {
            addCriterion("urgency is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNotNull() {
            addCriterion("urgency is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyEqualTo(String value) {
            addCriterion("urgency =", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotEqualTo(String value) {
            addCriterion("urgency <>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThan(String value) {
            addCriterion("urgency >", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThanOrEqualTo(String value) {
            addCriterion("urgency >=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThan(String value) {
            addCriterion("urgency <", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThanOrEqualTo(String value) {
            addCriterion("urgency <=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLike(String value) {
            addCriterion("urgency like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotLike(String value) {
            addCriterion("urgency not like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIn(List<String> values) {
            addCriterion("urgency in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotIn(List<String> values) {
            addCriterion("urgency not in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyBetween(String value1, String value2) {
            addCriterion("urgency between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotBetween(String value1, String value2) {
            addCriterion("urgency not between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameIsNull() {
            addCriterion("service_LC_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameIsNotNull() {
            addCriterion("service_LC_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameEqualTo(String value) {
            addCriterion("service_LC_name =", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameNotEqualTo(String value) {
            addCriterion("service_LC_name <>", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameGreaterThan(String value) {
            addCriterion("service_LC_name >", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_LC_name >=", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameLessThan(String value) {
            addCriterion("service_LC_name <", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameLessThanOrEqualTo(String value) {
            addCriterion("service_LC_name <=", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameLike(String value) {
            addCriterion("service_LC_name like", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameNotLike(String value) {
            addCriterion("service_LC_name not like", value, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameIn(List<String> values) {
            addCriterion("service_LC_name in", values, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameNotIn(List<String> values) {
            addCriterion("service_LC_name not in", values, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameBetween(String value1, String value2) {
            addCriterion("service_LC_name between", value1, value2, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceLcNameNotBetween(String value1, String value2) {
            addCriterion("service_LC_name not between", value1, value2, "serviceLcName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameIsNull() {
            addCriterion("service_SC_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceScNameIsNotNull() {
            addCriterion("service_SC_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceScNameEqualTo(String value) {
            addCriterion("service_SC_name =", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameNotEqualTo(String value) {
            addCriterion("service_SC_name <>", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameGreaterThan(String value) {
            addCriterion("service_SC_name >", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_SC_name >=", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameLessThan(String value) {
            addCriterion("service_SC_name <", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameLessThanOrEqualTo(String value) {
            addCriterion("service_SC_name <=", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameLike(String value) {
            addCriterion("service_SC_name like", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameNotLike(String value) {
            addCriterion("service_SC_name not like", value, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameIn(List<String> values) {
            addCriterion("service_SC_name in", values, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameNotIn(List<String> values) {
            addCriterion("service_SC_name not in", values, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameBetween(String value1, String value2) {
            addCriterion("service_SC_name between", value1, value2, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceScNameNotBetween(String value1, String value2) {
            addCriterion("service_SC_name not between", value1, value2, "serviceScName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameIsNull() {
            addCriterion("service_AC_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameIsNotNull() {
            addCriterion("service_AC_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameEqualTo(String value) {
            addCriterion("service_AC_name =", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameNotEqualTo(String value) {
            addCriterion("service_AC_name <>", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameGreaterThan(String value) {
            addCriterion("service_AC_name >", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_AC_name >=", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameLessThan(String value) {
            addCriterion("service_AC_name <", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameLessThanOrEqualTo(String value) {
            addCriterion("service_AC_name <=", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameLike(String value) {
            addCriterion("service_AC_name like", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameNotLike(String value) {
            addCriterion("service_AC_name not like", value, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameIn(List<String> values) {
            addCriterion("service_AC_name in", values, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameNotIn(List<String> values) {
            addCriterion("service_AC_name not in", values, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameBetween(String value1, String value2) {
            addCriterion("service_AC_name between", value1, value2, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServiceAcNameNotBetween(String value1, String value2) {
            addCriterion("service_AC_name not between", value1, value2, "serviceAcName");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameIsNull() {
            addCriterion("service_personname is null");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameIsNotNull() {
            addCriterion("service_personname is not null");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameEqualTo(String value) {
            addCriterion("service_personname =", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameNotEqualTo(String value) {
            addCriterion("service_personname <>", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameGreaterThan(String value) {
            addCriterion("service_personname >", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("service_personname >=", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameLessThan(String value) {
            addCriterion("service_personname <", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameLessThanOrEqualTo(String value) {
            addCriterion("service_personname <=", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameLike(String value) {
            addCriterion("service_personname like", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameNotLike(String value) {
            addCriterion("service_personname not like", value, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameIn(List<String> values) {
            addCriterion("service_personname in", values, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameNotIn(List<String> values) {
            addCriterion("service_personname not in", values, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameBetween(String value1, String value2) {
            addCriterion("service_personname between", value1, value2, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonnameNotBetween(String value1, String value2) {
            addCriterion("service_personname not between", value1, value2, "servicePersonname");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneIsNull() {
            addCriterion("service_personphone is null");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneIsNotNull() {
            addCriterion("service_personphone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneEqualTo(String value) {
            addCriterion("service_personphone =", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneNotEqualTo(String value) {
            addCriterion("service_personphone <>", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneGreaterThan(String value) {
            addCriterion("service_personphone >", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_personphone >=", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneLessThan(String value) {
            addCriterion("service_personphone <", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneLessThanOrEqualTo(String value) {
            addCriterion("service_personphone <=", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneLike(String value) {
            addCriterion("service_personphone like", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneNotLike(String value) {
            addCriterion("service_personphone not like", value, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneIn(List<String> values) {
            addCriterion("service_personphone in", values, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneNotIn(List<String> values) {
            addCriterion("service_personphone not in", values, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneBetween(String value1, String value2) {
            addCriterion("service_personphone between", value1, value2, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andServicePersonphoneNotBetween(String value1, String value2) {
            addCriterion("service_personphone not between", value1, value2, "servicePersonphone");
            return (Criteria) this;
        }

        public Criteria andDealDataIsNull() {
            addCriterion("deal_data is null");
            return (Criteria) this;
        }

        public Criteria andDealDataIsNotNull() {
            addCriterion("deal_data is not null");
            return (Criteria) this;
        }

        public Criteria andDealDataEqualTo(Date value) {
            addCriterion("deal_data =", value, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataNotEqualTo(Date value) {
            addCriterion("deal_data <>", value, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataGreaterThan(Date value) {
            addCriterion("deal_data >", value, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataGreaterThanOrEqualTo(Date value) {
            addCriterion("deal_data >=", value, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataLessThan(Date value) {
            addCriterion("deal_data <", value, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataLessThanOrEqualTo(Date value) {
            addCriterion("deal_data <=", value, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataIn(List<Date> values) {
            addCriterion("deal_data in", values, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataNotIn(List<Date> values) {
            addCriterion("deal_data not in", values, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataBetween(Date value1, Date value2) {
            addCriterion("deal_data between", value1, value2, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealDataNotBetween(Date value1, Date value2) {
            addCriterion("deal_data not between", value1, value2, "dealData");
            return (Criteria) this;
        }

        public Criteria andDealStateIsNull() {
            addCriterion("deal_state is null");
            return (Criteria) this;
        }

        public Criteria andDealStateIsNotNull() {
            addCriterion("deal_state is not null");
            return (Criteria) this;
        }

        public Criteria andDealStateEqualTo(String value) {
            addCriterion("deal_state =", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateNotEqualTo(String value) {
            addCriterion("deal_state <>", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateGreaterThan(String value) {
            addCriterion("deal_state >", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateGreaterThanOrEqualTo(String value) {
            addCriterion("deal_state >=", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateLessThan(String value) {
            addCriterion("deal_state <", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateLessThanOrEqualTo(String value) {
            addCriterion("deal_state <=", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateLike(String value) {
            addCriterion("deal_state like", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateNotLike(String value) {
            addCriterion("deal_state not like", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateIn(List<String> values) {
            addCriterion("deal_state in", values, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateNotIn(List<String> values) {
            addCriterion("deal_state not in", values, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateBetween(String value1, String value2) {
            addCriterion("deal_state between", value1, value2, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateNotBetween(String value1, String value2) {
            addCriterion("deal_state not between", value1, value2, "dealState");
            return (Criteria) this;
        }

        public Criteria andServiceCommentIsNull() {
            addCriterion("service_comment is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommentIsNotNull() {
            addCriterion("service_comment is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommentEqualTo(String value) {
            addCriterion("service_comment =", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentNotEqualTo(String value) {
            addCriterion("service_comment <>", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentGreaterThan(String value) {
            addCriterion("service_comment >", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentGreaterThanOrEqualTo(String value) {
            addCriterion("service_comment >=", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentLessThan(String value) {
            addCriterion("service_comment <", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentLessThanOrEqualTo(String value) {
            addCriterion("service_comment <=", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentLike(String value) {
            addCriterion("service_comment like", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentNotLike(String value) {
            addCriterion("service_comment not like", value, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentIn(List<String> values) {
            addCriterion("service_comment in", values, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentNotIn(List<String> values) {
            addCriterion("service_comment not in", values, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentBetween(String value1, String value2) {
            addCriterion("service_comment between", value1, value2, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andServiceCommentNotBetween(String value1, String value2) {
            addCriterion("service_comment not between", value1, value2, "serviceComment");
            return (Criteria) this;
        }

        public Criteria andCommentInforIsNull() {
            addCriterion("comment_infor is null");
            return (Criteria) this;
        }

        public Criteria andCommentInforIsNotNull() {
            addCriterion("comment_infor is not null");
            return (Criteria) this;
        }

        public Criteria andCommentInforEqualTo(String value) {
            addCriterion("comment_infor =", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforNotEqualTo(String value) {
            addCriterion("comment_infor <>", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforGreaterThan(String value) {
            addCriterion("comment_infor >", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforGreaterThanOrEqualTo(String value) {
            addCriterion("comment_infor >=", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforLessThan(String value) {
            addCriterion("comment_infor <", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforLessThanOrEqualTo(String value) {
            addCriterion("comment_infor <=", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforLike(String value) {
            addCriterion("comment_infor like", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforNotLike(String value) {
            addCriterion("comment_infor not like", value, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforIn(List<String> values) {
            addCriterion("comment_infor in", values, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforNotIn(List<String> values) {
            addCriterion("comment_infor not in", values, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforBetween(String value1, String value2) {
            addCriterion("comment_infor between", value1, value2, "commentInfor");
            return (Criteria) this;
        }

        public Criteria andCommentInforNotBetween(String value1, String value2) {
            addCriterion("comment_infor not between", value1, value2, "commentInfor");
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