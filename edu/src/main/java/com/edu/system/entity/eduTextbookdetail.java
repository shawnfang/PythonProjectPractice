package com.edu.system.entity;

import java.io.Serializable;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_textbookdetail
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduTextbookdetail implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer textbookid;

    /**
     * 
     */
    private String chaptername;

    /**
     * 
     */
    private String sectionname;

    /**
     * 
     */
    private String detail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTextbookid() {
        return textbookid;
    }

    public void setTextbookid(Integer textbookid) {
        this.textbookid = textbookid;
    }

    public String getChaptername() {
        return chaptername;
    }

    public void setChaptername(String chaptername) {
        this.chaptername = chaptername == null ? null : chaptername.trim();
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname == null ? null : sectionname.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
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
        eduTextbookdetail other = (eduTextbookdetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTextbookid() == null ? other.getTextbookid() == null : this.getTextbookid().equals(other.getTextbookid()))
            && (this.getChaptername() == null ? other.getChaptername() == null : this.getChaptername().equals(other.getChaptername()))
            && (this.getSectionname() == null ? other.getSectionname() == null : this.getSectionname().equals(other.getSectionname()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTextbookid() == null) ? 0 : getTextbookid().hashCode());
        result = prime * result + ((getChaptername() == null) ? 0 : getChaptername().hashCode());
        result = prime * result + ((getSectionname() == null) ? 0 : getSectionname().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", textbookid=").append(textbookid);
        sb.append(", chaptername=").append(chaptername);
        sb.append(", sectionname=").append(sectionname);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }
}