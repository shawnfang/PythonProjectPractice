package com.library.lms.service;

import com.library.lms.pojo.BookInfo;

import java.util.List;


public interface BookInfoService {
    String getById(int bookId);

    List<BookInfo> getList();

}
