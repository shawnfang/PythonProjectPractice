package com.library.lms.pojo;

public class BookSort {
    private int bookSortId;
    private String bookSortName;
    private String bookSortExtend;
    private String bookSortMark;

    public int getBookSortId() {
        return bookSortId;
    }

    public void setBookSortId(int bookSortId) {
        this.bookSortId = bookSortId;
    }

    public String getBookSortExtend() {
        return bookSortExtend;
    }

    public String getBookSortMark() {
        return bookSortMark;
    }

    public String getBookSortName() {
        return bookSortName;
    }

    public void setBookSortExtend(String bookSortExtend) {
        this.bookSortExtend = bookSortExtend;
    }

    public void setBookSortMark(String bookSortMark) {
        this.bookSortMark = bookSortMark;
    }

    public void setBookSortName(String bookSortName) {
        this.bookSortName = bookSortName;
    }

    @Override
    public String toString() {
        return "BookSort{" +
                "bookSortId=" + bookSortId +
                ", bookSortName='" + bookSortName + '\'' +
                ", bookSortExtend='" + bookSortExtend + '\'' +
                ", bookSortMark='" + bookSortMark + '\'' +
                '}';
    }
}
