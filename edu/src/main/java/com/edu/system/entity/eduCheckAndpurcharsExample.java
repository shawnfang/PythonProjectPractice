package com.edu.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class eduCheckAndpurcharsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduCheckAndpurcharsExample() {
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

        public Criteria andHardwaremanageIdEqualTo(Integer value) {
            addCriterion("hardwaremanageId =", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdNotEqualTo(Integer value) {
            addCriterion("hardwaremanageId <>", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdGreaterThan(Integer value) {
            addCriterion("hardwaremanageId >", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hardwaremanageId >=", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdLessThan(Integer value) {
            addCriterion("hardwaremanageId <", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdLessThanOrEqualTo(Integer value) {
            addCriterion("hardwaremanageId <=", value, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdIn(List<Integer> values) {
            addCriterion("hardwaremanageId in", values, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdNotIn(List<Integer> values) {
            addCriterion("hardwaremanageId not in", values, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdBetween(Integer value1, Integer value2) {
            addCriterion("hardwaremanageId between", value1, value2, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwaremanageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hardwaremanageId not between", value1, value2, "hardwaremanageId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdIsNull() {
            addCriterion("hardwarepurcharsId is null");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdIsNotNull() {
            addCriterion("hardwarepurcharsId is not null");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdEqualTo(Integer value) {
            addCriterion("hardwarepurcharsId =", value, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdNotEqualTo(Integer value) {
            addCriterion("hardwarepurcharsId <>", value, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdGreaterThan(Integer value) {
            addCriterion("hardwarepurcharsId >", value, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hardwarepurcharsId >=", value, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdLessThan(Integer value) {
            addCriterion("hardwarepurcharsId <", value, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdLessThanOrEqualTo(Integer value) {
            addCriterion("hardwarepurcharsId <=", value, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdIn(List<Integer> values) {
            addCriterion("hardwarepurcharsId in", values, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdNotIn(List<Integer> values) {
            addCriterion("hardwarepurcharsId not in", values, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdBetween(Integer value1, Integer value2) {
            addCriterion("hardwarepurcharsId between", value1, value2, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andHardwarepurcharsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hardwarepurcharsId not between", value1, value2, "hardwarepurcharsId");
            return (Criteria) this;
        }

        public Criteria andCheckIsNull() {
            addCriterion("check is null");
            return (Criteria) this;
        }

        public Criteria andCheckIsNotNull() {
            addCriterion("check is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEqualTo(String value) {
            addCriterion("check =", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotEqualTo(String value) {
            addCriterion("check <>", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThan(String value) {
            addCriterion("check >", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThanOrEqualTo(String value) {
            addCriterion("check >=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThan(String value) {
            addCriterion("check <", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThanOrEqualTo(String value) {
            addCriterion("check <=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLike(String value) {
            addCriterion("check like", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotLike(String value) {
            addCriterion("check not like", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckIn(List<String> values) {
            addCriterion("check in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotIn(List<String> values) {
            addCriterion("check not in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckBetween(String value1, String value2) {
            addCriterion("check between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotBetween(String value1, String value2) {
            addCriterion("check not between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andCheck_descIsNull() {
            addCriterion("check_desc is null");
            return (Criteria) this;
        }

        public Criteria andCheck_descIsNotNull() {
            addCriterion("check_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCheck_descEqualTo(String value) {
            addCriterion("check_desc =", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descNotEqualTo(String value) {
            addCriterion("check_desc <>", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descGreaterThan(String value) {
            addCriterion("check_desc >", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descGreaterThanOrEqualTo(String value) {
            addCriterion("check_desc >=", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descLessThan(String value) {
            addCriterion("check_desc <", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descLessThanOrEqualTo(String value) {
            addCriterion("check_desc <=", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descLike(String value) {
            addCriterion("check_desc like", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descNotLike(String value) {
            addCriterion("check_desc not like", value, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descIn(List<String> values) {
            addCriterion("check_desc in", values, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descNotIn(List<String> values) {
            addCriterion("check_desc not in", values, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descBetween(String value1, String value2) {
            addCriterion("check_desc between", value1, value2, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_descNotBetween(String value1, String value2) {
            addCriterion("check_desc not between", value1, value2, "check_desc");
            return (Criteria) this;
        }

        public Criteria andCheck_dateIsNull() {
            addCriterion("check_date is null");
            return (Criteria) this;
        }

        public Criteria andCheck_dateIsNotNull() {
            addCriterion("check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheck_dateEqualTo(Date value) {
            addCriterion("check_date =", value, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateNotEqualTo(Date value) {
            addCriterion("check_date <>", value, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateGreaterThan(Date value) {
            addCriterion("check_date >", value, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("check_date >=", value, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateLessThan(Date value) {
            addCriterion("check_date <", value, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateLessThanOrEqualTo(Date value) {
            addCriterion("check_date <=", value, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateIn(List<Date> values) {
            addCriterion("check_date in", values, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateNotIn(List<Date> values) {
            addCriterion("check_date not in", values, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateBetween(Date value1, Date value2) {
            addCriterion("check_date between", value1, value2, "check_date");
            return (Criteria) this;
        }

        public Criteria andCheck_dateNotBetween(Date value1, Date value2) {
            addCriterion("check_date not between", value1, value2, "check_date");
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