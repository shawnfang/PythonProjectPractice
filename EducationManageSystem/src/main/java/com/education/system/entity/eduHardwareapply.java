package com.education.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_hardwareapply
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduHardwareapply implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String hardwaremanageId;

    /**
     * 
     */
    private String quantity;

    /**
     * 
     */
    private String apply_desc;

    /**
     * 
     */
    private Date apply_date;

    /**
     * 
     */
    private String applicant;

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

    public String getHardwaremanageId() {
        return hardwaremanageId;
    }

    public void setHardwaremanageId(String hardwaremanageId) {
        this.hardwaremanageId = hardwaremanageId == null ? null : hardwaremanageId.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public String getApply_desc() {
        return apply_desc;
    }

    public void setApply_desc(String apply_desc) {
        this.apply_desc = apply_desc == null ? null : apply_desc.trim();
    }

    public Date getApply_date() {
        return apply_date;
    }

    public void setApply_date(Date apply_date) {
        this.apply_date = apply_date;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
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
        eduHardwareapply other = (eduHardwareapply) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHardwaremanageId() == null ? other.getHardwaremanageId() == null : this.getHardwaremanageId().equals(other.getHardwaremanageId()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getApply_desc() == null ? other.getApply_desc() == null : this.getApply_desc().equals(other.getApply_desc()))
            && (this.getApply_date() == null ? other.getApply_date() == null : this.getApply_date().equals(other.getApply_date()))
            && (this.getApplicant() == null ? other.getApplicant() == null : this.getApplicant().equals(other.getApplicant()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHardwaremanageId() == null) ? 0 : getHardwaremanageId().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getApply_desc() == null) ? 0 : getApply_desc().hashCode());
        result = prime * result + ((getApply_date() == null) ? 0 : getApply_date().hashCode());
        result = prime * result + ((getApplicant() == null) ? 0 : getApplicant().hashCode());
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
        sb.append(", hardwaremanageId=").append(hardwaremanageId);
        sb.append(", quantity=").append(quantity);
        sb.append(", apply_desc=").append(apply_desc);
        sb.append(", apply_date=").append(apply_date);
        sb.append(", applicant=").append(applicant);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}