package com.education.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class eduTextbookcaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduTextbookcaseExample() {
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

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andScenesIsNull() {
            addCriterion("scenes is null");
            return (Criteria) this;
        }

        public Criteria andScenesIsNotNull() {
            addCriterion("scenes is not null");
            return (Criteria) this;
        }

        public Criteria andScenesEqualTo(String value) {
            addCriterion("scenes =", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesNotEqualTo(String value) {
            addCriterion("scenes <>", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesGreaterThan(String value) {
            addCriterion("scenes >", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesGreaterThanOrEqualTo(String value) {
            addCriterion("scenes >=", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesLessThan(String value) {
            addCriterion("scenes <", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesLessThanOrEqualTo(String value) {
            addCriterion("scenes <=", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesLike(String value) {
            addCriterion("scenes like", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesNotLike(String value) {
            addCriterion("scenes not like", value, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesIn(List<String> values) {
            addCriterion("scenes in", values, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesNotIn(List<String> values) {
            addCriterion("scenes not in", values, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesBetween(String value1, String value2) {
            addCriterion("scenes between", value1, value2, "scenes");
            return (Criteria) this;
        }

        public Criteria andScenesNotBetween(String value1, String value2) {
            addCriterion("scenes not between", value1, value2, "scenes");
            return (Criteria) this;
        }

        public Criteria andTaskIsNull() {
            addCriterion("task is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsNotNull() {
            addCriterion("task is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEqualTo(String value) {
            addCriterion("task =", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotEqualTo(String value) {
            addCriterion("task <>", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThan(String value) {
            addCriterion("task >", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThanOrEqualTo(String value) {
            addCriterion("task >=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThan(String value) {
            addCriterion("task <", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThanOrEqualTo(String value) {
            addCriterion("task <=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLike(String value) {
            addCriterion("task like", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotLike(String value) {
            addCriterion("task not like", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskIn(List<String> values) {
            addCriterion("task in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotIn(List<String> values) {
            addCriterion("task not in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskBetween(String value1, String value2) {
            addCriterion("task between", value1, value2, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotBetween(String value1, String value2) {
            addCriterion("task not between", value1, value2, "task");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryIsNull() {
            addCriterion("knowledgesummary is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryIsNotNull() {
            addCriterion("knowledgesummary is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryEqualTo(String value) {
            addCriterion("knowledgesummary =", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryNotEqualTo(String value) {
            addCriterion("knowledgesummary <>", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryGreaterThan(String value) {
            addCriterion("knowledgesummary >", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryGreaterThanOrEqualTo(String value) {
            addCriterion("knowledgesummary >=", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryLessThan(String value) {
            addCriterion("knowledgesummary <", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryLessThanOrEqualTo(String value) {
            addCriterion("knowledgesummary <=", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryLike(String value) {
            addCriterion("knowledgesummary like", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryNotLike(String value) {
            addCriterion("knowledgesummary not like", value, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryIn(List<String> values) {
            addCriterion("knowledgesummary in", values, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryNotIn(List<String> values) {
            addCriterion("knowledgesummary not in", values, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryBetween(String value1, String value2) {
            addCriterion("knowledgesummary between", value1, value2, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andKnowledgesummaryNotBetween(String value1, String value2) {
            addCriterion("knowledgesummary not between", value1, value2, "knowledgesummary");
            return (Criteria) this;
        }

        public Criteria andLinksIsNull() {
            addCriterion("links is null");
            return (Criteria) this;
        }

        public Criteria andLinksIsNotNull() {
            addCriterion("links is not null");
            return (Criteria) this;
        }

        public Criteria andLinksEqualTo(String value) {
            addCriterion("links =", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotEqualTo(String value) {
            addCriterion("links <>", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksGreaterThan(String value) {
            addCriterion("links >", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksGreaterThanOrEqualTo(String value) {
            addCriterion("links >=", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLessThan(String value) {
            addCriterion("links <", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLessThanOrEqualTo(String value) {
            addCriterion("links <=", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLike(String value) {
            addCriterion("links like", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotLike(String value) {
            addCriterion("links not like", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksIn(List<String> values) {
            addCriterion("links in", values, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotIn(List<String> values) {
            addCriterion("links not in", values, "links");
            return (Criteria) this;
        }

        public Criteria andLinksBetween(String value1, String value2) {
            addCriterion("links between", value1, value2, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotBetween(String value1, String value2) {
            addCriterion("links not between", value1, value2, "links");
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