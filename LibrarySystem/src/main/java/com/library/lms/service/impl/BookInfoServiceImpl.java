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

    private final static Logger logger = LoggerFactory.getLogger(BookInfoServiceImpl.class);
    public String getByIds(int bookId) {
        String bookName = bookInfoMapper.getBookIds(bookId);
        logger.info("书名: "+ bookName);
        return bookName;
    }

    public BookInfo getById(int bookId) {
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        for (BookInfo bookInfo:bookInfos){
            if (bookInfo.getBook_id() == bookId) {
                return bookInfo;
            }
        }
        return null;
    }

    public List<BookInfo> getList() {
        return bookInfoMapper.selectBook();
    }

    public Map<String, Object> getBookInfo(int bookId) {
        Map<String,Object> bookInfo= bookInfoMapper.getBookInfo(bookId);
        logger.info("字段："+ bookInfo);
        return bookInfo;
    }

    public boolean insertBook(BookInfo book) {
        return bookInfoMapper.addBook(book);
    }

    public List<BookInfo> selectBook() {
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        return bookInfos;
    }

    public boolean deleteBook(int bookId) {
        return bookInfoMapper.deleteBook(bookId);
    }

    public boolean updateBook(BookInfo book) {
        return false;
    }

    public BookInfo getBookId(int bookId) {
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        for (BookInfo bookInfo: bookInfos){
            if (bookInfo.getBook_id() == bookId) {
                return bookInfo;
            }
        }
        return null;
    }

    public boolean borrowBook(BookInfo book) {
        return false;
    }

    public boolean repayBook(BookInfo book) {
        return false;
    }
}
