package com.edu.system.entity;

import java.util.ArrayList;
import java.util.List;

public class eduTaskdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public eduTaskdetailExample() {
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

        public Criteria andCourse_nameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_nameEqualTo(String value) {
            addCriterion("course_name =", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameGreaterThan(String value) {
            addCriterion("course_name >", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLessThan(String value) {
            addCriterion("course_name <", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLike(String value) {
            addCriterion("course_name like", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotLike(String value) {
            addCriterion("course_name not like", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIn(List<String> values) {
            addCriterion("course_name in", values, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "course_name");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientIsNull() {
            addCriterion("coreliteracycoefficient is null");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientIsNotNull() {
            addCriterion("coreliteracycoefficient is not null");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientEqualTo(String value) {
            addCriterion("coreliteracycoefficient =", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientNotEqualTo(String value) {
            addCriterion("coreliteracycoefficient <>", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientGreaterThan(String value) {
            addCriterion("coreliteracycoefficient >", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientGreaterThanOrEqualTo(String value) {
            addCriterion("coreliteracycoefficient >=", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientLessThan(String value) {
            addCriterion("coreliteracycoefficient <", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientLessThanOrEqualTo(String value) {
            addCriterion("coreliteracycoefficient <=", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientLike(String value) {
            addCriterion("coreliteracycoefficient like", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientNotLike(String value) {
            addCriterion("coreliteracycoefficient not like", value, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientIn(List<String> values) {
            addCriterion("coreliteracycoefficient in", values, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientNotIn(List<String> values) {
            addCriterion("coreliteracycoefficient not in", values, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientBetween(String value1, String value2) {
            addCriterion("coreliteracycoefficient between", value1, value2, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andCoreliteracycoefficientNotBetween(String value1, String value2) {
            addCriterion("coreliteracycoefficient not between", value1, value2, "coreliteracycoefficient");
            return (Criteria) this;
        }

        public Criteria andSchoolhourIsNull() {
            addCriterion("schoolhour is null");
            return (Criteria) this;
        }

        public Criteria andSchoolhourIsNotNull() {
            addCriterion("schoolhour is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolhourEqualTo(Integer value) {
            addCriterion("schoolhour =", value, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourNotEqualTo(Integer value) {
            addCriterion("schoolhour <>", value, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourGreaterThan(Integer value) {
            addCriterion("schoolhour >", value, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolhour >=", value, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourLessThan(Integer value) {
            addCriterion("schoolhour <", value, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourLessThanOrEqualTo(Integer value) {
            addCriterion("schoolhour <=", value, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourIn(List<Integer> values) {
            addCriterion("schoolhour in", values, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourNotIn(List<Integer> values) {
            addCriterion("schoolhour not in", values, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourBetween(Integer value1, Integer value2) {
            addCriterion("schoolhour between", value1, value2, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andSchoolhourNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolhour not between", value1, value2, "schoolhour");
            return (Criteria) this;
        }

        public Criteria andCourse_themeIsNull() {
            addCriterion("course_theme is null");
            return (Criteria) this;
        }

        public Criteria andCourse_themeIsNotNull() {
            addCriterion("course_theme is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_themeEqualTo(String value) {
            addCriterion("course_theme =", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeNotEqualTo(String value) {
            addCriterion("course_theme <>", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeGreaterThan(String value) {
            addCriterion("course_theme >", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeGreaterThanOrEqualTo(String value) {
            addCriterion("course_theme >=", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeLessThan(String value) {
            addCriterion("course_theme <", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeLessThanOrEqualTo(String value) {
            addCriterion("course_theme <=", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeLike(String value) {
            addCriterion("course_theme like", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeNotLike(String value) {
            addCriterion("course_theme not like", value, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeIn(List<String> values) {
            addCriterion("course_theme in", values, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeNotIn(List<String> values) {
            addCriterion("course_theme not in", values, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeBetween(String value1, String value2) {
            addCriterion("course_theme between", value1, value2, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_themeNotBetween(String value1, String value2) {
            addCriterion("course_theme not between", value1, value2, "course_theme");
            return (Criteria) this;
        }

        public Criteria andCourse_contentIsNull() {
            addCriterion("course_content is null");
            return (Criteria) this;
        }

        public Criteria andCourse_contentIsNotNull() {
            addCriterion("course_content is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_contentEqualTo(String value) {
            addCriterion("course_content =", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentNotEqualTo(String value) {
            addCriterion("course_content <>", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentGreaterThan(String value) {
            addCriterion("course_content >", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentGreaterThanOrEqualTo(String value) {
            addCriterion("course_content >=", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentLessThan(String value) {
            addCriterion("course_content <", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentLessThanOrEqualTo(String value) {
            addCriterion("course_content <=", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentLike(String value) {
            addCriterion("course_content like", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentNotLike(String value) {
            addCriterion("course_content not like", value, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentIn(List<String> values) {
            addCriterion("course_content in", values, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentNotIn(List<String> values) {
            addCriterion("course_content not in", values, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentBetween(String value1, String value2) {
            addCriterion("course_content between", value1, value2, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_contentNotBetween(String value1, String value2) {
            addCriterion("course_content not between", value1, value2, "course_content");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleIsNull() {
            addCriterion("course_module is null");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleIsNotNull() {
            addCriterion("course_module is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleEqualTo(String value) {
            addCriterion("course_module =", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleNotEqualTo(String value) {
            addCriterion("course_module <>", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleGreaterThan(String value) {
            addCriterion("course_module >", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleGreaterThanOrEqualTo(String value) {
            addCriterion("course_module >=", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleLessThan(String value) {
            addCriterion("course_module <", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleLessThanOrEqualTo(String value) {
            addCriterion("course_module <=", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleLike(String value) {
            addCriterion("course_module like", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleNotLike(String value) {
            addCriterion("course_module not like", value, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleIn(List<String> values) {
            addCriterion("course_module in", values, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleNotIn(List<String> values) {
            addCriterion("course_module not in", values, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleBetween(String value1, String value2) {
            addCriterion("course_module between", value1, value2, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_moduleNotBetween(String value1, String value2) {
            addCriterion("course_module not between", value1, value2, "course_module");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesIsNull() {
            addCriterion("course_scenes is null");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesIsNotNull() {
            addCriterion("course_scenes is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesEqualTo(String value) {
            addCriterion("course_scenes =", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesNotEqualTo(String value) {
            addCriterion("course_scenes <>", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesGreaterThan(String value) {
            addCriterion("course_scenes >", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesGreaterThanOrEqualTo(String value) {
            addCriterion("course_scenes >=", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesLessThan(String value) {
            addCriterion("course_scenes <", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesLessThanOrEqualTo(String value) {
            addCriterion("course_scenes <=", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesLike(String value) {
            addCriterion("course_scenes like", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesNotLike(String value) {
            addCriterion("course_scenes not like", value, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesIn(List<String> values) {
            addCriterion("course_scenes in", values, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesNotIn(List<String> values) {
            addCriterion("course_scenes not in", values, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesBetween(String value1, String value2) {
            addCriterion("course_scenes between", value1, value2, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_scenesNotBetween(String value1, String value2) {
            addCriterion("course_scenes not between", value1, value2, "course_scenes");
            return (Criteria) this;
        }

        public Criteria andCourse_taskIsNull() {
            addCriterion("course_task is null");
            return (Criteria) this;
        }

        public Criteria andCourse_taskIsNotNull() {
            addCriterion("course_task is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_taskEqualTo(String value) {
            addCriterion("course_task =", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskNotEqualTo(String value) {
            addCriterion("course_task <>", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskGreaterThan(String value) {
            addCriterion("course_task >", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskGreaterThanOrEqualTo(String value) {
            addCriterion("course_task >=", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskLessThan(String value) {
            addCriterion("course_task <", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskLessThanOrEqualTo(String value) {
            addCriterion("course_task <=", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskLike(String value) {
            addCriterion("course_task like", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskNotLike(String value) {
            addCriterion("course_task not like", value, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskIn(List<String> values) {
            addCriterion("course_task in", values, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskNotIn(List<String> values) {
            addCriterion("course_task not in", values, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskBetween(String value1, String value2) {
            addCriterion("course_task between", value1, value2, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_taskNotBetween(String value1, String value2) {
            addCriterion("course_task not between", value1, value2, "course_task");
            return (Criteria) this;
        }

        public Criteria andCourse_typeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourse_typeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_typeEqualTo(String value) {
            addCriterion("course_type =", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeNotEqualTo(String value) {
            addCriterion("course_type <>", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeGreaterThan(String value) {
            addCriterion("course_type >", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeGreaterThanOrEqualTo(String value) {
            addCriterion("course_type >=", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeLessThan(String value) {
            addCriterion("course_type <", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeLessThanOrEqualTo(String value) {
            addCriterion("course_type <=", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeLike(String value) {
            addCriterion("course_type like", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeNotLike(String value) {
            addCriterion("course_type not like", value, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeIn(List<String> values) {
            addCriterion("course_type in", values, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeNotIn(List<String> values) {
            addCriterion("course_type not in", values, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeBetween(String value1, String value2) {
            addCriterion("course_type between", value1, value2, "course_type");
            return (Criteria) this;
        }

        public Criteria andCourse_typeNotBetween(String value1, String value2) {
            addCriterion("course_type not between", value1, value2, "course_type");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidIsNull() {
            addCriterion("coreliteracyid is null");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidIsNotNull() {
            addCriterion("coreliteracyid is not null");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidEqualTo(Integer value) {
            addCriterion("coreliteracyid =", value, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidNotEqualTo(Integer value) {
            addCriterion("coreliteracyid <>", value, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidGreaterThan(Integer value) {
            addCriterion("coreliteracyid >", value, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coreliteracyid >=", value, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidLessThan(Integer value) {
            addCriterion("coreliteracyid <", value, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidLessThanOrEqualTo(Integer value) {
            addCriterion("coreliteracyid <=", value, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidIn(List<Integer> values) {
            addCriterion("coreliteracyid in", values, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidNotIn(List<Integer> values) {
            addCriterion("coreliteracyid not in", values, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidBetween(Integer value1, Integer value2) {
            addCriterion("coreliteracyid between", value1, value2, "coreliteracyid");
            return (Criteria) this;
        }

        public Criteria andCoreliteracyidNotBetween(Integer value1, Integer value2) {
            addCriterion("coreliteracyid not between", value1, value2, "coreliteracyid");
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

        public Criteria andTextbookNameIsNull() {
            addCriterion("textbookName is null");
            return (Criteria) this;
        }

        public Criteria andTextbookNameIsNotNull() {
            addCriterion("textbookName is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookNameEqualTo(String value) {
            addCriterion("textbookName =", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotEqualTo(String value) {
            addCriterion("textbookName <>", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameGreaterThan(String value) {
            addCriterion("textbookName >", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameGreaterThanOrEqualTo(String value) {
            addCriterion("textbookName >=", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameLessThan(String value) {
            addCriterion("textbookName <", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameLessThanOrEqualTo(String value) {
            addCriterion("textbookName <=", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameLike(String value) {
            addCriterion("textbookName like", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotLike(String value) {
            addCriterion("textbookName not like", value, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameIn(List<String> values) {
            addCriterion("textbookName in", values, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotIn(List<String> values) {
            addCriterion("textbookName not in", values, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameBetween(String value1, String value2) {
            addCriterion("textbookName between", value1, value2, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookNameNotBetween(String value1, String value2) {
            addCriterion("textbookName not between", value1, value2, "textbookName");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeIsNull() {
            addCriterion("textbookType is null");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeIsNotNull() {
            addCriterion("textbookType is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeEqualTo(String value) {
            addCriterion("textbookType =", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeNotEqualTo(String value) {
            addCriterion("textbookType <>", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeGreaterThan(String value) {
            addCriterion("textbookType >", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeGreaterThanOrEqualTo(String value) {
            addCriterion("textbookType >=", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeLessThan(String value) {
            addCriterion("textbookType <", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeLessThanOrEqualTo(String value) {
            addCriterion("textbookType <=", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeLike(String value) {
            addCriterion("textbookType like", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeNotLike(String value) {
            addCriterion("textbookType not like", value, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeIn(List<String> values) {
            addCriterion("textbookType in", values, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeNotIn(List<String> values) {
            addCriterion("textbookType not in", values, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeBetween(String value1, String value2) {
            addCriterion("textbookType between", value1, value2, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookTypeNotBetween(String value1, String value2) {
            addCriterion("textbookType not between", value1, value2, "textbookType");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdIsNull() {
            addCriterion("textbookDtailId is null");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdIsNotNull() {
            addCriterion("textbookDtailId is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdEqualTo(String value) {
            addCriterion("textbookDtailId =", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdNotEqualTo(String value) {
            addCriterion("textbookDtailId <>", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdGreaterThan(String value) {
            addCriterion("textbookDtailId >", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdGreaterThanOrEqualTo(String value) {
            addCriterion("textbookDtailId >=", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdLessThan(String value) {
            addCriterion("textbookDtailId <", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdLessThanOrEqualTo(String value) {
            addCriterion("textbookDtailId <=", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdLike(String value) {
            addCriterion("textbookDtailId like", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdNotLike(String value) {
            addCriterion("textbookDtailId not like", value, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdIn(List<String> values) {
            addCriterion("textbookDtailId in", values, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdNotIn(List<String> values) {
            addCriterion("textbookDtailId not in", values, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdBetween(String value1, String value2) {
            addCriterion("textbookDtailId between", value1, value2, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andTextbookDtailIdNotBetween(String value1, String value2) {
            addCriterion("textbookDtailId not between", value1, value2, "textbookDtailId");
            return (Criteria) this;
        }

        public Criteria andDetailChapterIsNull() {
            addCriterion("detailChapter is null");
            return (Criteria) this;
        }

        public Criteria andDetailChapterIsNotNull() {
            addCriterion("detailChapter is not null");
            return (Criteria) this;
        }

        public Criteria andDetailChapterEqualTo(String value) {
            addCriterion("detailChapter =", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterNotEqualTo(String value) {
            addCriterion("detailChapter <>", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterGreaterThan(String value) {
            addCriterion("detailChapter >", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterGreaterThanOrEqualTo(String value) {
            addCriterion("detailChapter >=", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterLessThan(String value) {
            addCriterion("detailChapter <", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterLessThanOrEqualTo(String value) {
            addCriterion("detailChapter <=", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterLike(String value) {
            addCriterion("detailChapter like", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterNotLike(String value) {
            addCriterion("detailChapter not like", value, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterIn(List<String> values) {
            addCriterion("detailChapter in", values, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterNotIn(List<String> values) {
            addCriterion("detailChapter not in", values, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterBetween(String value1, String value2) {
            addCriterion("detailChapter between", value1, value2, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailChapterNotBetween(String value1, String value2) {
            addCriterion("detailChapter not between", value1, value2, "detailChapter");
            return (Criteria) this;
        }

        public Criteria andDetailSectionIsNull() {
            addCriterion("detailSection is null");
            return (Criteria) this;
        }

        public Criteria andDetailSectionIsNotNull() {
            addCriterion("detailSection is not null");
            return (Criteria) this;
        }

        public Criteria andDetailSectionEqualTo(String value) {
            addCriterion("detailSection =", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionNotEqualTo(String value) {
            addCriterion("detailSection <>", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionGreaterThan(String value) {
            addCriterion("detailSection >", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionGreaterThanOrEqualTo(String value) {
            addCriterion("detailSection >=", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionLessThan(String value) {
            addCriterion("detailSection <", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionLessThanOrEqualTo(String value) {
            addCriterion("detailSection <=", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionLike(String value) {
            addCriterion("detailSection like", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionNotLike(String value) {
            addCriterion("detailSection not like", value, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionIn(List<String> values) {
            addCriterion("detailSection in", values, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionNotIn(List<String> values) {
            addCriterion("detailSection not in", values, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionBetween(String value1, String value2) {
            addCriterion("detailSection between", value1, value2, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailSectionNotBetween(String value1, String value2) {
            addCriterion("detailSection not between", value1, value2, "detailSection");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
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

        public Criteria andCaseThemeIsNull() {
            addCriterion("caseTheme is null");
            return (Criteria) this;
        }

        public Criteria andCaseThemeIsNotNull() {
            addCriterion("caseTheme is not null");
            return (Criteria) this;
        }

        public Criteria andCaseThemeEqualTo(String value) {
            addCriterion("caseTheme =", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeNotEqualTo(String value) {
            addCriterion("caseTheme <>", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeGreaterThan(String value) {
            addCriterion("caseTheme >", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeGreaterThanOrEqualTo(String value) {
            addCriterion("caseTheme >=", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeLessThan(String value) {
            addCriterion("caseTheme <", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeLessThanOrEqualTo(String value) {
            addCriterion("caseTheme <=", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeLike(String value) {
            addCriterion("caseTheme like", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeNotLike(String value) {
            addCriterion("caseTheme not like", value, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeIn(List<String> values) {
            addCriterion("caseTheme in", values, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeNotIn(List<String> values) {
            addCriterion("caseTheme not in", values, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeBetween(String value1, String value2) {
            addCriterion("caseTheme between", value1, value2, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseThemeNotBetween(String value1, String value2) {
            addCriterion("caseTheme not between", value1, value2, "caseTheme");
            return (Criteria) this;
        }

        public Criteria andCaseContentIsNull() {
            addCriterion("caseContent is null");
            return (Criteria) this;
        }

        public Criteria andCaseContentIsNotNull() {
            addCriterion("caseContent is not null");
            return (Criteria) this;
        }

        public Criteria andCaseContentEqualTo(String value) {
            addCriterion("caseContent =", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentNotEqualTo(String value) {
            addCriterion("caseContent <>", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentGreaterThan(String value) {
            addCriterion("caseContent >", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentGreaterThanOrEqualTo(String value) {
            addCriterion("caseContent >=", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentLessThan(String value) {
            addCriterion("caseContent <", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentLessThanOrEqualTo(String value) {
            addCriterion("caseContent <=", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentLike(String value) {
            addCriterion("caseContent like", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentNotLike(String value) {
            addCriterion("caseContent not like", value, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentIn(List<String> values) {
            addCriterion("caseContent in", values, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentNotIn(List<String> values) {
            addCriterion("caseContent not in", values, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentBetween(String value1, String value2) {
            addCriterion("caseContent between", value1, value2, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseContentNotBetween(String value1, String value2) {
            addCriterion("caseContent not between", value1, value2, "caseContent");
            return (Criteria) this;
        }

        public Criteria andCaseScenesIsNull() {
            addCriterion("caseScenes is null");
            return (Criteria) this;
        }

        public Criteria andCaseScenesIsNotNull() {
            addCriterion("caseScenes is not null");
            return (Criteria) this;
        }

        public Criteria andCaseScenesEqualTo(String value) {
            addCriterion("caseScenes =", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesNotEqualTo(String value) {
            addCriterion("caseScenes <>", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesGreaterThan(String value) {
            addCriterion("caseScenes >", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesGreaterThanOrEqualTo(String value) {
            addCriterion("caseScenes >=", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesLessThan(String value) {
            addCriterion("caseScenes <", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesLessThanOrEqualTo(String value) {
            addCriterion("caseScenes <=", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesLike(String value) {
            addCriterion("caseScenes like", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesNotLike(String value) {
            addCriterion("caseScenes not like", value, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesIn(List<String> values) {
            addCriterion("caseScenes in", values, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesNotIn(List<String> values) {
            addCriterion("caseScenes not in", values, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesBetween(String value1, String value2) {
            addCriterion("caseScenes between", value1, value2, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseScenesNotBetween(String value1, String value2) {
            addCriterion("caseScenes not between", value1, value2, "caseScenes");
            return (Criteria) this;
        }

        public Criteria andCaseTaskIsNull() {
            addCriterion("caseTask is null");
            return (Criteria) this;
        }

        public Criteria andCaseTaskIsNotNull() {
            addCriterion("caseTask is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTaskEqualTo(String value) {
            addCriterion("caseTask =", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskNotEqualTo(String value) {
            addCriterion("caseTask <>", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskGreaterThan(String value) {
            addCriterion("caseTask >", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskGreaterThanOrEqualTo(String value) {
            addCriterion("caseTask >=", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskLessThan(String value) {
            addCriterion("caseTask <", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskLessThanOrEqualTo(String value) {
            addCriterion("caseTask <=", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskLike(String value) {
            addCriterion("caseTask like", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskNotLike(String value) {
            addCriterion("caseTask not like", value, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskIn(List<String> values) {
            addCriterion("caseTask in", values, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskNotIn(List<String> values) {
            addCriterion("caseTask not in", values, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskBetween(String value1, String value2) {
            addCriterion("caseTask between", value1, value2, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseTaskNotBetween(String value1, String value2) {
            addCriterion("caseTask not between", value1, value2, "caseTask");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryIsNull() {
            addCriterion("caseSummary is null");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryIsNotNull() {
            addCriterion("caseSummary is not null");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryEqualTo(String value) {
            addCriterion("caseSummary =", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryNotEqualTo(String value) {
            addCriterion("caseSummary <>", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryGreaterThan(String value) {
            addCriterion("caseSummary >", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("caseSummary >=", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryLessThan(String value) {
            addCriterion("caseSummary <", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryLessThanOrEqualTo(String value) {
            addCriterion("caseSummary <=", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryLike(String value) {
            addCriterion("caseSummary like", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryNotLike(String value) {
            addCriterion("caseSummary not like", value, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryIn(List<String> values) {
            addCriterion("caseSummary in", values, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryNotIn(List<String> values) {
            addCriterion("caseSummary not in", values, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryBetween(String value1, String value2) {
            addCriterion("caseSummary between", value1, value2, "caseSummary");
            return (Criteria) this;
        }

        public Criteria andCaseSummaryNotBetween(String value1, String value2) {
            addCriterion("caseSummary not between", value1, value2, "caseSummary");
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