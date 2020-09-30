package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_homeworkscore
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduHomeworkscore implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer taskAndstuId;

    /**
     * 
     */
    private String selfscore;

    /**
     * 
     */
    private String teacherscore;

    /**
     * 
     */
    private String gradepoint;

    /**
     * 
     */
    private String staus;

    /**
     * 
     */
    private Integer homeworkId;

    /**
     * 
     */
    private Integer courseTaskCoreliteracyId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskAndstuId() {
        return taskAndstuId;
    }

    public void setTaskAndstuId(Integer taskAndstuId) {
        this.taskAndstuId = taskAndstuId;
    }

    public String getSelfscore() {
        return selfscore;
    }

    public void setSelfscore(String selfscore) {
        this.selfscore = selfscore == null ? null : selfscore.trim();
    }

    public String getTeacherscore() {
        return teacherscore;
    }

    public void setTeacherscore(String teacherscore) {
        this.teacherscore = teacherscore == null ? null : teacherscore.trim();
    }

    public String getGradepoint() {
        return gradepoint;
    }

    public void setGradepoint(String gradepoint) {
        this.gradepoint = gradepoint == null ? null : gradepoint.trim();
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus == null ? null : staus.trim();
    }

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Integer getCourseTaskCoreliteracyId() {
        return courseTaskCoreliteracyId;
    }

    public void setCourseTaskCoreliteracyId(Integer courseTaskCoreliteracyId) {
        this.courseTaskCoreliteracyId = courseTaskCoreliteracyId;
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
        eduHomeworkscore other = (eduHomeworkscore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskAndstuId() == null ? other.getTaskAndstuId() == null : this.getTaskAndstuId().equals(other.getTaskAndstuId()))
            && (this.getSelfscore() == null ? other.getSelfscore() == null : this.getSelfscore().equals(other.getSelfscore()))
            && (this.getTeacherscore() == null ? other.getTeacherscore() == null : this.getTeacherscore().equals(other.getTeacherscore()))
            && (this.getGradepoint() == null ? other.getGradepoint() == null : this.getGradepoint().equals(other.getGradepoint()))
            && (this.getStaus() == null ? other.getStaus() == null : this.getStaus().equals(other.getStaus()))
            && (this.getHomeworkId() == null ? other.getHomeworkId() == null : this.getHomeworkId().equals(other.getHomeworkId()))
            && (this.getCourseTaskCoreliteracyId() == null ? other.getCourseTaskCoreliteracyId() == null : this.getCourseTaskCoreliteracyId().equals(other.getCourseTaskCoreliteracyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskAndstuId() == null) ? 0 : getTaskAndstuId().hashCode());
        result = prime * result + ((getSelfscore() == null) ? 0 : getSelfscore().hashCode());
        result = prime * result + ((getTeacherscore() == null) ? 0 : getTeacherscore().hashCode());
        result = prime * result + ((getGradepoint() == null) ? 0 : getGradepoint().hashCode());
        result = prime * result + ((getStaus() == null) ? 0 : getStaus().hashCode());
        result = prime * result + ((getHomeworkId() == null) ? 0 : getHomeworkId().hashCode());
        result = prime * result + ((getCourseTaskCoreliteracyId() == null) ? 0 : getCourseTaskCoreliteracyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskAndstuId=").append(taskAndstuId);
        sb.append(", selfscore=").append(selfscore);
        sb.append(", teacherscore=").append(teacherscore);
        sb.append(", gradepoint=").append(gradepoint);
        sb.append(", staus=").append(staus);
        sb.append(", homeworkId=").append(homeworkId);
        sb.append(", courseTaskCoreliteracyId=").append(courseTaskCoreliteracyId);
        sb.append("]");
        return sb.toString();
    }
}