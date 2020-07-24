package com.library.lms.service.impl;

import com.library.lms.pojo.BookInfo;
import com.library.lms.mapper.BookInfoMapper;
import com.library.lms.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bookInfoService")
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    public BookInfo getById(int bookId) {
        return bookInfoMapper.getBookId(bookId);
    }

    public List<BookInfo> getList() {
        return bookInfoMapper.selectBook(10);
    }
}
