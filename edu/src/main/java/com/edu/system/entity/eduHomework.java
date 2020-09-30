package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_homework
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduHomework implements Serializable {
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
    private String status;

    /**
     * 
     */
    private String excellentHomework;

    /**
     * 作业内容，json格式
     */
    private String content;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getExcellentHomework() {
        return excellentHomework;
    }

    public void setExcellentHomework(String excellentHomework) {
        this.excellentHomework = excellentHomework == null ? null : excellentHomework.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        eduHomework other = (eduHomework) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskAndstuId() == null ? other.getTaskAndstuId() == null : this.getTaskAndstuId().equals(other.getTaskAndstuId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getExcellentHomework() == null ? other.getExcellentHomework() == null : this.getExcellentHomework().equals(other.getExcellentHomework()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskAndstuId() == null) ? 0 : getTaskAndstuId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getExcellentHomework() == null) ? 0 : getExcellentHomework().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
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
        sb.append(", status=").append(status);
        sb.append(", excellentHomework=").append(excellentHomework);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}