package com.education.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_taskdetail
 * @author shawnfang
 * @date 2020-10-05 15:08:46
 */
public class eduTaskdetail implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer taskId;

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

    /**
     * 
     */
    private Integer textbookId;

    /**
     * 
     */
    private String textbookName;

    /**
     * 
     */
    private String textbookType;

    /**
     * 
     */
    private String textbookDtailId;

    /**
     * 
     */
    private String detailChapter;

    /**
     * 
     */
    private String detailSection;

    /**
     * 
     */
    private String detail;

    /**
     * 
     */
    private Integer textbookcaseId;

    /**
     * 
     */
    private String caseTheme;

    /**
     * 
     */
    private String caseContent;

    /**
     * 
     */
    private String caseScenes;

    /**
     * 
     */
    private String caseTask;

    /**
     * 
     */
    private String caseSummary;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
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

    public Integer getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(Integer textbookId) {
        this.textbookId = textbookId;
    }

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName == null ? null : textbookName.trim();
    }

    public String getTextbookType() {
        return textbookType;
    }

    public void setTextbookType(String textbookType) {
        this.textbookType = textbookType == null ? null : textbookType.trim();
    }

    public String getTextbookDtailId() {
        return textbookDtailId;
    }

    public void setTextbookDtailId(String textbookDtailId) {
        this.textbookDtailId = textbookDtailId == null ? null : textbookDtailId.trim();
    }

    public String getDetailChapter() {
        return detailChapter;
    }

    public void setDetailChapter(String detailChapter) {
        this.detailChapter = detailChapter == null ? null : detailChapter.trim();
    }

    public String getDetailSection() {
        return detailSection;
    }

    public void setDetailSection(String detailSection) {
        this.detailSection = detailSection == null ? null : detailSection.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getTextbookcaseId() {
        return textbookcaseId;
    }

    public void setTextbookcaseId(Integer textbookcaseId) {
        this.textbookcaseId = textbookcaseId;
    }

    public String getCaseTheme() {
        return caseTheme;
    }

    public void setCaseTheme(String caseTheme) {
        this.caseTheme = caseTheme == null ? null : caseTheme.trim();
    }

    public String getCaseContent() {
        return caseContent;
    }

    public void setCaseContent(String caseContent) {
        this.caseContent = caseContent == null ? null : caseContent.trim();
    }

    public String getCaseScenes() {
        return caseScenes;
    }

    public void setCaseScenes(String caseScenes) {
        this.caseScenes = caseScenes == null ? null : caseScenes.trim();
    }

    public String getCaseTask() {
        return caseTask;
    }

    public void setCaseTask(String caseTask) {
        this.caseTask = caseTask == null ? null : caseTask.trim();
    }

    public String getCaseSummary() {
        return caseSummary;
    }

    public void setCaseSummary(String caseSummary) {
        this.caseSummary = caseSummary == null ? null : caseSummary.trim();
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
        eduTaskdetail other = (eduTaskdetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
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
            && (this.getCoreliteracyid() == null ? other.getCoreliteracyid() == null : this.getCoreliteracyid().equals(other.getCoreliteracyid()))
            && (this.getTextbookId() == null ? other.getTextbookId() == null : this.getTextbookId().equals(other.getTextbookId()))
            && (this.getTextbookName() == null ? other.getTextbookName() == null : this.getTextbookName().equals(other.getTextbookName()))
            && (this.getTextbookType() == null ? other.getTextbookType() == null : this.getTextbookType().equals(other.getTextbookType()))
            && (this.getTextbookDtailId() == null ? other.getTextbookDtailId() == null : this.getTextbookDtailId().equals(other.getTextbookDtailId()))
            && (this.getDetailChapter() == null ? other.getDetailChapter() == null : this.getDetailChapter().equals(other.getDetailChapter()))
            && (this.getDetailSection() == null ? other.getDetailSection() == null : this.getDetailSection().equals(other.getDetailSection()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getTextbookcaseId() == null ? other.getTextbookcaseId() == null : this.getTextbookcaseId().equals(other.getTextbookcaseId()))
            && (this.getCaseTheme() == null ? other.getCaseTheme() == null : this.getCaseTheme().equals(other.getCaseTheme()))
            && (this.getCaseContent() == null ? other.getCaseContent() == null : this.getCaseContent().equals(other.getCaseContent()))
            && (this.getCaseScenes() == null ? other.getCaseScenes() == null : this.getCaseScenes().equals(other.getCaseScenes()))
            && (this.getCaseTask() == null ? other.getCaseTask() == null : this.getCaseTask().equals(other.getCaseTask()))
            && (this.getCaseSummary() == null ? other.getCaseSummary() == null : this.getCaseSummary().equals(other.getCaseSummary()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
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
        result = prime * result + ((getTextbookId() == null) ? 0 : getTextbookId().hashCode());
        result = prime * result + ((getTextbookName() == null) ? 0 : getTextbookName().hashCode());
        result = prime * result + ((getTextbookType() == null) ? 0 : getTextbookType().hashCode());
        result = prime * result + ((getTextbookDtailId() == null) ? 0 : getTextbookDtailId().hashCode());
        result = prime * result + ((getDetailChapter() == null) ? 0 : getDetailChapter().hashCode());
        result = prime * result + ((getDetailSection() == null) ? 0 : getDetailSection().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getTextbookcaseId() == null) ? 0 : getTextbookcaseId().hashCode());
        result = prime * result + ((getCaseTheme() == null) ? 0 : getCaseTheme().hashCode());
        result = prime * result + ((getCaseContent() == null) ? 0 : getCaseContent().hashCode());
        result = prime * result + ((getCaseScenes() == null) ? 0 : getCaseScenes().hashCode());
        result = prime * result + ((getCaseTask() == null) ? 0 : getCaseTask().hashCode());
        result = prime * result + ((getCaseSummary() == null) ? 0 : getCaseSummary().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskId=").append(taskId);
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
        sb.append(", textbookId=").append(textbookId);
        sb.append(", textbookName=").append(textbookName);
        sb.append(", textbookType=").append(textbookType);
        sb.append(", textbookDtailId=").append(textbookDtailId);
        sb.append(", detailChapter=").append(detailChapter);
        sb.append(", detailSection=").append(detailSection);
        sb.append(", detail=").append(detail);
        sb.append(", textbookcaseId=").append(textbookcaseId);
        sb.append(", caseTheme=").append(caseTheme);
        sb.append(", caseContent=").append(caseContent);
        sb.append(", caseScenes=").append(caseScenes);
        sb.append(", caseTask=").append(caseTask);
        sb.append(", caseSummary=").append(caseSummary);
        sb.append("]");
        return sb.toString();
    }
}