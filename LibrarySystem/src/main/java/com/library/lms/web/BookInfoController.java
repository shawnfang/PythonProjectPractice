package com.library.lms.web;

import com.alibaba.fastjson.JSON;
import com.library.lms.pojo.BookInfo;
import com.library.lms.service.BookInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;


@RestController
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;
    private final static Logger logger = LoggerFactory.getLogger(BookInfoController.class);
    @GetMapping("/book")
    private String list() {
        String bookInfos = bookInfoService.getById(1);
        logger.info("hello,world");
        return bookInfos;
    }

    @GetMapping("/bookinfo")
    private String getBookInfos(){
        Map<String,Object> bookInfo = bookInfoService.getBookInfo(1);
        String bo = JSON.toJSONString(bookInfo);
        return bo;
    }

    @PostMapping("addbook")
    private boolean addBook(@RequestBody Map params){
        boolean addresult = false;
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName((String) params.get("name"));
        bookInfo.setBookAuthor((String) params.get("author"));
        bookInfo.setBookPrice((Integer) params.get("price"));
        bookInfo.setBookPublish((String) params.get("publish"));
        bookInfo.setBookType((String) params.get("type"));
        bookInfo.setBookSum((Integer) params.get("sum"));
        bookInfo.setBookSortId((Integer) params.get("sortid"));
        if (bookInfoService.insertBook(bookInfo)) {
            addresult = true;
        }
        return addresult;
    }
}
