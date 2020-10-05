package com.education.system.entity;

import java.util.ArrayList;
import java.util.List;

public class eduTaskAndstuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduTaskAndstuExample() {
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

        public Criteria andStuAndclassIdIsNull() {
            addCriterion("stuAndclassId is null");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdIsNotNull() {
            addCriterion("stuAndclassId is not null");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdEqualTo(Integer value) {
            addCriterion("stuAndclassId =", value, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdNotEqualTo(Integer value) {
            addCriterion("stuAndclassId <>", value, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdGreaterThan(Integer value) {
            addCriterion("stuAndclassId >", value, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuAndclassId >=", value, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdLessThan(Integer value) {
            addCriterion("stuAndclassId <", value, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("stuAndclassId <=", value, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdIn(List<Integer> values) {
            addCriterion("stuAndclassId in", values, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdNotIn(List<Integer> values) {
            addCriterion("stuAndclassId not in", values, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdBetween(Integer value1, Integer value2) {
            addCriterion("stuAndclassId between", value1, value2, "stuAndclassId");
            return (Criteria) this;
        }

        public Criteria andStuAndclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stuAndclassId not between", value1, value2, "stuAndclassId");
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

        public Criteria andStu_divisionofworkIsNull() {
            addCriterion("stu_divisionofwork is null");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkIsNotNull() {
            addCriterion("stu_divisionofwork is not null");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkEqualTo(String value) {
            addCriterion("stu_divisionofwork =", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkNotEqualTo(String value) {
            addCriterion("stu_divisionofwork <>", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkGreaterThan(String value) {
            addCriterion("stu_divisionofwork >", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkGreaterThanOrEqualTo(String value) {
            addCriterion("stu_divisionofwork >=", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkLessThan(String value) {
            addCriterion("stu_divisionofwork <", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkLessThanOrEqualTo(String value) {
            addCriterion("stu_divisionofwork <=", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkLike(String value) {
            addCriterion("stu_divisionofwork like", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkNotLike(String value) {
            addCriterion("stu_divisionofwork not like", value, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkIn(List<String> values) {
            addCriterion("stu_divisionofwork in", values, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkNotIn(List<String> values) {
            addCriterion("stu_divisionofwork not in", values, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkBetween(String value1, String value2) {
            addCriterion("stu_divisionofwork between", value1, value2, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andStu_divisionofworkNotBetween(String value1, String value2) {
            addCriterion("stu_divisionofwork not between", value1, value2, "stu_divisionofwork");
            return (Criteria) this;
        }

        public Criteria andGroupIsNull() {
            addCriterion("group is null");
            return (Criteria) this;
        }

        public Criteria andGroupIsNotNull() {
            addCriterion("group is not null");
            return (Criteria) this;
        }

        public Criteria andGroupEqualTo(String value) {
            addCriterion("group =", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotEqualTo(String value) {
            addCriterion("group <>", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupGreaterThan(String value) {
            addCriterion("group >", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupGreaterThanOrEqualTo(String value) {
            addCriterion("group >=", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLessThan(String value) {
            addCriterion("group <", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLessThanOrEqualTo(String value) {
            addCriterion("group <=", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupLike(String value) {
            addCriterion("group like", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotLike(String value) {
            addCriterion("group not like", value, "group");
            return (Criteria) this;
        }

        public Criteria andGroupIn(List<String> values) {
            addCriterion("group in", values, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotIn(List<String> values) {
            addCriterion("group not in", values, "group");
            return (Criteria) this;
        }

        public Criteria andGroupBetween(String value1, String value2) {
            addCriterion("group between", value1, value2, "group");
            return (Criteria) this;
        }

        public Criteria andGroupNotBetween(String value1, String value2) {
            addCriterion("group not between", value1, value2, "group");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(String value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(String value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(String value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(String value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(String value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLike(String value) {
            addCriterion("capital like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotLike(String value) {
            addCriterion("capital not like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<String> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<String> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(String value1, String value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(String value1, String value2) {
            addCriterion("capital not between", value1, value2, "capital");
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