package com.edu.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class eduTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduTaskExample() {
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

        public Criteria andSchoolyearIdIsNull() {
            addCriterion("schoolyearId is null");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdIsNotNull() {
            addCriterion("schoolyearId is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdEqualTo(Integer value) {
            addCriterion("schoolyearId =", value, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdNotEqualTo(Integer value) {
            addCriterion("schoolyearId <>", value, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdGreaterThan(Integer value) {
            addCriterion("schoolyearId >", value, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolyearId >=", value, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdLessThan(Integer value) {
            addCriterion("schoolyearId <", value, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdLessThanOrEqualTo(Integer value) {
            addCriterion("schoolyearId <=", value, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdIn(List<Integer> values) {
            addCriterion("schoolyearId in", values, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdNotIn(List<Integer> values) {
            addCriterion("schoolyearId not in", values, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdBetween(Integer value1, Integer value2) {
            addCriterion("schoolyearId between", value1, value2, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andSchoolyearIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolyearId not between", value1, value2, "schoolyearId");
            return (Criteria) this;
        }

        public Criteria andClass_dateIsNull() {
            addCriterion("class_date is null");
            return (Criteria) this;
        }

        public Criteria andClass_dateIsNotNull() {
            addCriterion("class_date is not null");
            return (Criteria) this;
        }

        public Criteria andClass_dateEqualTo(Date value) {
            addCriterion("class_date =", value, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateNotEqualTo(Date value) {
            addCriterion("class_date <>", value, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateGreaterThan(Date value) {
            addCriterion("class_date >", value, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("class_date >=", value, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateLessThan(Date value) {
            addCriterion("class_date <", value, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateLessThanOrEqualTo(Date value) {
            addCriterion("class_date <=", value, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateIn(List<Date> values) {
            addCriterion("class_date in", values, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateNotIn(List<Date> values) {
            addCriterion("class_date not in", values, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateBetween(Date value1, Date value2) {
            addCriterion("class_date between", value1, value2, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_dateNotBetween(Date value1, Date value2) {
            addCriterion("class_date not between", value1, value2, "class_date");
            return (Criteria) this;
        }

        public Criteria andClass_timeIsNull() {
            addCriterion("class_time is null");
            return (Criteria) this;
        }

        public Criteria andClass_timeIsNotNull() {
            addCriterion("class_time is not null");
            return (Criteria) this;
        }

        public Criteria andClass_timeEqualTo(Date value) {
            addCriterion("class_time =", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotEqualTo(Date value) {
            addCriterion("class_time <>", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeGreaterThan(Date value) {
            addCriterion("class_time >", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("class_time >=", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeLessThan(Date value) {
            addCriterion("class_time <", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeLessThanOrEqualTo(Date value) {
            addCriterion("class_time <=", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeIn(List<Date> values) {
            addCriterion("class_time in", values, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotIn(List<Date> values) {
            addCriterion("class_time not in", values, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeBetween(Date value1, Date value2) {
            addCriterion("class_time between", value1, value2, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotBetween(Date value1, Date value2) {
            addCriterion("class_time not between", value1, value2, "class_time");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdIsNull() {
            addCriterion("teacherInfoId is null");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdIsNotNull() {
            addCriterion("teacherInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdEqualTo(Integer value) {
            addCriterion("teacherInfoId =", value, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdNotEqualTo(Integer value) {
            addCriterion("teacherInfoId <>", value, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdGreaterThan(Integer value) {
            addCriterion("teacherInfoId >", value, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherInfoId >=", value, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdLessThan(Integer value) {
            addCriterion("teacherInfoId <", value, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacherInfoId <=", value, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdIn(List<Integer> values) {
            addCriterion("teacherInfoId in", values, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdNotIn(List<Integer> values) {
            addCriterion("teacherInfoId not in", values, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("teacherInfoId between", value1, value2, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andTeacherInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherInfoId not between", value1, value2, "teacherInfoId");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("credit like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("credit not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroomId is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroomId is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Integer value) {
            addCriterion("classroomId =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Integer value) {
            addCriterion("classroomId <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Integer value) {
            addCriterion("classroomId >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroomId >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Integer value) {
            addCriterion("classroomId <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("classroomId <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Integer> values) {
            addCriterion("classroomId in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Integer> values) {
            addCriterion("classroomId not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Integer value1, Integer value2) {
            addCriterion("classroomId between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classroomId not between", value1, value2, "classroomId");
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

        public Criteria andTeaching_statusIsNull() {
            addCriterion("teaching_status is null");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusIsNotNull() {
            addCriterion("teaching_status is not null");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusEqualTo(String value) {
            addCriterion("teaching_status =", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusNotEqualTo(String value) {
            addCriterion("teaching_status <>", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusGreaterThan(String value) {
            addCriterion("teaching_status >", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_status >=", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusLessThan(String value) {
            addCriterion("teaching_status <", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusLessThanOrEqualTo(String value) {
            addCriterion("teaching_status <=", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusLike(String value) {
            addCriterion("teaching_status like", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusNotLike(String value) {
            addCriterion("teaching_status not like", value, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusIn(List<String> values) {
            addCriterion("teaching_status in", values, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusNotIn(List<String> values) {
            addCriterion("teaching_status not in", values, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusBetween(String value1, String value2) {
            addCriterion("teaching_status between", value1, value2, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andTeaching_statusNotBetween(String value1, String value2) {
            addCriterion("teaching_status not between", value1, value2, "teaching_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSend_statusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSend_statusEqualTo(String value) {
            addCriterion("send_status =", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusNotEqualTo(String value) {
            addCriterion("send_status <>", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusGreaterThan(String value) {
            addCriterion("send_status >", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusGreaterThanOrEqualTo(String value) {
            addCriterion("send_status >=", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusLessThan(String value) {
            addCriterion("send_status <", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusLessThanOrEqualTo(String value) {
            addCriterion("send_status <=", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusLike(String value) {
            addCriterion("send_status like", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusNotLike(String value) {
            addCriterion("send_status not like", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusIn(List<String> values) {
            addCriterion("send_status in", values, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusNotIn(List<String> values) {
            addCriterion("send_status not in", values, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusBetween(String value1, String value2) {
            addCriterion("send_status between", value1, value2, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusNotBetween(String value1, String value2) {
            addCriterion("send_status not between", value1, value2, "send_status");
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