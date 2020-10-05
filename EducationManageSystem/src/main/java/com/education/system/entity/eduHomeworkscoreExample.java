package com.education.system.entity;

import java.util.ArrayList;
import java.util.List;

public class eduHomeworkscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduHomeworkscoreExample() {
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

        public Criteria andSelfscoreIsNull() {
            addCriterion("selfscore is null");
            return (Criteria) this;
        }

        public Criteria andSelfscoreIsNotNull() {
            addCriterion("selfscore is not null");
            return (Criteria) this;
        }

        public Criteria andSelfscoreEqualTo(String value) {
            addCriterion("selfscore =", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreNotEqualTo(String value) {
            addCriterion("selfscore <>", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreGreaterThan(String value) {
            addCriterion("selfscore >", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreGreaterThanOrEqualTo(String value) {
            addCriterion("selfscore >=", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreLessThan(String value) {
            addCriterion("selfscore <", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreLessThanOrEqualTo(String value) {
            addCriterion("selfscore <=", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreLike(String value) {
            addCriterion("selfscore like", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreNotLike(String value) {
            addCriterion("selfscore not like", value, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreIn(List<String> values) {
            addCriterion("selfscore in", values, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreNotIn(List<String> values) {
            addCriterion("selfscore not in", values, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreBetween(String value1, String value2) {
            addCriterion("selfscore between", value1, value2, "selfscore");
            return (Criteria) this;
        }

        public Criteria andSelfscoreNotBetween(String value1, String value2) {
            addCriterion("selfscore not between", value1, value2, "selfscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreIsNull() {
            addCriterion("teacherscore is null");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreIsNotNull() {
            addCriterion("teacherscore is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreEqualTo(String value) {
            addCriterion("teacherscore =", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreNotEqualTo(String value) {
            addCriterion("teacherscore <>", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreGreaterThan(String value) {
            addCriterion("teacherscore >", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreGreaterThanOrEqualTo(String value) {
            addCriterion("teacherscore >=", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreLessThan(String value) {
            addCriterion("teacherscore <", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreLessThanOrEqualTo(String value) {
            addCriterion("teacherscore <=", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreLike(String value) {
            addCriterion("teacherscore like", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreNotLike(String value) {
            addCriterion("teacherscore not like", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreIn(List<String> values) {
            addCriterion("teacherscore in", values, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreNotIn(List<String> values) {
            addCriterion("teacherscore not in", values, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreBetween(String value1, String value2) {
            addCriterion("teacherscore between", value1, value2, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreNotBetween(String value1, String value2) {
            addCriterion("teacherscore not between", value1, value2, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andGradepointIsNull() {
            addCriterion("gradepoint is null");
            return (Criteria) this;
        }

        public Criteria andGradepointIsNotNull() {
            addCriterion("gradepoint is not null");
            return (Criteria) this;
        }

        public Criteria andGradepointEqualTo(String value) {
            addCriterion("gradepoint =", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointNotEqualTo(String value) {
            addCriterion("gradepoint <>", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointGreaterThan(String value) {
            addCriterion("gradepoint >", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointGreaterThanOrEqualTo(String value) {
            addCriterion("gradepoint >=", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointLessThan(String value) {
            addCriterion("gradepoint <", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointLessThanOrEqualTo(String value) {
            addCriterion("gradepoint <=", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointLike(String value) {
            addCriterion("gradepoint like", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointNotLike(String value) {
            addCriterion("gradepoint not like", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointIn(List<String> values) {
            addCriterion("gradepoint in", values, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointNotIn(List<String> values) {
            addCriterion("gradepoint not in", values, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointBetween(String value1, String value2) {
            addCriterion("gradepoint between", value1, value2, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointNotBetween(String value1, String value2) {
            addCriterion("gradepoint not between", value1, value2, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andStausIsNull() {
            addCriterion("staus is null");
            return (Criteria) this;
        }

        public Criteria andStausIsNotNull() {
            addCriterion("staus is not null");
            return (Criteria) this;
        }

        public Criteria andStausEqualTo(String value) {
            addCriterion("staus =", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotEqualTo(String value) {
            addCriterion("staus <>", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThan(String value) {
            addCriterion("staus >", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThanOrEqualTo(String value) {
            addCriterion("staus >=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThan(String value) {
            addCriterion("staus <", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThanOrEqualTo(String value) {
            addCriterion("staus <=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLike(String value) {
            addCriterion("staus like", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotLike(String value) {
            addCriterion("staus not like", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausIn(List<String> values) {
            addCriterion("staus in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotIn(List<String> values) {
            addCriterion("staus not in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausBetween(String value1, String value2) {
            addCriterion("staus between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotBetween(String value1, String value2) {
            addCriterion("staus not between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdIsNull() {
            addCriterion("homeworkId is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdIsNotNull() {
            addCriterion("homeworkId is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdEqualTo(Integer value) {
            addCriterion("homeworkId =", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotEqualTo(Integer value) {
            addCriterion("homeworkId <>", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdGreaterThan(Integer value) {
            addCriterion("homeworkId >", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("homeworkId >=", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdLessThan(Integer value) {
            addCriterion("homeworkId <", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdLessThanOrEqualTo(Integer value) {
            addCriterion("homeworkId <=", value, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdIn(List<Integer> values) {
            addCriterion("homeworkId in", values, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotIn(List<Integer> values) {
            addCriterion("homeworkId not in", values, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdBetween(Integer value1, Integer value2) {
            addCriterion("homeworkId between", value1, value2, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andHomeworkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("homeworkId not between", value1, value2, "homeworkId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdIsNull() {
            addCriterion("courseTaskCoreliteracyId is null");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdIsNotNull() {
            addCriterion("courseTaskCoreliteracyId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdEqualTo(Integer value) {
            addCriterion("courseTaskCoreliteracyId =", value, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdNotEqualTo(Integer value) {
            addCriterion("courseTaskCoreliteracyId <>", value, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdGreaterThan(Integer value) {
            addCriterion("courseTaskCoreliteracyId >", value, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseTaskCoreliteracyId >=", value, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdLessThan(Integer value) {
            addCriterion("courseTaskCoreliteracyId <", value, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdLessThanOrEqualTo(Integer value) {
            addCriterion("courseTaskCoreliteracyId <=", value, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdIn(List<Integer> values) {
            addCriterion("courseTaskCoreliteracyId in", values, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdNotIn(List<Integer> values) {
            addCriterion("courseTaskCoreliteracyId not in", values, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdBetween(Integer value1, Integer value2) {
            addCriterion("courseTaskCoreliteracyId between", value1, value2, "courseTaskCoreliteracyId");
            return (Criteria) this;
        }

        public Criteria andCourseTaskCoreliteracyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("courseTaskCoreliteracyId not between", value1, value2, "courseTaskCoreliteracyId");
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