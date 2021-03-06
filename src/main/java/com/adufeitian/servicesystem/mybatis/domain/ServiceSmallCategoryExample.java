package com.adufeitian.servicesystem.mybatis.domain;

import java.util.ArrayList;
import java.util.List;

public class ServiceSmallCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceSmallCategoryExample() {
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("system_id =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("system_id <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("system_id >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("system_id >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("system_id <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("system_id <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("system_id like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("system_id not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("system_id in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("system_id not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("system_id between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("system_id not between", value1, value2, "systemId");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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