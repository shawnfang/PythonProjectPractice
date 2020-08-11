package com.library.lms.service;

import com.library.lms.pojo.BookInfo;
import com.library.lms.pojo.RecordInfo;
import com.library.lms.pojo.UserInfo;

import java.util.List;

public interface RecordInfoService {
    public boolean addRecordInfo(BookInfo bookInfo, UserInfo userInfo);
    public List<RecordInfo> selectRecord();
}
