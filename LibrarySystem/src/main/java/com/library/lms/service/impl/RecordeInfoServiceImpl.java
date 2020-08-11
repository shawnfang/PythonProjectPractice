package com.library.lms.service.impl;

import com.library.lms.mapper.RecordInfoMapper;
import com.library.lms.pojo.BookInfo;
import com.library.lms.pojo.RecordInfo;
import com.library.lms.pojo.UserInfo;
import com.library.lms.service.RecordInfoService;
import com.library.lms.web.BookInfoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Component
public class RecordeInfoServiceImpl implements RecordInfoService {
    private final static Logger logger = LoggerFactory.getLogger(RecordeInfoServiceImpl.class);

    @Autowired
    private RecordInfoMapper recordInfoMapper;

    @Autowired
    private BookInfo bookInfo;

    @Autowired
    private UserInfo userInfo;

    @Autowired
    private RecordInfo recordInfo;

    @Override
    public boolean addRecordInfo(BookInfo bookInfo, UserInfo userInfo) {
        Boolean result = false;
        Date DateTime= new Date();
        //Timestamp timestamp = new Timestamp(DateTime.getTime());
        BookInfo bookInfoNew = new BookInfo();
        bookInfoNew.setBook_id(bookInfo.getBook_id());
        bookInfoNew.setBook_name(bookInfo.getBook_name());
        bookInfoNew.setBook_author(bookInfo.getBook_author());
        bookInfoNew.setBook_price(bookInfo.getBook_price());
        bookInfoNew.setBook_type(bookInfo.getBook_type());
        bookInfoNew.setBook_publish(bookInfo.getBook_publish());
        bookInfoNew.setBook_mark(bookInfo.getBook_mark());

        UserInfo userInfoNew = new UserInfo();
        userInfoNew.setUser_id(userInfo.getUser_id());
        userInfoNew.setUser_name(userInfo.getUser_name());

        RecordInfo recordInfo = new RecordInfo();
        recordInfo.setUserInfo(userInfoNew);
        recordInfo.setBookInfo(bookInfoNew);
        recordInfo.setRecord_time(DateTime);

        logger.info("RecordeInfo用户名："+ userInfoNew.getUser_name());
        logger.info("RecordeInfo书名："+bookInfoNew.getBook_name());
        if(recordInfoMapper.addRecord(recordInfo)){
            result = true;
        };
        return result;
    }

    @Override
    public List<RecordInfo> selectRecord() {
        return null;
    }
}
