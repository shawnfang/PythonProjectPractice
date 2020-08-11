package com.library.lms.pojo;

import org.springframework.stereotype.Component;

@Component
public class BookInfo {
    private int book_id;
    private int book_sort_id;
    private String book_name;
    private String book_author;
    private int book_price;
    private String book_type;
    private String book_publish;
    private int book_sum;
    private int book_mark;

    public int getBook_id() {
        return book_id;
    }

    public int getBook_mark() {
        return book_mark;
    }

    public int getBook_price() {
        return book_price;
    }

    public int getBook_sort_id() {
        return book_sort_id;
    }

    public String getBook_author() {
        return book_author;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getBook_publish() {
        return book_publish;
    }

    public int getBook_sum() {
        return book_sum;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBook_mark(int book_mark) {
        this.book_mark = book_mark;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public void setBook_publish(String book_publish) {
        this.book_publish = book_publish;
    }

    public void setBook_sort_id(int book_sort_id) {
        this.book_sort_id = book_sort_id;
    }

    public void setBook_sum(int book_sum) {
        this.book_sum = book_sum;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "book_id=" + book_id +
                ", book_sort_id=" + book_sort_id +
                ", book_name='" + book_name + '\'' +
                ", book_author='" + book_author + '\'' +
                ", book_price=" + book_price +
                ", book_type='" + book_type + '\'' +
                ", book_publish='" + book_publish + '\'' +
                ", book_sum='" + book_sum + '\'' +
                ", book_mark=" + book_mark +
                '}';
    }
}
