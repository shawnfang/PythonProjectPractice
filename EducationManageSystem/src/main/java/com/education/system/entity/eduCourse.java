package com.education.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_course
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduCourse implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String course_name;

    /**
     * 
     */
    private String term;

    /**
     * 
     */
    private String coreliteracycoefficient;

    /**
     * 
     */
    private Integer schoolhour;

    /**
     * 
     */
    private String course_theme;

    /**
     * 
     */
    private String course_content;

    /**
     * 
     */
    private String course_module;

    /**
     * 
     */
    private String course_scenes;

    /**
     * 
     */
    private String course_task;

    /**
     * 
     */
    private String course_type;

    /**
     * 
     */
    private Integer coreliteracyid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name == null ? null : course_name.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getCoreliteracycoefficient() {
        return coreliteracycoefficient;
    }

    public void setCoreliteracycoefficient(String coreliteracycoefficient) {
        this.coreliteracycoefficient = coreliteracycoefficient == null ? null : coreliteracycoefficient.trim();
    }

    public Integer getSchoolhour() {
        return schoolhour;
    }

    public void setSchoolhour(Integer schoolhour) {
        this.schoolhour = schoolhour;
    }

    public String getCourse_theme() {
        return course_theme;
    }

    public void setCourse_theme(String course_theme) {
        this.course_theme = course_theme == null ? null : course_theme.trim();
    }

    public String getCourse_content() {
        return course_content;
    }

    public void setCourse_content(String course_content) {
        this.course_content = course_content == null ? null : course_content.trim();
    }

    public String getCourse_module() {
        return course_module;
    }

    public void setCourse_module(String course_module) {
        this.course_module = course_module == null ? null : course_module.trim();
    }

    public String getCourse_scenes() {
        return course_scenes;
    }

    public void setCourse_scenes(String course_scenes) {
        this.course_scenes = course_scenes == null ? null : course_scenes.trim();
    }

    public String getCourse_task() {
        return course_task;
    }

    public void setCourse_task(String course_task) {
        this.course_task = course_task == null ? null : course_task.trim();
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type == null ? null : course_type.trim();
    }

    public Integer getCoreliteracyid() {
        return coreliteracyid;
    }

    public void setCoreliteracyid(Integer coreliteracyid) {
        this.coreliteracyid = coreliteracyid;
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
        eduCourse other = (eduCourse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourse_name() == null ? other.getCourse_name() == null : this.getCourse_name().equals(other.getCourse_name()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getCoreliteracycoefficient() == null ? other.getCoreliteracycoefficient() == null : this.getCoreliteracycoefficient().equals(other.getCoreliteracycoefficient()))
            && (this.getSchoolhour() == null ? other.getSchoolhour() == null : this.getSchoolhour().equals(other.getSchoolhour()))
            && (this.getCourse_theme() == null ? other.getCourse_theme() == null : this.getCourse_theme().equals(other.getCourse_theme()))
            && (this.getCourse_content() == null ? other.getCourse_content() == null : this.getCourse_content().equals(other.getCourse_content()))
            && (this.getCourse_module() == null ? other.getCourse_module() == null : this.getCourse_module().equals(other.getCourse_module()))
            && (this.getCourse_scenes() == null ? other.getCourse_scenes() == null : this.getCourse_scenes().equals(other.getCourse_scenes()))
            && (this.getCourse_task() == null ? other.getCourse_task() == null : this.getCourse_task().equals(other.getCourse_task()))
            && (this.getCourse_type() == null ? other.getCourse_type() == null : this.getCourse_type().equals(other.getCourse_type()))
            && (this.getCoreliteracyid() == null ? other.getCoreliteracyid() == null : this.getCoreliteracyid().equals(other.getCoreliteracyid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourse_name() == null) ? 0 : getCourse_name().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getCoreliteracycoefficient() == null) ? 0 : getCoreliteracycoefficient().hashCode());
        result = prime * result + ((getSchoolhour() == null) ? 0 : getSchoolhour().hashCode());
        result = prime * result + ((getCourse_theme() == null) ? 0 : getCourse_theme().hashCode());
        result = prime * result + ((getCourse_content() == null) ? 0 : getCourse_content().hashCode());
        result = prime * result + ((getCourse_module() == null) ? 0 : getCourse_module().hashCode());
        result = prime * result + ((getCourse_scenes() == null) ? 0 : getCourse_scenes().hashCode());
        result = prime * result + ((getCourse_task() == null) ? 0 : getCourse_task().hashCode());
        result = prime * result + ((getCourse_type() == null) ? 0 : getCourse_type().hashCode());
        result = prime * result + ((getCoreliteracyid() == null) ? 0 : getCoreliteracyid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", course_name=").append(course_name);
        sb.append(", term=").append(term);
        sb.append(", coreliteracycoefficient=").append(coreliteracycoefficient);
        sb.append(", schoolhour=").append(schoolhour);
        sb.append(", course_theme=").append(course_theme);
        sb.append(", course_content=").append(course_content);
        sb.append(", course_module=").append(course_module);
        sb.append(", course_scenes=").append(course_scenes);
        sb.append(", course_task=").append(course_task);
        sb.append(", course_type=").append(course_type);
        sb.append(", coreliteracyid=").append(coreliteracyid);
        sb.append("]");
        return sb.toString();
    }
}