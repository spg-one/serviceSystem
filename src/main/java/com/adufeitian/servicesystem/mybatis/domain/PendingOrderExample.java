package com.adufeitian.servicesystem.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PendingOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PendingOrderExample() {
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

        public Criteria andDispatchTimeIsNull() {
            addCriterion("dispatch_time is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNotNull() {
            addCriterion("dispatch_time is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeEqualTo(Date value) {
            addCriterion("dispatch_time =", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotEqualTo(Date value) {
            addCriterion("dispatch_time <>", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThan(Date value) {
            addCriterion("dispatch_time >", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dispatch_time >=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThan(Date value) {
            addCriterion("dispatch_time <", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("dispatch_time <=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIn(List<Date> values) {
            addCriterion("dispatch_time in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotIn(List<Date> values) {
            addCriterion("dispatch_time not in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeBetween(Date value1, Date value2) {
            addCriterion("dispatch_time between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("dispatch_time not between", value1, value2, "dispatchTime");
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

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
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