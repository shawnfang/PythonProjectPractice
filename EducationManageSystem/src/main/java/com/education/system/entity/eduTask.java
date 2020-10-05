package com.education.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_task
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduTask implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 学年
     */
    private Integer schoolyearId;

    /**
     * 上课日期
     */
    private Date class_date;

    /**
     * 上课时间
     */
    private Date class_time;

    /**
     * 授课教师
     */
    private Integer teacherInfoId;

    /**
     * 学分
     */
    private String credit;

    /**
     * 教室地点
     */
    private Integer classroomId;

    /**
     * 发布状态
     */
    private String status;

    /**
     * 教学状态
     */
    private String teaching_status;

    /**
     * 发送状态
     */
    private String send_status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolyearId() {
        return schoolyearId;
    }

    public void setSchoolyearId(Integer schoolyearId) {
        this.schoolyearId = schoolyearId;
    }

    public Date getClass_date() {
        return class_date;
    }

    public void setClass_date(Date class_date) {
        this.class_date = class_date;
    }

    public Date getClass_time() {
        return class_time;
    }

    public void setClass_time(Date class_time) {
        this.class_time = class_time;
    }

    public Integer getTeacherInfoId() {
        return teacherInfoId;
    }

    public void setTeacherInfoId(Integer teacherInfoId) {
        this.teacherInfoId = teacherInfoId;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTeaching_status() {
        return teaching_status;
    }

    public void setTeaching_status(String teaching_status) {
        this.teaching_status = teaching_status == null ? null : teaching_status.trim();
    }

    public String getSend_status() {
        return send_status;
    }

    public void setSend_status(String send_status) {
        this.send_status = send_status == null ? null : send_status.trim();
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
        eduTask other = (eduTask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolyearId() == null ? other.getSchoolyearId() == null : this.getSchoolyearId().equals(other.getSchoolyearId()))
            && (this.getClass_date() == null ? other.getClass_date() == null : this.getClass_date().equals(other.getClass_date()))
            && (this.getClass_time() == null ? other.getClass_time() == null : this.getClass_time().equals(other.getClass_time()))
            && (this.getTeacherInfoId() == null ? other.getTeacherInfoId() == null : this.getTeacherInfoId().equals(other.getTeacherInfoId()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getClassroomId() == null ? other.getClassroomId() == null : this.getClassroomId().equals(other.getClassroomId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTeaching_status() == null ? other.getTeaching_status() == null : this.getTeaching_status().equals(other.getTeaching_status()))
            && (this.getSend_status() == null ? other.getSend_status() == null : this.getSend_status().equals(other.getSend_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSchoolyearId() == null) ? 0 : getSchoolyearId().hashCode());
        result = prime * result + ((getClass_date() == null) ? 0 : getClass_date().hashCode());
        result = prime * result + ((getClass_time() == null) ? 0 : getClass_time().hashCode());
        result = prime * result + ((getTeacherInfoId() == null) ? 0 : getTeacherInfoId().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getClassroomId() == null) ? 0 : getClassroomId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTeaching_status() == null) ? 0 : getTeaching_status().hashCode());
        result = prime * result + ((getSend_status() == null) ? 0 : getSend_status().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schoolyearId=").append(schoolyearId);
        sb.append(", class_date=").append(class_date);
        sb.append(", class_time=").append(class_time);
        sb.append(", teacherInfoId=").append(teacherInfoId);
        sb.append(", credit=").append(credit);
        sb.append(", classroomId=").append(classroomId);
        sb.append(", status=").append(status);
        sb.append(", teaching_status=").append(teaching_status);
        sb.append(", send_status=").append(send_status);
        sb.append("]");
        return sb.toString();
    }
}