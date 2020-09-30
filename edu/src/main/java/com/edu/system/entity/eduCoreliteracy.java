package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_coreliteracy
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduCoreliteracy implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String coreliteracy_name;

    /**
     * 
     */
    private String score;

    /**
     * 
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoreliteracy_name() {
        return coreliteracy_name;
    }

    public void setCoreliteracy_name(String coreliteracy_name) {
        this.coreliteracy_name = coreliteracy_name == null ? null : coreliteracy_name.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        eduCoreliteracy other = (eduCoreliteracy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCoreliteracy_name() == null ? other.getCoreliteracy_name() == null : this.getCoreliteracy_name().equals(other.getCoreliteracy_name()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCoreliteracy_name() == null) ? 0 : getCoreliteracy_name().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coreliteracy_name=").append(coreliteracy_name);
        sb.append(", score=").append(score);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}