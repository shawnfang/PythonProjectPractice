package com.library.lms.web;

import com.library.lms.pojo.BookInfo;
import com.library.lms.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;

    @GetMapping("/book")
    private BookInfo list() {
        /*
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookId(1);
        bookInfo.setBookName("test");
        bookInfo.setBookPrice(10.0);

         */
        BookInfo bookInfos = bookInfoService.getById(1);
        return bookInfos;
    }
}
