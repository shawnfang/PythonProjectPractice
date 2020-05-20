package com.lms.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lms.dao.BaseTest;
import com.lms.entity.BookInfo;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testGetBookId() throws Exception {
        int bookId = 1000;
        BookInfo book = bookDao.getBookId(bookId);
        System.out.println(book);
    }

    @Test
    public void testSelectBook() throws Exception {
        List<BookInfo> books = bookDao.selectBook(1, 4);
        for (BookInfo book : books) {
            System.out.println(book);
        }
    }


}
