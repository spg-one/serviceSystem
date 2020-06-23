package com.adufeitian.servicesystem.mybatis.domain;

import java.util.ArrayList;
import java.util.List;

public class ServiceInforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceInforExample() {
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

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameIsNull() {
            addCriterion("system_lc_name is null");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameIsNotNull() {
            addCriterion("system_lc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameEqualTo(String value) {
            addCriterion("system_lc_name =", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameNotEqualTo(String value) {
            addCriterion("system_lc_name <>", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameGreaterThan(String value) {
            addCriterion("system_lc_name >", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameGreaterThanOrEqualTo(String value) {
            addCriterion("system_lc_name >=", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameLessThan(String value) {
            addCriterion("system_lc_name <", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameLessThanOrEqualTo(String value) {
            addCriterion("system_lc_name <=", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameLike(String value) {
            addCriterion("system_lc_name like", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameNotLike(String value) {
            addCriterion("system_lc_name not like", value, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameIn(List<String> values) {
            addCriterion("system_lc_name in", values, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameNotIn(List<String> values) {
            addCriterion("system_lc_name not in", values, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameBetween(String value1, String value2) {
            addCriterion("system_lc_name between", value1, value2, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemLcNameNotBetween(String value1, String value2) {
            addCriterion("system_lc_name not between", value1, value2, "systemLcName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameIsNull() {
            addCriterion("system_sc_name is null");
            return (Criteria) this;
        }

        public Criteria andSystemScNameIsNotNull() {
            addCriterion("system_sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSystemScNameEqualTo(String value) {
            addCriterion("system_sc_name =", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameNotEqualTo(String value) {
            addCriterion("system_sc_name <>", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameGreaterThan(String value) {
            addCriterion("system_sc_name >", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameGreaterThanOrEqualTo(String value) {
            addCriterion("system_sc_name >=", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameLessThan(String value) {
            addCriterion("system_sc_name <", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameLessThanOrEqualTo(String value) {
            addCriterion("system_sc_name <=", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameLike(String value) {
            addCriterion("system_sc_name like", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameNotLike(String value) {
            addCriterion("system_sc_name not like", value, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameIn(List<String> values) {
            addCriterion("system_sc_name in", values, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameNotIn(List<String> values) {
            addCriterion("system_sc_name not in", values, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameBetween(String value1, String value2) {
            addCriterion("system_sc_name between", value1, value2, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSystemScNameNotBetween(String value1, String value2) {
            addCriterion("system_sc_name not between", value1, value2, "systemScName");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoIsNull() {
            addCriterion("simple_info is null");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoIsNotNull() {
            addCriterion("simple_info is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoEqualTo(String value) {
            addCriterion("simple_info =", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoNotEqualTo(String value) {
            addCriterion("simple_info <>", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoGreaterThan(String value) {
            addCriterion("simple_info >", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoGreaterThanOrEqualTo(String value) {
            addCriterion("simple_info >=", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoLessThan(String value) {
            addCriterion("simple_info <", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoLessThanOrEqualTo(String value) {
            addCriterion("simple_info <=", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoLike(String value) {
            addCriterion("simple_info like", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoNotLike(String value) {
            addCriterion("simple_info not like", value, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoIn(List<String> values) {
            addCriterion("simple_info in", values, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoNotIn(List<String> values) {
            addCriterion("simple_info not in", values, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoBetween(String value1, String value2) {
            addCriterion("simple_info between", value1, value2, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andSimpleInfoNotBetween(String value1, String value2) {
            addCriterion("simple_info not between", value1, value2, "simpleInfo");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(String value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(String value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(String value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(String value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(String value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(String value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLike(String value) {
            addCriterion("charge like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotLike(String value) {
            addCriterion("charge not like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<String> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<String> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(String value1, String value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(String value1, String value2) {
            addCriterion("charge not between", value1, value2, "charge");
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