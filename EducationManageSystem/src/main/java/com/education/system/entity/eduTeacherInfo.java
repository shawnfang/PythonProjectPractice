package com.education.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_teacherInfo
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduTeacherInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 老师名字
     */
    private String teacherName;

    /**
     * 性别
     */
    private Integer teacherSex;

    /**
     * 职称
     */
    private Integer teacherLevel;

    /**
     * 课程
     */
    private String teacherCourse;

    /**
     * 开发课程
     */
    private String teacherDevCourse;

    /**
     * 联系方式
     */
    private String teacherPhone;

    /**
     * 角色
     */
    private String teacherRole;

    /**
     * 账号id
     */
    private Integer accountId;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 角色id
     */
    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(Integer teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getTeacherLevel() {
        return teacherLevel;
    }

    public void setTeacherLevel(Integer teacherLevel) {
        this.teacherLevel = teacherLevel;
    }

    public String getTeacherCourse() {
        return teacherCourse;
    }

    public void setTeacherCourse(String teacherCourse) {
        this.teacherCourse = teacherCourse == null ? null : teacherCourse.trim();
    }

    public String getTeacherDevCourse() {
        return teacherDevCourse;
    }

    public void setTeacherDevCourse(String teacherDevCourse) {
        this.teacherDevCourse = teacherDevCourse == null ? null : teacherDevCourse.trim();
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone == null ? null : teacherPhone.trim();
    }

    public String getTeacherRole() {
        return teacherRole;
    }

    public void setTeacherRole(String teacherRole) {
        this.teacherRole = teacherRole == null ? null : teacherRole.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        eduTeacherInfo other = (eduTeacherInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherName() == null ? other.getTeacherName() == null : this.getTeacherName().equals(other.getTeacherName()))
            && (this.getTeacherSex() == null ? other.getTeacherSex() == null : this.getTeacherSex().equals(other.getTeacherSex()))
            && (this.getTeacherLevel() == null ? other.getTeacherLevel() == null : this.getTeacherLevel().equals(other.getTeacherLevel()))
            && (this.getTeacherCourse() == null ? other.getTeacherCourse() == null : this.getTeacherCourse().equals(other.getTeacherCourse()))
            && (this.getTeacherDevCourse() == null ? other.getTeacherDevCourse() == null : this.getTeacherDevCourse().equals(other.getTeacherDevCourse()))
            && (this.getTeacherPhone() == null ? other.getTeacherPhone() == null : this.getTeacherPhone().equals(other.getTeacherPhone()))
            && (this.getTeacherRole() == null ? other.getTeacherRole() == null : this.getTeacherRole().equals(other.getTeacherRole()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherName() == null) ? 0 : getTeacherName().hashCode());
        result = prime * result + ((getTeacherSex() == null) ? 0 : getTeacherSex().hashCode());
        result = prime * result + ((getTeacherLevel() == null) ? 0 : getTeacherLevel().hashCode());
        result = prime * result + ((getTeacherCourse() == null) ? 0 : getTeacherCourse().hashCode());
        result = prime * result + ((getTeacherDevCourse() == null) ? 0 : getTeacherDevCourse().hashCode());
        result = prime * result + ((getTeacherPhone() == null) ? 0 : getTeacherPhone().hashCode());
        result = prime * result + ((getTeacherRole() == null) ? 0 : getTeacherRole().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", teacherSex=").append(teacherSex);
        sb.append(", teacherLevel=").append(teacherLevel);
        sb.append(", teacherCourse=").append(teacherCourse);
        sb.append(", teacherDevCourse=").append(teacherDevCourse);
        sb.append(", teacherPhone=").append(teacherPhone);
        sb.append(", teacherRole=").append(teacherRole);
        sb.append(", accountId=").append(accountId);
        sb.append(", status=").append(status);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}