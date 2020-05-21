package com.lms.service;

import com.lms.entity.BookInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookInfoService {
    BookInfo getById(int bookId);
    List<BookInfo> getList();

}
