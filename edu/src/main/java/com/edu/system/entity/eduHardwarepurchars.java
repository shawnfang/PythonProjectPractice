package com.edu.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_hardwarepurchars
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduHardwarepurchars implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String hardware_name;

    /**
     * 
     */
    private String hardware_type;

    /**
     * 
     */
    private Integer quantity;

    /**
     * 
     */
    private Date apply_date;

    /**
     * 
     */
    private String apply_result;

    /**
     * 
     */
    private String apply_resultdes;

    /**
     * 
     */
    private String apply_cause;

    /**
     * 
     */
    private String applicant;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHardware_name() {
        return hardware_name;
    }

    public void setHardware_name(String hardware_name) {
        this.hardware_name = hardware_name == null ? null : hardware_name.trim();
    }

    public String getHardware_type() {
        return hardware_type;
    }

    public void setHardware_type(String hardware_type) {
        this.hardware_type = hardware_type == null ? null : hardware_type.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getApply_date() {
        return apply_date;
    }

    public void setApply_date(Date apply_date) {
        this.apply_date = apply_date;
    }

    public String getApply_result() {
        return apply_result;
    }

    public void setApply_result(String apply_result) {
        this.apply_result = apply_result == null ? null : apply_result.trim();
    }

    public String getApply_resultdes() {
        return apply_resultdes;
    }

    public void setApply_resultdes(String apply_resultdes) {
        this.apply_resultdes = apply_resultdes == null ? null : apply_resultdes.trim();
    }

    public String getApply_cause() {
        return apply_cause;
    }

    public void setApply_cause(String apply_cause) {
        this.apply_cause = apply_cause == null ? null : apply_cause.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
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
        eduHardwarepurchars other = (eduHardwarepurchars) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHardware_name() == null ? other.getHardware_name() == null : this.getHardware_name().equals(other.getHardware_name()))
            && (this.getHardware_type() == null ? other.getHardware_type() == null : this.getHardware_type().equals(other.getHardware_type()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getApply_date() == null ? other.getApply_date() == null : this.getApply_date().equals(other.getApply_date()))
            && (this.getApply_result() == null ? other.getApply_result() == null : this.getApply_result().equals(other.getApply_result()))
            && (this.getApply_resultdes() == null ? other.getApply_resultdes() == null : this.getApply_resultdes().equals(other.getApply_resultdes()))
            && (this.getApply_cause() == null ? other.getApply_cause() == null : this.getApply_cause().equals(other.getApply_cause()))
            && (this.getApplicant() == null ? other.getApplicant() == null : this.getApplicant().equals(other.getApplicant()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHardware_name() == null) ? 0 : getHardware_name().hashCode());
        result = prime * result + ((getHardware_type() == null) ? 0 : getHardware_type().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getApply_date() == null) ? 0 : getApply_date().hashCode());
        result = prime * result + ((getApply_result() == null) ? 0 : getApply_result().hashCode());
        result = prime * result + ((getApply_resultdes() == null) ? 0 : getApply_resultdes().hashCode());
        result = prime * result + ((getApply_cause() == null) ? 0 : getApply_cause().hashCode());
        result = prime * result + ((getApplicant() == null) ? 0 : getApplicant().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hardware_name=").append(hardware_name);
        sb.append(", hardware_type=").append(hardware_type);
        sb.append(", quantity=").append(quantity);
        sb.append(", apply_date=").append(apply_date);
        sb.append(", apply_result=").append(apply_result);
        sb.append(", apply_resultdes=").append(apply_resultdes);
        sb.append(", apply_cause=").append(apply_cause);
        sb.append(", applicant=").append(applicant);
        sb.append("]");
        return sb.toString();
    }
}