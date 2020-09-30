package com.edu.system.entity;

import java.util.ArrayList;
import java.util.List;

public class eduBookAnddetailAndcaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduBookAnddetailAndcaseExample() {
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

        public Criteria andTextbookIdIsNull() {
            addCriterion("textbookId is null");
            return (Criteria) this;
        }

        public Criteria andTextbookIdIsNotNull() {
            addCriterion("textbookId is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookIdEqualTo(Integer value) {
            addCriterion("textbookId =", value, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdNotEqualTo(Integer value) {
            addCriterion("textbookId <>", value, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdGreaterThan(Integer value) {
            addCriterion("textbookId >", value, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("textbookId >=", value, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdLessThan(Integer value) {
            addCriterion("textbookId <", value, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdLessThanOrEqualTo(Integer value) {
            addCriterion("textbookId <=", value, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdIn(List<Integer> values) {
            addCriterion("textbookId in", values, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdNotIn(List<Integer> values) {
            addCriterion("textbookId not in", values, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdBetween(Integer value1, Integer value2) {
            addCriterion("textbookId between", value1, value2, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("textbookId not between", value1, value2, "textbookId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdIsNull() {
            addCriterion("textbookdetailId is null");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdIsNotNull() {
            addCriterion("textbookdetailId is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdEqualTo(Integer value) {
            addCriterion("textbookdetailId =", value, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdNotEqualTo(Integer value) {
            addCriterion("textbookdetailId <>", value, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdGreaterThan(Integer value) {
            addCriterion("textbookdetailId >", value, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("textbookdetailId >=", value, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdLessThan(Integer value) {
            addCriterion("textbookdetailId <", value, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("textbookdetailId <=", value, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdIn(List<Integer> values) {
            addCriterion("textbookdetailId in", values, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdNotIn(List<Integer> values) {
            addCriterion("textbookdetailId not in", values, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("textbookdetailId between", value1, value2, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("textbookdetailId not between", value1, value2, "textbookdetailId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdIsNull() {
            addCriterion("textbookcaseId is null");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdIsNotNull() {
            addCriterion("textbookcaseId is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdEqualTo(Integer value) {
            addCriterion("textbookcaseId =", value, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdNotEqualTo(Integer value) {
            addCriterion("textbookcaseId <>", value, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdGreaterThan(Integer value) {
            addCriterion("textbookcaseId >", value, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("textbookcaseId >=", value, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdLessThan(Integer value) {
            addCriterion("textbookcaseId <", value, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("textbookcaseId <=", value, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdIn(List<Integer> values) {
            addCriterion("textbookcaseId in", values, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdNotIn(List<Integer> values) {
            addCriterion("textbookcaseId not in", values, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdBetween(Integer value1, Integer value2) {
            addCriterion("textbookcaseId between", value1, value2, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andTextbookcaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("textbookcaseId not between", value1, value2, "textbookcaseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("courseId <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseId");
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