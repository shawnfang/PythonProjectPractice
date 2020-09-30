package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_school
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduSchool implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 学校名字
     */
    private String schoolName;

    /**
     * 学校联系人
     */
    private String schoolContactor;

    /**
     * 学校联系电话
     */
    private String schoolPhone;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 账号ID
     */
    private Integer accountId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getSchoolContactor() {
        return schoolContactor;
    }

    public void setSchoolContactor(String schoolContactor) {
        this.schoolContactor = schoolContactor == null ? null : schoolContactor.trim();
    }

    public String getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(String schoolPhone) {
        this.schoolPhone = schoolPhone == null ? null : schoolPhone.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
        eduSchool other = (eduSchool) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolName() == null ? other.getSchoolName() == null : this.getSchoolName().equals(other.getSchoolName()))
            && (this.getSchoolContactor() == null ? other.getSchoolContactor() == null : this.getSchoolContactor().equals(other.getSchoolContactor()))
            && (this.getSchoolPhone() == null ? other.getSchoolPhone() == null : this.getSchoolPhone().equals(other.getSchoolPhone()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSchoolName() == null) ? 0 : getSchoolName().hashCode());
        result = prime * result + ((getSchoolContactor() == null) ? 0 : getSchoolContactor().hashCode());
        result = prime * result + ((getSchoolPhone() == null) ? 0 : getSchoolPhone().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", schoolContactor=").append(schoolContactor);
        sb.append(", schoolPhone=").append(schoolPhone);
        sb.append(", status=").append(status);
        sb.append(", accountId=").append(accountId);
        sb.append("]");
        return sb.toString();
    }
}