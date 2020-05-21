package com.lms.service;

import com.lms.entity.BookInfo;

import java.util.List;

public interface BookInfoService {
    BookInfo getById(int bookId);
    List<BookInfo> getList();

}
