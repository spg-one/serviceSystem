package com.adufeitian.servicesystem.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ComplainInforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainInforExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andComplainIdIsNull() {
            addCriterion("complain_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNotNull() {
            addCriterion("complain_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainIdEqualTo(Integer value) {
            addCriterion("complain_id =", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotEqualTo(Integer value) {
            addCriterion("complain_id <>", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThan(Integer value) {
            addCriterion("complain_id >", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_id >=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThan(Integer value) {
            addCriterion("complain_id <", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThanOrEqualTo(Integer value) {
            addCriterion("complain_id <=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIn(List<Integer> values) {
            addCriterion("complain_id in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotIn(List<Integer> values) {
            addCriterion("complain_id not in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdBetween(Integer value1, Integer value2) {
            addCriterion("complain_id between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_id not between", value1, value2, "complainId");
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

        public Criteria andComPersonIsNull() {
            addCriterion("com_person is null");
            return (Criteria) this;
        }

        public Criteria andComPersonIsNotNull() {
            addCriterion("com_person is not null");
            return (Criteria) this;
        }

        public Criteria andComPersonEqualTo(String value) {
            addCriterion("com_person =", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonNotEqualTo(String value) {
            addCriterion("com_person <>", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonGreaterThan(String value) {
            addCriterion("com_person >", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonGreaterThanOrEqualTo(String value) {
            addCriterion("com_person >=", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonLessThan(String value) {
            addCriterion("com_person <", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonLessThanOrEqualTo(String value) {
            addCriterion("com_person <=", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonLike(String value) {
            addCriterion("com_person like", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonNotLike(String value) {
            addCriterion("com_person not like", value, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonIn(List<String> values) {
            addCriterion("com_person in", values, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonNotIn(List<String> values) {
            addCriterion("com_person not in", values, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonBetween(String value1, String value2) {
            addCriterion("com_person between", value1, value2, "comPerson");
            return (Criteria) this;
        }

        public Criteria andComPersonNotBetween(String value1, String value2) {
            addCriterion("com_person not between", value1, value2, "comPerson");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNull() {
            addCriterion("person_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNotNull() {
            addCriterion("person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneEqualTo(String value) {
            addCriterion("person_phone =", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotEqualTo(String value) {
            addCriterion("person_phone <>", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThan(String value) {
            addCriterion("person_phone >", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_phone >=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThan(String value) {
            addCriterion("person_phone <", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("person_phone <=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLike(String value) {
            addCriterion("person_phone like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotLike(String value) {
            addCriterion("person_phone not like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIn(List<String> values) {
            addCriterion("person_phone in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotIn(List<String> values) {
            addCriterion("person_phone not in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneBetween(String value1, String value2) {
            addCriterion("person_phone between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("person_phone not between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andComWorkIsNull() {
            addCriterion("com_work is null");
            return (Criteria) this;
        }

        public Criteria andComWorkIsNotNull() {
            addCriterion("com_work is not null");
            return (Criteria) this;
        }

        public Criteria andComWorkEqualTo(String value) {
            addCriterion("com_work =", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkNotEqualTo(String value) {
            addCriterion("com_work <>", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkGreaterThan(String value) {
            addCriterion("com_work >", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkGreaterThanOrEqualTo(String value) {
            addCriterion("com_work >=", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkLessThan(String value) {
            addCriterion("com_work <", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkLessThanOrEqualTo(String value) {
            addCriterion("com_work <=", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkLike(String value) {
            addCriterion("com_work like", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkNotLike(String value) {
            addCriterion("com_work not like", value, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkIn(List<String> values) {
            addCriterion("com_work in", values, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkNotIn(List<String> values) {
            addCriterion("com_work not in", values, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkBetween(String value1, String value2) {
            addCriterion("com_work between", value1, value2, "comWork");
            return (Criteria) this;
        }

        public Criteria andComWorkNotBetween(String value1, String value2) {
            addCriterion("com_work not between", value1, value2, "comWork");
            return (Criteria) this;
        }

        public Criteria andComBusinessIsNull() {
            addCriterion("com_business is null");
            return (Criteria) this;
        }

        public Criteria andComBusinessIsNotNull() {
            addCriterion("com_business is not null");
            return (Criteria) this;
        }

        public Criteria andComBusinessEqualTo(String value) {
            addCriterion("com_business =", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessNotEqualTo(String value) {
            addCriterion("com_business <>", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessGreaterThan(String value) {
            addCriterion("com_business >", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("com_business >=", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessLessThan(String value) {
            addCriterion("com_business <", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessLessThanOrEqualTo(String value) {
            addCriterion("com_business <=", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessLike(String value) {
            addCriterion("com_business like", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessNotLike(String value) {
            addCriterion("com_business not like", value, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessIn(List<String> values) {
            addCriterion("com_business in", values, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessNotIn(List<String> values) {
            addCriterion("com_business not in", values, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessBetween(String value1, String value2) {
            addCriterion("com_business between", value1, value2, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andComBusinessNotBetween(String value1, String value2) {
            addCriterion("com_business not between", value1, value2, "comBusiness");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneIsNull() {
            addCriterion("busi_phone is null");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneIsNotNull() {
            addCriterion("busi_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneEqualTo(String value) {
            addCriterion("busi_phone =", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneNotEqualTo(String value) {
            addCriterion("busi_phone <>", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneGreaterThan(String value) {
            addCriterion("busi_phone >", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("busi_phone >=", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneLessThan(String value) {
            addCriterion("busi_phone <", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneLessThanOrEqualTo(String value) {
            addCriterion("busi_phone <=", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneLike(String value) {
            addCriterion("busi_phone like", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneNotLike(String value) {
            addCriterion("busi_phone not like", value, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneIn(List<String> values) {
            addCriterion("busi_phone in", values, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneNotIn(List<String> values) {
            addCriterion("busi_phone not in", values, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneBetween(String value1, String value2) {
            addCriterion("busi_phone between", value1, value2, "busiPhone");
            return (Criteria) this;
        }

        public Criteria andBusiPhoneNotBetween(String value1, String value2) {
            addCriterion("busi_phone not between", value1, value2, "busiPhone");
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

        public Criteria andComInfoIsNull() {
            addCriterion("com_info is null");
            return (Criteria) this;
        }

        public Criteria andComInfoIsNotNull() {
            addCriterion("com_info is not null");
            return (Criteria) this;
        }

        public Criteria andComInfoEqualTo(String value) {
            addCriterion("com_info =", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoNotEqualTo(String value) {
            addCriterion("com_info <>", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoGreaterThan(String value) {
            addCriterion("com_info >", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoGreaterThanOrEqualTo(String value) {
            addCriterion("com_info >=", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoLessThan(String value) {
            addCriterion("com_info <", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoLessThanOrEqualTo(String value) {
            addCriterion("com_info <=", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoLike(String value) {
            addCriterion("com_info like", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoNotLike(String value) {
            addCriterion("com_info not like", value, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoIn(List<String> values) {
            addCriterion("com_info in", values, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoNotIn(List<String> values) {
            addCriterion("com_info not in", values, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoBetween(String value1, String value2) {
            addCriterion("com_info between", value1, value2, "comInfo");
            return (Criteria) this;
        }

        public Criteria andComInfoNotBetween(String value1, String value2) {
            addCriterion("com_info not between", value1, value2, "comInfo");
            return (Criteria) this;
        }

        public Criteria andDealPersonIsNull() {
            addCriterion("deal_person is null");
            return (Criteria) this;
        }

        public Criteria andDealPersonIsNotNull() {
            addCriterion("deal_person is not null");
            return (Criteria) this;
        }

        public Criteria andDealPersonEqualTo(String value) {
            addCriterion("deal_person =", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotEqualTo(String value) {
            addCriterion("deal_person <>", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonGreaterThan(String value) {
            addCriterion("deal_person >", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonGreaterThanOrEqualTo(String value) {
            addCriterion("deal_person >=", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLessThan(String value) {
            addCriterion("deal_person <", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLessThanOrEqualTo(String value) {
            addCriterion("deal_person <=", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLike(String value) {
            addCriterion("deal_person like", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotLike(String value) {
            addCriterion("deal_person not like", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonIn(List<String> values) {
            addCriterion("deal_person in", values, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotIn(List<String> values) {
            addCriterion("deal_person not in", values, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonBetween(String value1, String value2) {
            addCriterion("deal_person between", value1, value2, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotBetween(String value1, String value2) {
            addCriterion("deal_person not between", value1, value2, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNull() {
            addCriterion("deal_date is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("deal_date is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(Date value) {
            addCriterionForJDBCDate("deal_date =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("deal_date <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(Date value) {
            addCriterionForJDBCDate("deal_date >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deal_date >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(Date value) {
            addCriterionForJDBCDate("deal_date <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deal_date <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<Date> values) {
            addCriterionForJDBCDate("deal_date in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("deal_date not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deal_date between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deal_date not between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealEndingIsNull() {
            addCriterion("deal_ending is null");
            return (Criteria) this;
        }

        public Criteria andDealEndingIsNotNull() {
            addCriterion("deal_ending is not null");
            return (Criteria) this;
        }

        public Criteria andDealEndingEqualTo(String value) {
            addCriterion("deal_ending =", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingNotEqualTo(String value) {
            addCriterion("deal_ending <>", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingGreaterThan(String value) {
            addCriterion("deal_ending >", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingGreaterThanOrEqualTo(String value) {
            addCriterion("deal_ending >=", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingLessThan(String value) {
            addCriterion("deal_ending <", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingLessThanOrEqualTo(String value) {
            addCriterion("deal_ending <=", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingLike(String value) {
            addCriterion("deal_ending like", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingNotLike(String value) {
            addCriterion("deal_ending not like", value, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingIn(List<String> values) {
            addCriterion("deal_ending in", values, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingNotIn(List<String> values) {
            addCriterion("deal_ending not in", values, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingBetween(String value1, String value2) {
            addCriterion("deal_ending between", value1, value2, "dealEnding");
            return (Criteria) this;
        }

        public Criteria andDealEndingNotBetween(String value1, String value2) {
            addCriterion("deal_ending not between", value1, value2, "dealEnding");
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