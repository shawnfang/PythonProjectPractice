package com.library.lms.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RecordInfo {
    private int record_id;
    private BookInfo bookInfo;
    private UserInfo userInfo;
    private Date record_time;

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


    public Date getRecord_time() {
        return record_time;
    }


    public int getRecord_id() {
        return record_id;
    }


    public void setRecord_time(Date dateTime) {
        this.record_time = dateTime;
    }

    public void setRecord_id(int recordId) {
        this.record_id = recordId;
    }

    @Override
    public String toString() {
        return "RecordInfo{" +
                "record_id=" + record_id +
                ", bookInfo=" + bookInfo +
                ", userInfo=" + userInfo +
                ", record_time=" + record_time +
                '}';
    }


}
