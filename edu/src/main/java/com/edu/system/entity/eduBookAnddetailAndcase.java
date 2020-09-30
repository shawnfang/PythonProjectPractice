package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_bookAnddetailAndcase
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduBookAnddetailAndcase implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer textbookId;

    /**
     * 
     */
    private Integer textbookdetailId;

    /**
     * 
     */
    private Integer textbookcaseId;

    /**
     * 
     */
    private Integer courseId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(Integer textbookId) {
        this.textbookId = textbookId;
    }

    public Integer getTextbookdetailId() {
        return textbookdetailId;
    }

    public void setTextbookdetailId(Integer textbookdetailId) {
        this.textbookdetailId = textbookdetailId;
    }

    public Integer getTextbookcaseId() {
        return textbookcaseId;
    }

    public void setTextbookcaseId(Integer textbookcaseId) {
        this.textbookcaseId = textbookcaseId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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
        eduBookAnddetailAndcase other = (eduBookAnddetailAndcase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTextbookId() == null ? other.getTextbookId() == null : this.getTextbookId().equals(other.getTextbookId()))
            && (this.getTextbookdetailId() == null ? other.getTextbookdetailId() == null : this.getTextbookdetailId().equals(other.getTextbookdetailId()))
            && (this.getTextbookcaseId() == null ? other.getTextbookcaseId() == null : this.getTextbookcaseId().equals(other.getTextbookcaseId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTextbookId() == null) ? 0 : getTextbookId().hashCode());
        result = prime * result + ((getTextbookdetailId() == null) ? 0 : getTextbookdetailId().hashCode());
        result = prime * result + ((getTextbookcaseId() == null) ? 0 : getTextbookcaseId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", textbookId=").append(textbookId);
        sb.append(", textbookdetailId=").append(textbookdetailId);
        sb.append(", textbookcaseId=").append(textbookcaseId);
        sb.append(", courseId=").append(courseId);
        sb.append("]");
        return sb.toString();
    }
}