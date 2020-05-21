package com.lms.service.impl;

import com.lms.dao.BookInfoDao;
import com.lms.entity.BookInfo;
import com.lms.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoDao bookInfoDao;

    @Override
    public BookInfo getById(int bookId) {
        return bookInfoDao.getBookId(bookId);
    }

    @Override
    public List<BookInfo> getList() {
        return bookInfoDao.selectBook(10);
    }
}
