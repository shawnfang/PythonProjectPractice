package com.education.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_taskAndstu
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduTaskAndstu implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer stuAndclassId;

    /**
     * 
     */
    private Integer taskId;

    /**
     * 
     */
    private String stu_divisionofwork;

    /**
     * 分组
     */
    private String group;

    /**
     * 
     */
    private String capital;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuAndclassId() {
        return stuAndclassId;
    }

    public void setStuAndclassId(Integer stuAndclassId) {
        this.stuAndclassId = stuAndclassId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getStu_divisionofwork() {
        return stu_divisionofwork;
    }

    public void setStu_divisionofwork(String stu_divisionofwork) {
        this.stu_divisionofwork = stu_divisionofwork == null ? null : stu_divisionofwork.trim();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital == null ? null : capital.trim();
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
        eduTaskAndstu other = (eduTaskAndstu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStuAndclassId() == null ? other.getStuAndclassId() == null : this.getStuAndclassId().equals(other.getStuAndclassId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getStu_divisionofwork() == null ? other.getStu_divisionofwork() == null : this.getStu_divisionofwork().equals(other.getStu_divisionofwork()))
            && (this.getGroup() == null ? other.getGroup() == null : this.getGroup().equals(other.getGroup()))
            && (this.getCapital() == null ? other.getCapital() == null : this.getCapital().equals(other.getCapital()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStuAndclassId() == null) ? 0 : getStuAndclassId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getStu_divisionofwork() == null) ? 0 : getStu_divisionofwork().hashCode());
        result = prime * result + ((getGroup() == null) ? 0 : getGroup().hashCode());
        result = prime * result + ((getCapital() == null) ? 0 : getCapital().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuAndclassId=").append(stuAndclassId);
        sb.append(", taskId=").append(taskId);
        sb.append(", stu_divisionofwork=").append(stu_divisionofwork);
        sb.append(", group=").append(group);
        sb.append(", capital=").append(capital);
        sb.append("]");
        return sb.toString();
    }
}