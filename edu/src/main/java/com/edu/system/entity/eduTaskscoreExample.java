package com.edu.system.entity;

import java.util.ArrayList;
import java.util.List;

public class eduTaskscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduTaskscoreExample() {
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

        public Criteria andT_suggestIsNull() {
            addCriterion("t_suggest is null");
            return (Criteria) this;
        }

        public Criteria andT_suggestIsNotNull() {
            addCriterion("t_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andT_suggestEqualTo(String value) {
            addCriterion("t_suggest =", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestNotEqualTo(String value) {
            addCriterion("t_suggest <>", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestGreaterThan(String value) {
            addCriterion("t_suggest >", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestGreaterThanOrEqualTo(String value) {
            addCriterion("t_suggest >=", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestLessThan(String value) {
            addCriterion("t_suggest <", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestLessThanOrEqualTo(String value) {
            addCriterion("t_suggest <=", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestLike(String value) {
            addCriterion("t_suggest like", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestNotLike(String value) {
            addCriterion("t_suggest not like", value, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestIn(List<String> values) {
            addCriterion("t_suggest in", values, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestNotIn(List<String> values) {
            addCriterion("t_suggest not in", values, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestBetween(String value1, String value2) {
            addCriterion("t_suggest between", value1, value2, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_suggestNotBetween(String value1, String value2) {
            addCriterion("t_suggest not between", value1, value2, "t_suggest");
            return (Criteria) this;
        }

        public Criteria andT_scoreIsNull() {
            addCriterion("t_score is null");
            return (Criteria) this;
        }

        public Criteria andT_scoreIsNotNull() {
            addCriterion("t_score is not null");
            return (Criteria) this;
        }

        public Criteria andT_scoreEqualTo(String value) {
            addCriterion("t_score =", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreNotEqualTo(String value) {
            addCriterion("t_score <>", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreGreaterThan(String value) {
            addCriterion("t_score >", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreGreaterThanOrEqualTo(String value) {
            addCriterion("t_score >=", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreLessThan(String value) {
            addCriterion("t_score <", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreLessThanOrEqualTo(String value) {
            addCriterion("t_score <=", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreLike(String value) {
            addCriterion("t_score like", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreNotLike(String value) {
            addCriterion("t_score not like", value, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreIn(List<String> values) {
            addCriterion("t_score in", values, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreNotIn(List<String> values) {
            addCriterion("t_score not in", values, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreBetween(String value1, String value2) {
            addCriterion("t_score between", value1, value2, "t_score");
            return (Criteria) this;
        }

        public Criteria andT_scoreNotBetween(String value1, String value2) {
            addCriterion("t_score not between", value1, value2, "t_score");
            return (Criteria) this;
        }

        public Criteria andTask_suggestIsNull() {
            addCriterion("task_suggest is null");
            return (Criteria) this;
        }

        public Criteria andTask_suggestIsNotNull() {
            addCriterion("task_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andTask_suggestEqualTo(String value) {
            addCriterion("task_suggest =", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestNotEqualTo(String value) {
            addCriterion("task_suggest <>", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestGreaterThan(String value) {
            addCriterion("task_suggest >", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestGreaterThanOrEqualTo(String value) {
            addCriterion("task_suggest >=", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestLessThan(String value) {
            addCriterion("task_suggest <", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestLessThanOrEqualTo(String value) {
            addCriterion("task_suggest <=", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestLike(String value) {
            addCriterion("task_suggest like", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestNotLike(String value) {
            addCriterion("task_suggest not like", value, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestIn(List<String> values) {
            addCriterion("task_suggest in", values, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestNotIn(List<String> values) {
            addCriterion("task_suggest not in", values, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestBetween(String value1, String value2) {
            addCriterion("task_suggest between", value1, value2, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_suggestNotBetween(String value1, String value2) {
            addCriterion("task_suggest not between", value1, value2, "task_suggest");
            return (Criteria) this;
        }

        public Criteria andTask_scoreIsNull() {
            addCriterion("task_score is null");
            return (Criteria) this;
        }

        public Criteria andTask_scoreIsNotNull() {
            addCriterion("task_score is not null");
            return (Criteria) this;
        }

        public Criteria andTask_scoreEqualTo(String value) {
            addCriterion("task_score =", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreNotEqualTo(String value) {
            addCriterion("task_score <>", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreGreaterThan(String value) {
            addCriterion("task_score >", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreGreaterThanOrEqualTo(String value) {
            addCriterion("task_score >=", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreLessThan(String value) {
            addCriterion("task_score <", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreLessThanOrEqualTo(String value) {
            addCriterion("task_score <=", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreLike(String value) {
            addCriterion("task_score like", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreNotLike(String value) {
            addCriterion("task_score not like", value, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreIn(List<String> values) {
            addCriterion("task_score in", values, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreNotIn(List<String> values) {
            addCriterion("task_score not in", values, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreBetween(String value1, String value2) {
            addCriterion("task_score between", value1, value2, "task_score");
            return (Criteria) this;
        }

        public Criteria andTask_scoreNotBetween(String value1, String value2) {
            addCriterion("task_score not between", value1, value2, "task_score");
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