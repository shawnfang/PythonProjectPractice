package com.library.lms.web;

import com.alibaba.fastjson.JSON;
import com.library.lms.pojo.BookSort;
import com.library.lms.service.BookSortService;
import com.library.lms.service.BookSortService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class BookSortController {
    @Autowired
    private BookSortService bookSortService;
    private final static Logger logger = LoggerFactory.getLogger(BookSortController.class);

    @PostMapping("/addbooksort")
    private boolean addBookSort(@RequestBody Map params){
        return true;
    }

    @PostMapping("updatebooksort")
    private boolean updateBookSort(@RequestBody Map params){
        return true;
    }

    @GetMapping("getbooksort/{id}")
    private String getbooksort(){
        return null;
    }

    @DeleteMapping("deletebooksort/{id}")
    private boolean deletebooksort(){
        return false;
    }

    @GetMapping("booksortlist")
    private List booksortlist(){
        return null;
    }

}