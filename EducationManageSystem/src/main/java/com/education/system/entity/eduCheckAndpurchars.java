package com.education.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_checkAndpurchars
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduCheckAndpurchars implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer hardwaremanageId;

    /**
     * 
     */
    private Integer hardwarepurcharsId;

    /**
     * 
     */
    private String check;

    /**
     * 
     */
    private String check_desc;

    /**
     * 
     */
    private Date check_date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHardwaremanageId() {
        return hardwaremanageId;
    }

    public void setHardwaremanageId(Integer hardwaremanageId) {
        this.hardwaremanageId = hardwaremanageId;
    }

    public Integer getHardwarepurcharsId() {
        return hardwarepurcharsId;
    }

    public void setHardwarepurcharsId(Integer hardwarepurcharsId) {
        this.hardwarepurcharsId = hardwarepurcharsId;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check == null ? null : check.trim();
    }

    public String getCheck_desc() {
        return check_desc;
    }

    public void setCheck_desc(String check_desc) {
        this.check_desc = check_desc == null ? null : check_desc.trim();
    }

    public Date getCheck_date() {
        return check_date;
    }

    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
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
        eduCheckAndpurchars other = (eduCheckAndpurchars) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHardwaremanageId() == null ? other.getHardwaremanageId() == null : this.getHardwaremanageId().equals(other.getHardwaremanageId()))
            && (this.getHardwarepurcharsId() == null ? other.getHardwarepurcharsId() == null : this.getHardwarepurcharsId().equals(other.getHardwarepurcharsId()))
            && (this.getCheck() == null ? other.getCheck() == null : this.getCheck().equals(other.getCheck()))
            && (this.getCheck_desc() == null ? other.getCheck_desc() == null : this.getCheck_desc().equals(other.getCheck_desc()))
            && (this.getCheck_date() == null ? other.getCheck_date() == null : this.getCheck_date().equals(other.getCheck_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHardwaremanageId() == null) ? 0 : getHardwaremanageId().hashCode());
        result = prime * result + ((getHardwarepurcharsId() == null) ? 0 : getHardwarepurcharsId().hashCode());
        result = prime * result + ((getCheck() == null) ? 0 : getCheck().hashCode());
        result = prime * result + ((getCheck_desc() == null) ? 0 : getCheck_desc().hashCode());
        result = prime * result + ((getCheck_date() == null) ? 0 : getCheck_date().hashCode());
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
        sb.append(", hardwarepurcharsId=").append(hardwarepurcharsId);
        sb.append(", check=").append(check);
        sb.append(", check_desc=").append(check_desc);
        sb.append(", check_date=").append(check_date);
        sb.append("]");
        return sb.toString();
    }
}