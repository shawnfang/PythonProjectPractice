package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_courseAndcoreliteracy
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduCourseAndcoreliteracy implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer courseId;

    /**
     * 
     */
    private Integer coreliteracyId;

    /**
     * 
     */
    private String desc;

    /**
     * 
     */
    private String score;

    /**
     * 
     */
    private Integer parentId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCoreliteracyId() {
        return coreliteracyId;
    }

    public void setCoreliteracyId(Integer coreliteracyId) {
        this.coreliteracyId = coreliteracyId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        eduCourseAndcoreliteracy other = (eduCourseAndcoreliteracy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getCoreliteracyId() == null ? other.getCoreliteracyId() == null : this.getCoreliteracyId().equals(other.getCoreliteracyId()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getCoreliteracyId() == null) ? 0 : getCoreliteracyId().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", coreliteracyId=").append(coreliteracyId);
        sb.append(", desc=").append(desc);
        sb.append(", score=").append(score);
        sb.append(", parentId=").append(parentId);
        sb.append("]");
        return sb.toString();
    }
}