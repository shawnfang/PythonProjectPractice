package com.edu.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : edu_textbook
 * @author shawnfang
 * @date 2020-09-30 23:32:58
 */
public class eduTextbook implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String textbook;

    /**
     * 
     */
    private String textbook_type;

    /**
     * 
     */
    private String creator;

    /**
     * 
     */
    private Date create_date;

    /**
     * 
     */
    private String review;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTextbook() {
        return textbook;
    }

    public void setTextbook(String textbook) {
        this.textbook = textbook == null ? null : textbook.trim();
    }

    public String getTextbook_type() {
        return textbook_type;
    }

    public void setTextbook_type(String textbook_type) {
        this.textbook_type = textbook_type == null ? null : textbook_type.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
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
        eduTextbook other = (eduTextbook) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTextbook() == null ? other.getTextbook() == null : this.getTextbook().equals(other.getTextbook()))
            && (this.getTextbook_type() == null ? other.getTextbook_type() == null : this.getTextbook_type().equals(other.getTextbook_type()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getReview() == null ? other.getReview() == null : this.getReview().equals(other.getReview()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTextbook() == null) ? 0 : getTextbook().hashCode());
        result = prime * result + ((getTextbook_type() == null) ? 0 : getTextbook_type().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getReview() == null) ? 0 : getReview().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", textbook=").append(textbook);
        sb.append(", textbook_type=").append(textbook_type);
        sb.append(", creator=").append(creator);
        sb.append(", create_date=").append(create_date);
        sb.append(", review=").append(review);
        sb.append("]");
        return sb.toString();
    }
}