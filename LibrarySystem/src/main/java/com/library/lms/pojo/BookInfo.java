package com.library.lms.pojo;

public class BookInfo {
    private int bookId;
    private int bookSortId;
    private String bookName;
    private String bookAuthor;
    private Double bookPrice;
    private String bookType;
    private String bookPublish;
    private String bookMark;

    public Double getBookPrice() {
        return bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public int getBookSortId() {
        return bookSortId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookMark() {
        return bookMark;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookId(int bookid) {
        this.bookId = bookId;
    }

    public void setBookMark(String bookMark) {
        this.bookMark = bookMark;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish;
    }

    public void setBookSortId(int bookSortId) {
        this.bookSortId = bookSortId;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId=" + bookId +
                ", bookSortId=" + bookSortId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookType='" + bookType + '\'' +
                ", bookPublish='" + bookPublish + '\'' +
                ", bookMark='" + bookMark + '\'' +
                '}';
    }
}
