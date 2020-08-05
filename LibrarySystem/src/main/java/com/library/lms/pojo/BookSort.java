package com.library.lms.pojo;

public class BookSort {
    private int book_sort_id;
    private String book_sort_name;
    private String book_sort_extend;
    private String book_sort_mark;

    public void setBook_sort_id(int book_sort_id) {
        this.book_sort_id = book_sort_id;
    }

    public int getBook_sort_id() {
        return book_sort_id;
    }

    public String getBook_sort_extend() {
        return book_sort_extend;
    }

    public String getBook_sort_mark() {
        return book_sort_mark;
    }

    public String getBook_sort_name() {
        return book_sort_name;
    }

    public void setBook_sort_extend(String book_sort_extend) {
        this.book_sort_extend = book_sort_extend;
    }

    public void setBook_sort_mark(String book_sort_mark) {
        this.book_sort_mark = book_sort_mark;
    }

    public void setBook_sort_name(String book_sort_name) {
        this.book_sort_name = book_sort_name;
    }

    @Override
    public String toString() {
        return "BookSort{" +
                "book_sort_id=" + book_sort_id +
                ", book_sort_name='" + book_sort_name + '\'' +
                ", book_sort_extend='" + book_sort_extend + '\'' +
                ", book_sort_mark='" + book_sort_mark + '\'' +
                '}';
    }
}
