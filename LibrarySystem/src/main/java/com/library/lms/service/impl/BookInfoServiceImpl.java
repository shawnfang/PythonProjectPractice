package com.library.lms.service.impl;

import com.library.lms.mapper.UserInfoMapper;
import com.library.lms.pojo.BookInfo;
import com.library.lms.mapper.BookInfoMapper;
import com.library.lms.pojo.UserInfo;
import com.library.lms.service.BookInfoService;
import com.library.lms.service.RecordInfoService;
import com.library.lms.util.UserRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.sql.Timestamp;

@Service("bookInfoService")
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RecordInfoService recordInfoService;

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
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        book.setUpdate_date(timestamp);
        return bookInfoMapper.addBook(book);
    }

    public List<BookInfo> selectBook() {
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        return bookInfos;
    }

    public boolean deleteBook(int bookId) {
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        for (BookInfo bookInfo:bookInfos){
            if (bookInfo.getBook_id() == bookId) {
                return bookInfoMapper.deleteBook(bookId);
            }
        }
        return false;
    }

    public boolean updateBook(BookInfo book) {
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        logger.info("数量："+bookInfos.size());
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        for (BookInfo bookInfo:bookInfos){
            if (bookInfo.getBook_id() == book.getBook_id()) {
                if (bookInfo.getUpdate_date().equals(book.getUpdate_date())) {
                    book.setUpdate_date(timestamp);
                    return bookInfoMapper.updateBook(book);
                }else {
                    System.out.println("该订单已经被其他线程修改");
                    logger.info("这里返回0");
                    return false;
                }
            }
        }
        logger.info("这里返回2");
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
        boolean borrowResult = false;
        BookInfo selectBookId = bookInfoMapper.getBookId(book.getBook_id());
        if(selectBookId.getBook_sum()<0){
            return borrowResult;
        }
        int bookTotal = selectBookId.getBook_sum()-1;
        book.setBook_sum(bookTotal);
        String username = UserRequest.getCurrentUser();
        UserInfo userInfoNew = new UserInfo();
        List<UserInfo> userInfos = userInfoMapper.selectUser();
        for (UserInfo userInfo:userInfos){
            if (userInfo.getUser_name().equals(username)) {
                userInfoNew.setUser_name(username);
                userInfoNew.setUser_id(userInfo.getUser_id());
            }
        }
        logger.info("token解析的用户名："+username);
        logger.info("用户名："+userInfoNew.getUser_name());
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        for (BookInfo bookInfo:bookInfos){
            if ((bookInfo.getBook_id() == book.getBook_id())) {
                    if(bookInfoMapper.updateBook(book)){
                        borrowResult = true;
                        recordInfoService.addRecordInfo(bookInfo,userInfoNew);
                    }
                }
            }
        return borrowResult;
    }

    public boolean repayBook(BookInfo book) {
        boolean repayResult = false;
        BookInfo selectBookId = bookInfoMapper.getBookId(book.getBook_id());
        int bookTotal = selectBookId.getBook_sum()+1;
        book.setBook_sum(bookTotal);
        String username = UserRequest.getCurrentUser();
        UserInfo userInfoNew = new UserInfo();
        List<UserInfo> userInfos = userInfoMapper.selectUser();
        for (UserInfo userInfo:userInfos){
            if (userInfo.getUser_name().equals(username)) {
                userInfoNew.setUser_name(username);
                userInfoNew.setUser_id(userInfo.getUser_id());
            }
        }
        List<BookInfo> bookInfos = bookInfoMapper.selectBook();
        for (BookInfo bookInfo:bookInfos){
            if ((bookInfo.getBook_id() == book.getBook_id())) {
                if(bookInfoMapper.updateBook(book)){
                    repayResult = true;
                    recordInfoService.addRecordInfo(bookInfo,userInfoNew);
                }
            }
        }
        return repayResult;
    }
}
