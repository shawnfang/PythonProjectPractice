package com.library.lms.pojo;

import java.util.Date;

public class RecordInfo {
    private int recordId;
    private BookInfo bookInfo;
    private UserInfo userInfo;
    private Date dateTime;

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }


    public Date getDateTime() {
        return dateTime;
    }


    public int getRecordId() {
        return recordId;
    }


    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Override
    public String toString() {
        return "RecordInfo{" +
                "recordId=" + recordId +
                ", bookInfo=" + bookInfo +
                ", userInfo=" + userInfo +
                ", dateTime=" + dateTime +
                '}';
    }


}
