package com.education.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_stuInfo
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduStuInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer accountId;

    /**
     * 
     */
    private String stuSex;

    /**
     * 
     */
    private String stuTerm;

    /**
     * 
     */
    private String stuPhone;

    /**
     * 
     */
    private Byte status;

    /**
     * 
     */
    private Integer schoolId;

    /**
     * 
     */
    private Integer classId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuTerm() {
        return stuTerm;
    }

    public void setStuTerm(String stuTerm) {
        this.stuTerm = stuTerm == null ? null : stuTerm.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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
        eduStuInfo other = (eduStuInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getStuSex() == null ? other.getStuSex() == null : this.getStuSex().equals(other.getStuSex()))
            && (this.getStuTerm() == null ? other.getStuTerm() == null : this.getStuTerm().equals(other.getStuTerm()))
            && (this.getStuPhone() == null ? other.getStuPhone() == null : this.getStuPhone().equals(other.getStuPhone()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getStuSex() == null) ? 0 : getStuSex().hashCode());
        result = prime * result + ((getStuTerm() == null) ? 0 : getStuTerm().hashCode());
        result = prime * result + ((getStuPhone() == null) ? 0 : getStuPhone().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountId=").append(accountId);
        sb.append(", stuSex=").append(stuSex);
        sb.append(", stuTerm=").append(stuTerm);
        sb.append(", stuPhone=").append(stuPhone);
        sb.append(", status=").append(status);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", classId=").append(classId);
        sb.append("]");
        return sb.toString();
    }
}