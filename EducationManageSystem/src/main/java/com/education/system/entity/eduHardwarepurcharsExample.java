package com.education.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class eduHardwarepurcharsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduHardwarepurcharsExample() {
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

        public Criteria andHardware_nameIsNull() {
            addCriterion("hardware_name is null");
            return (Criteria) this;
        }

        public Criteria andHardware_nameIsNotNull() {
            addCriterion("hardware_name is not null");
            return (Criteria) this;
        }

        public Criteria andHardware_nameEqualTo(String value) {
            addCriterion("hardware_name =", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameNotEqualTo(String value) {
            addCriterion("hardware_name <>", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameGreaterThan(String value) {
            addCriterion("hardware_name >", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameGreaterThanOrEqualTo(String value) {
            addCriterion("hardware_name >=", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameLessThan(String value) {
            addCriterion("hardware_name <", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameLessThanOrEqualTo(String value) {
            addCriterion("hardware_name <=", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameLike(String value) {
            addCriterion("hardware_name like", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameNotLike(String value) {
            addCriterion("hardware_name not like", value, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameIn(List<String> values) {
            addCriterion("hardware_name in", values, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameNotIn(List<String> values) {
            addCriterion("hardware_name not in", values, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameBetween(String value1, String value2) {
            addCriterion("hardware_name between", value1, value2, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_nameNotBetween(String value1, String value2) {
            addCriterion("hardware_name not between", value1, value2, "hardware_name");
            return (Criteria) this;
        }

        public Criteria andHardware_typeIsNull() {
            addCriterion("hardware_type is null");
            return (Criteria) this;
        }

        public Criteria andHardware_typeIsNotNull() {
            addCriterion("hardware_type is not null");
            return (Criteria) this;
        }

        public Criteria andHardware_typeEqualTo(String value) {
            addCriterion("hardware_type =", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeNotEqualTo(String value) {
            addCriterion("hardware_type <>", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeGreaterThan(String value) {
            addCriterion("hardware_type >", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeGreaterThanOrEqualTo(String value) {
            addCriterion("hardware_type >=", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeLessThan(String value) {
            addCriterion("hardware_type <", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeLessThanOrEqualTo(String value) {
            addCriterion("hardware_type <=", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeLike(String value) {
            addCriterion("hardware_type like", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeNotLike(String value) {
            addCriterion("hardware_type not like", value, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeIn(List<String> values) {
            addCriterion("hardware_type in", values, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeNotIn(List<String> values) {
            addCriterion("hardware_type not in", values, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeBetween(String value1, String value2) {
            addCriterion("hardware_type between", value1, value2, "hardware_type");
            return (Criteria) this;
        }

        public Criteria andHardware_typeNotBetween(String value1, String value2) {
            addCriterion("hardware_type not between", value1, value2, "hardware_type");
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

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andApply_resultIsNull() {
            addCriterion("apply_result is null");
            return (Criteria) this;
        }

        public Criteria andApply_resultIsNotNull() {
            addCriterion("apply_result is not null");
            return (Criteria) this;
        }

        public Criteria andApply_resultEqualTo(String value) {
            addCriterion("apply_result =", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultNotEqualTo(String value) {
            addCriterion("apply_result <>", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultGreaterThan(String value) {
            addCriterion("apply_result >", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultGreaterThanOrEqualTo(String value) {
            addCriterion("apply_result >=", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultLessThan(String value) {
            addCriterion("apply_result <", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultLessThanOrEqualTo(String value) {
            addCriterion("apply_result <=", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultLike(String value) {
            addCriterion("apply_result like", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultNotLike(String value) {
            addCriterion("apply_result not like", value, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultIn(List<String> values) {
            addCriterion("apply_result in", values, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultNotIn(List<String> values) {
            addCriterion("apply_result not in", values, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultBetween(String value1, String value2) {
            addCriterion("apply_result between", value1, value2, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultNotBetween(String value1, String value2) {
            addCriterion("apply_result not between", value1, value2, "apply_result");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesIsNull() {
            addCriterion("apply_resultdes is null");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesIsNotNull() {
            addCriterion("apply_resultdes is not null");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesEqualTo(String value) {
            addCriterion("apply_resultdes =", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesNotEqualTo(String value) {
            addCriterion("apply_resultdes <>", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesGreaterThan(String value) {
            addCriterion("apply_resultdes >", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesGreaterThanOrEqualTo(String value) {
            addCriterion("apply_resultdes >=", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesLessThan(String value) {
            addCriterion("apply_resultdes <", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesLessThanOrEqualTo(String value) {
            addCriterion("apply_resultdes <=", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesLike(String value) {
            addCriterion("apply_resultdes like", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesNotLike(String value) {
            addCriterion("apply_resultdes not like", value, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesIn(List<String> values) {
            addCriterion("apply_resultdes in", values, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesNotIn(List<String> values) {
            addCriterion("apply_resultdes not in", values, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesBetween(String value1, String value2) {
            addCriterion("apply_resultdes between", value1, value2, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_resultdesNotBetween(String value1, String value2) {
            addCriterion("apply_resultdes not between", value1, value2, "apply_resultdes");
            return (Criteria) this;
        }

        public Criteria andApply_causeIsNull() {
            addCriterion("apply_cause is null");
            return (Criteria) this;
        }

        public Criteria andApply_causeIsNotNull() {
            addCriterion("apply_cause is not null");
            return (Criteria) this;
        }

        public Criteria andApply_causeEqualTo(String value) {
            addCriterion("apply_cause =", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeNotEqualTo(String value) {
            addCriterion("apply_cause <>", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeGreaterThan(String value) {
            addCriterion("apply_cause >", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_cause >=", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeLessThan(String value) {
            addCriterion("apply_cause <", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeLessThanOrEqualTo(String value) {
            addCriterion("apply_cause <=", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeLike(String value) {
            addCriterion("apply_cause like", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeNotLike(String value) {
            addCriterion("apply_cause not like", value, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeIn(List<String> values) {
            addCriterion("apply_cause in", values, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeNotIn(List<String> values) {
            addCriterion("apply_cause not in", values, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeBetween(String value1, String value2) {
            addCriterion("apply_cause between", value1, value2, "apply_cause");
            return (Criteria) this;
        }

        public Criteria andApply_causeNotBetween(String value1, String value2) {
            addCriterion("apply_cause not between", value1, value2, "apply_cause");
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