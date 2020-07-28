package com.library.lms.service.impl;

import com.library.lms.pojo.BookInfo;
import com.library.lms.mapper.BookInfoMapper;
import com.library.lms.service.BookInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("bookInfoService")
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Autowired
    private BookInfo bookInfo;
    private final static Logger logger = LoggerFactory.getLogger(BookInfoServiceImpl.class);
    public String getByIds(int bookId) {
        String bookName = bookInfoMapper.getBookIds(bookId);
        logger.info("书名: "+ bookName);
        return bookName;
    }

    public String getById(int bookId) {
        return null;
    }

    public List<BookInfo> getList() {
        return bookInfoMapper.selectBook(bookInfo);
    }

    public Map<String, Object> getBookInfo(int bookId) {
        Map<String,Object> bookInfo= bookInfoMapper.getBookInfo(bookId);
        logger.info("字段："+ bookInfo);
        return bookInfo;
    }

    public boolean insertBook(BookInfo book) {
        return false;
    }

    public List<BookInfo> selectBook(BookInfo book) {
        return null;
    }

    public boolean deleteBook(BookInfo book) {
        return false;
    }

    public boolean updateBook(BookInfo book) {
        return false;
    }

    public BookInfo getBookId(BookInfo book) {
        return null;
    }

    public boolean borrowBook(BookInfo book) {
        return false;
    }

    public boolean repayBook(BookInfo book) {
        return false;
    }
}
