package com.lms.dao;

import java.util.List;

import com.lms.entity.BookInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lms.BaseTest;

public class BookInfoDaoTest extends BaseTest {

    @Autowired
    private BookInfoDao bookInfoDao;

    @Test
    public void testGetBookId() throws Exception {
        int bookId = 3;
        BookInfo book = bookInfoDao.getBookId(bookId);
        System.out.println(book);
    }

    @Test
    public void testSelectBook() throws Exception {
        List<BookInfo> books = bookInfoDao.selectBook( 4);
        for (BookInfo book : books) {
            System.out.println(book);
        }
    }


}
