package com.library.lms.web;

import com.alibaba.fastjson.JSON;
import com.library.lms.pojo.BookInfo;
import com.library.lms.service.BookInfoService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;
    private final static Logger logger = LoggerFactory.getLogger(BookInfoController.class);
    @GetMapping("/book/{id}")
    private String getId(@PathVariable("id") int id) {
        BookInfo bookInfos = bookInfoService.getById(id);
        String jsonObj = JSON.toJSONString(bookInfos);
        if (bookInfos == null) {
            return "没有找到对应的书籍";
        }else {
            return jsonObj;
        }
    }

    @GetMapping("/bookinfo")
    private String getBookInfos(){
        Map<String,Object> bookInfo = bookInfoService.getBookInfo(1);
        String bo = JSON.toJSONString(bookInfo);
        return bo;
    }

    @PostMapping("/addbook")
    private boolean addBook(@RequestBody Map params){
        boolean addresult = false;
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBook_name((String) params.get("name"));
        bookInfo.setBook_author((String) params.get("author"));
        bookInfo.setBook_price((Integer) params.get("price"));
        bookInfo.setBook_publish((String) params.get("publish"));
        bookInfo.setBook_type((String) params.get("type"));
        bookInfo.setBook_sum((Integer) params.get("sum"));
        bookInfo.setBook_sort_id((Integer) params.get("sortid"));
        if (bookInfoService.insertBook(bookInfo)) {
            addresult = true;
        }
        return addresult;
    }

    @GetMapping("/booklist")
    private List booklist(){
        List<BookInfo> bookInfos = bookInfoService.selectBook();
        logger.info("bookinfos"+ bookInfos.get(0).toString());
        return bookInfos;
    }
}
