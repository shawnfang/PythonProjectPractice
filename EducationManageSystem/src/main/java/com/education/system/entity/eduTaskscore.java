package com.education.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_taskscore
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduTaskscore implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer taskAndstuId;

    /**
     * 
     */
    private String t_suggest;

    /**
     * 
     */
    private String t_score;

    /**
     * 
     */
    private String task_suggest;

    /**
     * 
     */
    private String task_score;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskAndstuId() {
        return taskAndstuId;
    }

    public void setTaskAndstuId(Integer taskAndstuId) {
        this.taskAndstuId = taskAndstuId;
    }

    public String getT_suggest() {
        return t_suggest;
    }

    public void setT_suggest(String t_suggest) {
        this.t_suggest = t_suggest == null ? null : t_suggest.trim();
    }

    public String getT_score() {
        return t_score;
    }

    public void setT_score(String t_score) {
        this.t_score = t_score == null ? null : t_score.trim();
    }

    public String getTask_suggest() {
        return task_suggest;
    }

    public void setTask_suggest(String task_suggest) {
        this.task_suggest = task_suggest == null ? null : task_suggest.trim();
    }

    public String getTask_score() {
        return task_score;
    }

    public void setTask_score(String task_score) {
        this.task_score = task_score == null ? null : task_score.trim();
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
        eduTaskscore other = (eduTaskscore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskAndstuId() == null ? other.getTaskAndstuId() == null : this.getTaskAndstuId().equals(other.getTaskAndstuId()))
            && (this.getT_suggest() == null ? other.getT_suggest() == null : this.getT_suggest().equals(other.getT_suggest()))
            && (this.getT_score() == null ? other.getT_score() == null : this.getT_score().equals(other.getT_score()))
            && (this.getTask_suggest() == null ? other.getTask_suggest() == null : this.getTask_suggest().equals(other.getTask_suggest()))
            && (this.getTask_score() == null ? other.getTask_score() == null : this.getTask_score().equals(other.getTask_score()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskAndstuId() == null) ? 0 : getTaskAndstuId().hashCode());
        result = prime * result + ((getT_suggest() == null) ? 0 : getT_suggest().hashCode());
        result = prime * result + ((getT_score() == null) ? 0 : getT_score().hashCode());
        result = prime * result + ((getTask_suggest() == null) ? 0 : getTask_suggest().hashCode());
        result = prime * result + ((getTask_score() == null) ? 0 : getTask_score().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskAndstuId=").append(taskAndstuId);
        sb.append(", t_suggest=").append(t_suggest);
        sb.append(", t_score=").append(t_score);
        sb.append(", task_suggest=").append(task_suggest);
        sb.append(", task_score=").append(task_score);
        sb.append("]");
        return sb.toString();
    }
}