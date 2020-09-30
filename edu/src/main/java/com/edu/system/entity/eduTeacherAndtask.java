package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_teacherAndtask
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduTeacherAndtask implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer taskId;

    /**
     * 
     */
    private Integer taskAndstuId;

    /**
     * 
     */
    private String hasHomework;

    /**
     * 
     */
    private String hasScore;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskAndstuId() {
        return taskAndstuId;
    }

    public void setTaskAndstuId(Integer taskAndstuId) {
        this.taskAndstuId = taskAndstuId;
    }

    public String getHasHomework() {
        return hasHomework;
    }

    public void setHasHomework(String hasHomework) {
        this.hasHomework = hasHomework == null ? null : hasHomework.trim();
    }

    public String getHasScore() {
        return hasScore;
    }

    public void setHasScore(String hasScore) {
        this.hasScore = hasScore == null ? null : hasScore.trim();
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
        eduTeacherAndtask other = (eduTeacherAndtask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskAndstuId() == null ? other.getTaskAndstuId() == null : this.getTaskAndstuId().equals(other.getTaskAndstuId()))
            && (this.getHasHomework() == null ? other.getHasHomework() == null : this.getHasHomework().equals(other.getHasHomework()))
            && (this.getHasScore() == null ? other.getHasScore() == null : this.getHasScore().equals(other.getHasScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskAndstuId() == null) ? 0 : getTaskAndstuId().hashCode());
        result = prime * result + ((getHasHomework() == null) ? 0 : getHasHomework().hashCode());
        result = prime * result + ((getHasScore() == null) ? 0 : getHasScore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskId=").append(taskId);
        sb.append(", taskAndstuId=").append(taskAndstuId);
        sb.append(", hasHomework=").append(hasHomework);
        sb.append(", hasScore=").append(hasScore);
        sb.append("]");
        return sb.toString();
    }
}