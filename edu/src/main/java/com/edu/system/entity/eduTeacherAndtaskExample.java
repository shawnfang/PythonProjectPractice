package com.edu.system.entity;

import java.util.ArrayList;
import java.util.List;

public class eduTeacherAndtaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduTeacherAndtaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("taskId =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("taskId <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("taskId >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskId >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("taskId <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("taskId <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("taskId in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("taskId not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("taskId between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("taskId not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdIsNull() {
            addCriterion("taskAndstuId is null");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdIsNotNull() {
            addCriterion("taskAndstuId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdEqualTo(Integer value) {
            addCriterion("taskAndstuId =", value, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdNotEqualTo(Integer value) {
            addCriterion("taskAndstuId <>", value, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdGreaterThan(Integer value) {
            addCriterion("taskAndstuId >", value, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskAndstuId >=", value, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdLessThan(Integer value) {
            addCriterion("taskAndstuId <", value, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdLessThanOrEqualTo(Integer value) {
            addCriterion("taskAndstuId <=", value, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdIn(List<Integer> values) {
            addCriterion("taskAndstuId in", values, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdNotIn(List<Integer> values) {
            addCriterion("taskAndstuId not in", values, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdBetween(Integer value1, Integer value2) {
            addCriterion("taskAndstuId between", value1, value2, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andTaskAndstuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("taskAndstuId not between", value1, value2, "taskAndstuId");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkIsNull() {
            addCriterion("hasHomework is null");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkIsNotNull() {
            addCriterion("hasHomework is not null");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkEqualTo(String value) {
            addCriterion("hasHomework =", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkNotEqualTo(String value) {
            addCriterion("hasHomework <>", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkGreaterThan(String value) {
            addCriterion("hasHomework >", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkGreaterThanOrEqualTo(String value) {
            addCriterion("hasHomework >=", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkLessThan(String value) {
            addCriterion("hasHomework <", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkLessThanOrEqualTo(String value) {
            addCriterion("hasHomework <=", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkLike(String value) {
            addCriterion("hasHomework like", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkNotLike(String value) {
            addCriterion("hasHomework not like", value, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkIn(List<String> values) {
            addCriterion("hasHomework in", values, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkNotIn(List<String> values) {
            addCriterion("hasHomework not in", values, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkBetween(String value1, String value2) {
            addCriterion("hasHomework between", value1, value2, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasHomeworkNotBetween(String value1, String value2) {
            addCriterion("hasHomework not between", value1, value2, "hasHomework");
            return (Criteria) this;
        }

        public Criteria andHasScoreIsNull() {
            addCriterion("hasScore is null");
            return (Criteria) this;
        }

        public Criteria andHasScoreIsNotNull() {
            addCriterion("hasScore is not null");
            return (Criteria) this;
        }

        public Criteria andHasScoreEqualTo(String value) {
            addCriterion("hasScore =", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreNotEqualTo(String value) {
            addCriterion("hasScore <>", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreGreaterThan(String value) {
            addCriterion("hasScore >", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreGreaterThanOrEqualTo(String value) {
            addCriterion("hasScore >=", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreLessThan(String value) {
            addCriterion("hasScore <", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreLessThanOrEqualTo(String value) {
            addCriterion("hasScore <=", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreLike(String value) {
            addCriterion("hasScore like", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreNotLike(String value) {
            addCriterion("hasScore not like", value, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreIn(List<String> values) {
            addCriterion("hasScore in", values, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreNotIn(List<String> values) {
            addCriterion("hasScore not in", values, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreBetween(String value1, String value2) {
            addCriterion("hasScore between", value1, value2, "hasScore");
            return (Criteria) this;
        }

        public Criteria andHasScoreNotBetween(String value1, String value2) {
            addCriterion("hasScore not between", value1, value2, "hasScore");
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