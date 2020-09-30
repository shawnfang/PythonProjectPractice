package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_hardwaretype
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduHardwaretype implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String hardware_type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHardware_type() {
        return hardware_type;
    }

    public void setHardware_type(String hardware_type) {
        this.hardware_type = hardware_type == null ? null : hardware_type.trim();
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
        eduHardwaretype other = (eduHardwaretype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHardware_type() == null ? other.getHardware_type() == null : this.getHardware_type().equals(other.getHardware_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHardware_type() == null) ? 0 : getHardware_type().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hardware_type=").append(hardware_type);
        sb.append("]");
        return sb.toString();
    }
}