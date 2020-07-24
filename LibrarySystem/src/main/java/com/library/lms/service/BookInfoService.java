package com.library.lms.service;

import com.library.lms.pojo.BookInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookInfoService {
    BookInfo getById(int bookId);

    List<BookInfo> getList();

}
