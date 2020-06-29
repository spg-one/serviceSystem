package com.adufeitian.servicesystem.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcceptedOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcceptedOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andMarchantAddIsNull() {
            addCriterion("marchant_add is null");
            return (Criteria) this;
        }

        public Criteria andMarchantAddIsNotNull() {
            addCriterion("marchant_add is not null");
            return (Criteria) this;
        }

        public Criteria andMarchantAddEqualTo(String value) {
            addCriterion("marchant_add =", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddNotEqualTo(String value) {
            addCriterion("marchant_add <>", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddGreaterThan(String value) {
            addCriterion("marchant_add >", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddGreaterThanOrEqualTo(String value) {
            addCriterion("marchant_add >=", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddLessThan(String value) {
            addCriterion("marchant_add <", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddLessThanOrEqualTo(String value) {
            addCriterion("marchant_add <=", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddLike(String value) {
            addCriterion("marchant_add like", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddNotLike(String value) {
            addCriterion("marchant_add not like", value, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddIn(List<String> values) {
            addCriterion("marchant_add in", values, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddNotIn(List<String> values) {
            addCriterion("marchant_add not in", values, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddBetween(String value1, String value2) {
            addCriterion("marchant_add between", value1, value2, "marchantAdd");
            return (Criteria) this;
        }

        public Criteria andMarchantAddNotBetween(String value1, String value2) {
            addCriterion("marchant_add not between", value1, value2, "marchantAdd");
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

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
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

        public Criteria andServiceAddIsNull() {
            addCriterion("service_add is null");
            return (Criteria) this;
        }

        public Criteria andServiceAddIsNotNull() {
            addCriterion("service_add is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAddEqualTo(String value) {
            addCriterion("service_add =", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddNotEqualTo(String value) {
            addCriterion("service_add <>", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddGreaterThan(String value) {
            addCriterion("service_add >", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddGreaterThanOrEqualTo(String value) {
            addCriterion("service_add >=", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddLessThan(String value) {
            addCriterion("service_add <", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddLessThanOrEqualTo(String value) {
            addCriterion("service_add <=", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddLike(String value) {
            addCriterion("service_add like", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddNotLike(String value) {
            addCriterion("service_add not like", value, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddIn(List<String> values) {
            addCriterion("service_add in", values, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddNotIn(List<String> values) {
            addCriterion("service_add not in", values, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddBetween(String value1, String value2) {
            addCriterion("service_add between", value1, value2, "serviceAdd");
            return (Criteria) this;
        }

        public Criteria andServiceAddNotBetween(String value1, String value2) {
            addCriterion("service_add not between", value1, value2, "serviceAdd");
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

        public Criteria andRequireTimeIsNull() {
            addCriterion("require_time is null");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIsNotNull() {
            addCriterion("require_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequireTimeEqualTo(Date value) {
            addCriterion("require_time =", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotEqualTo(Date value) {
            addCriterion("require_time <>", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeGreaterThan(Date value) {
            addCriterion("require_time >", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("require_time >=", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeLessThan(Date value) {
            addCriterion("require_time <", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeLessThanOrEqualTo(Date value) {
            addCriterion("require_time <=", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIn(List<Date> values) {
            addCriterion("require_time in", values, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotIn(List<Date> values) {
            addCriterion("require_time not in", values, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeBetween(Date value1, Date value2) {
            addCriterion("require_time between", value1, value2, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotBetween(Date value1, Date value2) {
            addCriterion("require_time not between", value1, value2, "requireTime");
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

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderSourseIsNull() {
            addCriterion("order_sourse is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourseIsNotNull() {
            addCriterion("order_sourse is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourseEqualTo(String value) {
            addCriterion("order_sourse =", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseNotEqualTo(String value) {
            addCriterion("order_sourse <>", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseGreaterThan(String value) {
            addCriterion("order_sourse >", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseGreaterThanOrEqualTo(String value) {
            addCriterion("order_sourse >=", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseLessThan(String value) {
            addCriterion("order_sourse <", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseLessThanOrEqualTo(String value) {
            addCriterion("order_sourse <=", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseLike(String value) {
            addCriterion("order_sourse like", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseNotLike(String value) {
            addCriterion("order_sourse not like", value, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseIn(List<String> values) {
            addCriterion("order_sourse in", values, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseNotIn(List<String> values) {
            addCriterion("order_sourse not in", values, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseBetween(String value1, String value2) {
            addCriterion("order_sourse between", value1, value2, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andOrderSourseNotBetween(String value1, String value2) {
            addCriterion("order_sourse not between", value1, value2, "orderSourse");
            return (Criteria) this;
        }

        public Criteria andServiceModeIsNull() {
            addCriterion("service_mode is null");
            return (Criteria) this;
        }

        public Criteria andServiceModeIsNotNull() {
            addCriterion("service_mode is not null");
            return (Criteria) this;
        }

        public Criteria andServiceModeEqualTo(String value) {
            addCriterion("service_mode =", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeNotEqualTo(String value) {
            addCriterion("service_mode <>", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeGreaterThan(String value) {
            addCriterion("service_mode >", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeGreaterThanOrEqualTo(String value) {
            addCriterion("service_mode >=", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeLessThan(String value) {
            addCriterion("service_mode <", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeLessThanOrEqualTo(String value) {
            addCriterion("service_mode <=", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeLike(String value) {
            addCriterion("service_mode like", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeNotLike(String value) {
            addCriterion("service_mode not like", value, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeIn(List<String> values) {
            addCriterion("service_mode in", values, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeNotIn(List<String> values) {
            addCriterion("service_mode not in", values, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeBetween(String value1, String value2) {
            addCriterion("service_mode between", value1, value2, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceModeNotBetween(String value1, String value2) {
            addCriterion("service_mode not between", value1, value2, "serviceMode");
            return (Criteria) this;
        }

        public Criteria andServiceProNameIsNull() {
            addCriterion("service_pro_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceProNameIsNotNull() {
            addCriterion("service_pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProNameEqualTo(String value) {
            addCriterion("service_pro_name =", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameNotEqualTo(String value) {
            addCriterion("service_pro_name <>", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameGreaterThan(String value) {
            addCriterion("service_pro_name >", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_pro_name >=", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameLessThan(String value) {
            addCriterion("service_pro_name <", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameLessThanOrEqualTo(String value) {
            addCriterion("service_pro_name <=", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameLike(String value) {
            addCriterion("service_pro_name like", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameNotLike(String value) {
            addCriterion("service_pro_name not like", value, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameIn(List<String> values) {
            addCriterion("service_pro_name in", values, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameNotIn(List<String> values) {
            addCriterion("service_pro_name not in", values, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameBetween(String value1, String value2) {
            addCriterion("service_pro_name between", value1, value2, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServiceProNameNotBetween(String value1, String value2) {
            addCriterion("service_pro_name not between", value1, value2, "serviceProName");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("service_phone is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("service_phone =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("service_phone <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("service_phone >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("service_phone <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("service_phone <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("service_phone like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("service_phone not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("service_phone in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("service_phone not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("service_phone between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("service_phone not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(String value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(String value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(String value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(String value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(String value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(String value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLike(String value) {
            addCriterion("service_charge like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotLike(String value) {
            addCriterion("service_charge not like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<String> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<String> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(String value1, String value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(String value1, String value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceDurationIsNull() {
            addCriterion("service_duration is null");
            return (Criteria) this;
        }

        public Criteria andServiceDurationIsNotNull() {
            addCriterion("service_duration is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDurationEqualTo(String value) {
            addCriterion("service_duration =", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationNotEqualTo(String value) {
            addCriterion("service_duration <>", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationGreaterThan(String value) {
            addCriterion("service_duration >", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationGreaterThanOrEqualTo(String value) {
            addCriterion("service_duration >=", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationLessThan(String value) {
            addCriterion("service_duration <", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationLessThanOrEqualTo(String value) {
            addCriterion("service_duration <=", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationLike(String value) {
            addCriterion("service_duration like", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationNotLike(String value) {
            addCriterion("service_duration not like", value, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationIn(List<String> values) {
            addCriterion("service_duration in", values, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationNotIn(List<String> values) {
            addCriterion("service_duration not in", values, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationBetween(String value1, String value2) {
            addCriterion("service_duration between", value1, value2, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceDurationNotBetween(String value1, String value2) {
            addCriterion("service_duration not between", value1, value2, "serviceDuration");
            return (Criteria) this;
        }

        public Criteria andServiceCountIsNull() {
            addCriterion("service_count is null");
            return (Criteria) this;
        }

        public Criteria andServiceCountIsNotNull() {
            addCriterion("service_count is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCountEqualTo(String value) {
            addCriterion("service_count =", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotEqualTo(String value) {
            addCriterion("service_count <>", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThan(String value) {
            addCriterion("service_count >", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThanOrEqualTo(String value) {
            addCriterion("service_count >=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThan(String value) {
            addCriterion("service_count <", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThanOrEqualTo(String value) {
            addCriterion("service_count <=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLike(String value) {
            addCriterion("service_count like", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotLike(String value) {
            addCriterion("service_count not like", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountIn(List<String> values) {
            addCriterion("service_count in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotIn(List<String> values) {
            addCriterion("service_count not in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountBetween(String value1, String value2) {
            addCriterion("service_count between", value1, value2, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotBetween(String value1, String value2) {
            addCriterion("service_count not between", value1, value2, "serviceCount");
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

        public Criteria andServiceRequireIsNull() {
            addCriterion("service_require is null");
            return (Criteria) this;
        }

        public Criteria andServiceRequireIsNotNull() {
            addCriterion("service_require is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRequireEqualTo(String value) {
            addCriterion("service_require =", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireNotEqualTo(String value) {
            addCriterion("service_require <>", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireGreaterThan(String value) {
            addCriterion("service_require >", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireGreaterThanOrEqualTo(String value) {
            addCriterion("service_require >=", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireLessThan(String value) {
            addCriterion("service_require <", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireLessThanOrEqualTo(String value) {
            addCriterion("service_require <=", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireLike(String value) {
            addCriterion("service_require like", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireNotLike(String value) {
            addCriterion("service_require not like", value, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireIn(List<String> values) {
            addCriterion("service_require in", values, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireNotIn(List<String> values) {
            addCriterion("service_require not in", values, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireBetween(String value1, String value2) {
            addCriterion("service_require between", value1, value2, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceRequireNotBetween(String value1, String value2) {
            addCriterion("service_require not between", value1, value2, "serviceRequire");
            return (Criteria) this;
        }

        public Criteria andServiceTimesIsNull() {
            addCriterion("service_times is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimesIsNotNull() {
            addCriterion("service_times is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimesEqualTo(Integer value) {
            addCriterion("service_times =", value, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesNotEqualTo(Integer value) {
            addCriterion("service_times <>", value, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesGreaterThan(Integer value) {
            addCriterion("service_times >", value, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_times >=", value, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesLessThan(Integer value) {
            addCriterion("service_times <", value, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesLessThanOrEqualTo(Integer value) {
            addCriterion("service_times <=", value, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesIn(List<Integer> values) {
            addCriterion("service_times in", values, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesNotIn(List<Integer> values) {
            addCriterion("service_times not in", values, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesBetween(Integer value1, Integer value2) {
            addCriterion("service_times between", value1, value2, "serviceTimes");
            return (Criteria) this;
        }

        public Criteria andServiceTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("service_times not between", value1, value2, "serviceTimes");
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