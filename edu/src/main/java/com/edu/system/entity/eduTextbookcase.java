package com.edu.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_textbookcase
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduTextbookcase implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String theme;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Date create_date;

    /**
     * 
     */
    private String scenes;

    /**
     * 
     */
    private String task;

    /**
     * 
     */
    private String knowledgesummary;

    /**
     * 
     */
    private String links;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getScenes() {
        return scenes;
    }

    public void setScenes(String scenes) {
        this.scenes = scenes == null ? null : scenes.trim();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }

    public String getKnowledgesummary() {
        return knowledgesummary;
    }

    public void setKnowledgesummary(String knowledgesummary) {
        this.knowledgesummary = knowledgesummary == null ? null : knowledgesummary.trim();
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links == null ? null : links.trim();
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
        eduTextbookcase other = (eduTextbookcase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTheme() == null ? other.getTheme() == null : this.getTheme().equals(other.getTheme()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getScenes() == null ? other.getScenes() == null : this.getScenes().equals(other.getScenes()))
            && (this.getTask() == null ? other.getTask() == null : this.getTask().equals(other.getTask()))
            && (this.getKnowledgesummary() == null ? other.getKnowledgesummary() == null : this.getKnowledgesummary().equals(other.getKnowledgesummary()))
            && (this.getLinks() == null ? other.getLinks() == null : this.getLinks().equals(other.getLinks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTheme() == null) ? 0 : getTheme().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getScenes() == null) ? 0 : getScenes().hashCode());
        result = prime * result + ((getTask() == null) ? 0 : getTask().hashCode());
        result = prime * result + ((getKnowledgesummary() == null) ? 0 : getKnowledgesummary().hashCode());
        result = prime * result + ((getLinks() == null) ? 0 : getLinks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", theme=").append(theme);
        sb.append(", content=").append(content);
        sb.append(", create_date=").append(create_date);
        sb.append(", scenes=").append(scenes);
        sb.append(", task=").append(task);
        sb.append(", knowledgesummary=").append(knowledgesummary);
        sb.append(", links=").append(links);
        sb.append("]");
        return sb.toString();
    }
}