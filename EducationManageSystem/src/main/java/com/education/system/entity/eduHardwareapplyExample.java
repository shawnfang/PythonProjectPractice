package com.education.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class eduHardwareapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduHardwareapplyExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart = limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public Integer getLimitSize() {
        return limitSize;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdIsNull() {
            addCriterion("hardwaremanageId is null");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdIsNotNull() {
            addCriterion("hardwaremanageId is not null");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdEqualTo(String value) {
            addCriterion("hardwaremanageId =", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdNotEqualTo(String value) {
            addCriterion("hardwaremanageId <>", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdGreaterThan(String value) {
            addCriterion("hardwaremanageId >", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdGreaterThanOrEqualTo(String value) {
            addCriterion("hardwaremanageId >=", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdLessThan(String value) {
            addCriterion("hardwaremanageId <", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdLessThanOrEqualTo(String value) {
            addCriterion("hardwaremanageId <=", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdLike(String value) {
            addCriterion("hardwaremanageId like", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdNotLike(String value) {
            addCriterion("hardwaremanageId not like", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdIn(List<String> values) {
            addCriterion("hardwaremanageId in", values, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdNotIn(List<String> values) {
            addCriterion("hardwaremanageId not in", values, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdBetween(String value1, String value2) {
            addCriterion("hardwaremanageId between", value1, value2, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdNotBetween(String value1, String value2) {
            addCriterion("hardwaremanageId not between", value1, value2, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andApply_descIsNull() {
            addCriterion("apply_desc is null");
            return (Criteria) this;
        }

        public Criteria andApply_descIsNotNull() {
            addCriterion("apply_desc is not null");
            return (Criteria) this;
        }

        public Criteria andApply_descEqualTo(String value) {
            addCriterion("apply_desc =", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descNotEqualTo(String value) {
            addCriterion("apply_desc <>", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descGreaterThan(String value) {
            addCriterion("apply_desc >", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descGreaterThanOrEqualTo(String value) {
            addCriterion("apply_desc >=", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descLessThan(String value) {
            addCriterion("apply_desc <", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descLessThanOrEqualTo(String value) {
            addCriterion("apply_desc <=", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descLike(String value) {
            addCriterion("apply_desc like", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descNotLike(String value) {
            addCriterion("apply_desc not like", value, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descIn(List<String> values) {
            addCriterion("apply_desc in", values, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descNotIn(List<String> values) {
            addCriterion("apply_desc not in", values, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descBetween(String value1, String value2) {
            addCriterion("apply_desc between", value1, value2, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_descNotBetween(String value1, String value2) {
            addCriterion("apply_desc not between", value1, value2, "apply_desc");
            return (Criteria) this;
        }

        public Criteria andApply_dateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApply_dateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApply_dateEqualTo(Date value) {
            addCriterion("apply_date =", value, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateNotEqualTo(Date value) {
            addCriterion("apply_date <>", value, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateGreaterThan(Date value) {
            addCriterion("apply_date >", value, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_date >=", value, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateLessThan(Date value) {
            addCriterion("apply_date <", value, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateLessThanOrEqualTo(Date value) {
            addCriterion("apply_date <=", value, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateIn(List<Date> values) {
            addCriterion("apply_date in", values, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateNotIn(List<Date> values) {
            addCriterion("apply_date not in", values, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateBetween(Date value1, Date value2) {
            addCriterion("apply_date between", value1, value2, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApply_dateNotBetween(Date value1, Date value2) {
            addCriterion("apply_date not between", value1, value2, "apply_date");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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