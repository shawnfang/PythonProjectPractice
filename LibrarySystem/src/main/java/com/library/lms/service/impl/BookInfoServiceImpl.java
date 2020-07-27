package com.library.lms.service.impl;

import com.library.lms.pojo.BookInfo;
import com.library.lms.mapper.BookInfoMapper;
import com.library.lms.service.BookInfoService;
import com.library.lms.web.BookInfoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bookInfoService")
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;
    private final static Logger logger = LoggerFactory.getLogger(BookInfoServiceImpl.class);
    public String getById(int bookId) {
        String bookName = bookInfoMapper.getBookId(bookId);
        logger.info("书名: "+ bookName);
        return bookName;
    }

    public List<BookInfo> getList() {
        return bookInfoMapper.selectBook(10);
    }
}
