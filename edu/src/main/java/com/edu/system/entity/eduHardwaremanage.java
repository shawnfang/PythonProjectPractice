package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_hardwaremanage
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduHardwaremanage implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String hardwareName;

    /**
     * 
     */
    private String hardwareTypeId;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private Integer quantity;

    /**
     * 
     */
    private String hardwareDesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName == null ? null : hardwareName.trim();
    }

    public String getHardwareTypeId() {
        return hardwareTypeId;
    }

    public void setHardwareTypeId(String hardwareTypeId) {
        this.hardwareTypeId = hardwareTypeId == null ? null : hardwareTypeId.trim();
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

    public String getHardwareDesc() {
        return hardwareDesc;
    }

    public void setHardwareDesc(String hardwareDesc) {
        this.hardwareDesc = hardwareDesc == null ? null : hardwareDesc.trim();
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
        eduHardwaremanage other = (eduHardwaremanage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHardwareName() == null ? other.getHardwareName() == null : this.getHardwareName().equals(other.getHardwareName()))
            && (this.getHardwareTypeId() == null ? other.getHardwareTypeId() == null : this.getHardwareTypeId().equals(other.getHardwareTypeId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getHardwareDesc() == null ? other.getHardwareDesc() == null : this.getHardwareDesc().equals(other.getHardwareDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHardwareName() == null) ? 0 : getHardwareName().hashCode());
        result = prime * result + ((getHardwareTypeId() == null) ? 0 : getHardwareTypeId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getHardwareDesc() == null) ? 0 : getHardwareDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hardwareName=").append(hardwareName);
        sb.append(", hardwareTypeId=").append(hardwareTypeId);
        sb.append(", status=").append(status);
        sb.append(", quantity=").append(quantity);
        sb.append(", hardwareDesc=").append(hardwareDesc);
        sb.append("]");
        return sb.toString();
    }
}