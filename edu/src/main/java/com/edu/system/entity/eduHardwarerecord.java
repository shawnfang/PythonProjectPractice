package com.edu.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_hardwarerecord
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduHardwarerecord implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String hardwareApplyId;

    /**
     * 
     */
    private String checkAndPurcharsId;

    /**
     * 出入库状态
     */
    private String status;

    /**
     * 出入库数量
     */
    private Integer quantity;

    /**
     * 出入库日期
     */
    private Date date;

    /**
     * 说明
     */
    private String desc;

    /**
     * 操作人
     */
    private String operator;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHardwareApplyId() {
        return hardwareApplyId;
    }

    public void setHardwareApplyId(String hardwareApplyId) {
        this.hardwareApplyId = hardwareApplyId == null ? null : hardwareApplyId.trim();
    }

    public String getCheckAndPurcharsId() {
        return checkAndPurcharsId;
    }

    public void setCheckAndPurcharsId(String checkAndPurcharsId) {
        this.checkAndPurcharsId = checkAndPurcharsId == null ? null : checkAndPurcharsId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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
        eduHardwarerecord other = (eduHardwarerecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHardwareApplyId() == null ? other.getHardwareApplyId() == null : this.getHardwareApplyId().equals(other.getHardwareApplyId()))
            && (this.getCheckAndPurcharsId() == null ? other.getCheckAndPurcharsId() == null : this.getCheckAndPurcharsId().equals(other.getCheckAndPurcharsId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHardwareApplyId() == null) ? 0 : getHardwareApplyId().hashCode());
        result = prime * result + ((getCheckAndPurcharsId() == null) ? 0 : getCheckAndPurcharsId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hardwareApplyId=").append(hardwareApplyId);
        sb.append(", checkAndPurcharsId=").append(checkAndPurcharsId);
        sb.append(", status=").append(status);
        sb.append(", quantity=").append(quantity);
        sb.append(", date=").append(date);
        sb.append(", desc=").append(desc);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }
}