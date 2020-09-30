package com.edu.system.entity;

import java.util.ArrayList;
import java.util.List;

public class eduTeacherInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduTeacherInfoExample() {
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

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacherName =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacherName <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacherName like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacherName not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacherName in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNull() {
            addCriterion("teacherSex is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNotNull() {
            addCriterion("teacherSex is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexEqualTo(Integer value) {
            addCriterion("teacherSex =", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotEqualTo(Integer value) {
            addCriterion("teacherSex <>", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThan(Integer value) {
            addCriterion("teacherSex >", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherSex >=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThan(Integer value) {
            addCriterion("teacherSex <", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThanOrEqualTo(Integer value) {
            addCriterion("teacherSex <=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIn(List<Integer> values) {
            addCriterion("teacherSex in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotIn(List<Integer> values) {
            addCriterion("teacherSex not in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexBetween(Integer value1, Integer value2) {
            addCriterion("teacherSex between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherSex not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelIsNull() {
            addCriterion("teacherLevel is null");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelIsNotNull() {
            addCriterion("teacherLevel is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelEqualTo(Integer value) {
            addCriterion("teacherLevel =", value, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelNotEqualTo(Integer value) {
            addCriterion("teacherLevel <>", value, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelGreaterThan(Integer value) {
            addCriterion("teacherLevel >", value, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherLevel >=", value, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelLessThan(Integer value) {
            addCriterion("teacherLevel <", value, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelLessThanOrEqualTo(Integer value) {
            addCriterion("teacherLevel <=", value, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelIn(List<Integer> values) {
            addCriterion("teacherLevel in", values, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelNotIn(List<Integer> values) {
            addCriterion("teacherLevel not in", values, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelBetween(Integer value1, Integer value2) {
            addCriterion("teacherLevel between", value1, value2, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherLevel not between", value1, value2, "teacherLevel");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIsNull() {
            addCriterion("teacherCourse is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIsNotNull() {
            addCriterion("teacherCourse is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseEqualTo(String value) {
            addCriterion("teacherCourse =", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotEqualTo(String value) {
            addCriterion("teacherCourse <>", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseGreaterThan(String value) {
            addCriterion("teacherCourse >", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseGreaterThanOrEqualTo(String value) {
            addCriterion("teacherCourse >=", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseLessThan(String value) {
            addCriterion("teacherCourse <", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseLessThanOrEqualTo(String value) {
            addCriterion("teacherCourse <=", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseLike(String value) {
            addCriterion("teacherCourse like", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotLike(String value) {
            addCriterion("teacherCourse not like", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIn(List<String> values) {
            addCriterion("teacherCourse in", values, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotIn(List<String> values) {
            addCriterion("teacherCourse not in", values, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseBetween(String value1, String value2) {
            addCriterion("teacherCourse between", value1, value2, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotBetween(String value1, String value2) {
            addCriterion("teacherCourse not between", value1, value2, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseIsNull() {
            addCriterion("teacherDevCourse is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseIsNotNull() {
            addCriterion("teacherDevCourse is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseEqualTo(String value) {
            addCriterion("teacherDevCourse =", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseNotEqualTo(String value) {
            addCriterion("teacherDevCourse <>", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseGreaterThan(String value) {
            addCriterion("teacherDevCourse >", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseGreaterThanOrEqualTo(String value) {
            addCriterion("teacherDevCourse >=", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseLessThan(String value) {
            addCriterion("teacherDevCourse <", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseLessThanOrEqualTo(String value) {
            addCriterion("teacherDevCourse <=", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseLike(String value) {
            addCriterion("teacherDevCourse like", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseNotLike(String value) {
            addCriterion("teacherDevCourse not like", value, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseIn(List<String> values) {
            addCriterion("teacherDevCourse in", values, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseNotIn(List<String> values) {
            addCriterion("teacherDevCourse not in", values, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseBetween(String value1, String value2) {
            addCriterion("teacherDevCourse between", value1, value2, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherDevCourseNotBetween(String value1, String value2) {
            addCriterion("teacherDevCourse not between", value1, value2, "teacherDevCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("teacherPhone is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("teacherPhone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("teacherPhone =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("teacherPhone <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("teacherPhone >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("teacherPhone >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("teacherPhone <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("teacherPhone <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("teacherPhone like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("teacherPhone not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("teacherPhone in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("teacherPhone not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("teacherPhone between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("teacherPhone not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleIsNull() {
            addCriterion("teacherRole is null");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleIsNotNull() {
            addCriterion("teacherRole is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleEqualTo(String value) {
            addCriterion("teacherRole =", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleNotEqualTo(String value) {
            addCriterion("teacherRole <>", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleGreaterThan(String value) {
            addCriterion("teacherRole >", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleGreaterThanOrEqualTo(String value) {
            addCriterion("teacherRole >=", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleLessThan(String value) {
            addCriterion("teacherRole <", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleLessThanOrEqualTo(String value) {
            addCriterion("teacherRole <=", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleLike(String value) {
            addCriterion("teacherRole like", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleNotLike(String value) {
            addCriterion("teacherRole not like", value, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleIn(List<String> values) {
            addCriterion("teacherRole in", values, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleNotIn(List<String> values) {
            addCriterion("teacherRole not in", values, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleBetween(String value1, String value2) {
            addCriterion("teacherRole between", value1, value2, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andTeacherRoleNotBetween(String value1, String value2) {
            addCriterion("teacherRole not between", value1, value2, "teacherRole");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("accountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("accountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("accountId =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("accountId <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("accountId >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accountId >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("accountId <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("accountId <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("accountId in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("accountId not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("accountId between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accountId not between", value1, value2, "accountId");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("schoolId is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("schoolId is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("schoolId =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("schoolId <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("schoolId >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolId >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("schoolId <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("schoolId <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("schoolId in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("schoolId not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("schoolId between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolId not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("roleId <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleId");
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