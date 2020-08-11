package com.library.lms.web;

import com.alibaba.fastjson.JSON;
import com.library.lms.pojo.BookInfo;
import com.library.lms.service.BookInfoService;
import com.library.lms.util.TokenUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@RestController
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;
    private final static Logger logger = LoggerFactory.getLogger(BookInfoController.class);

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/deletebook/{id}")
    private Boolean deleteId(@PathVariable("id") int id) {
        boolean deleteResult = bookInfoService.deleteBook(id);
        if (deleteResult) {
            return true;
        }else {
            return false;
        }
    }

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

    @RequestMapping("/borrowbook")
    private String borrowBook(@RequestBody Map params){
        BookInfo bookInfo = new BookInfo();
        if(params.containsKey("id")){
            bookInfo.setBook_id((Integer) params.get("id"));
        }else {
            return "没有该ID的书籍可以借阅";
        }
        if(!params.containsKey("borrow")){
            return "参数错误";
        }
        if (bookInfoService.borrowBook(bookInfo)) {
            return "借阅成功";
        }else {
            return  "借阅失败";
        }
    }

    @RequestMapping("/repaybook")
    private String repayBook(@RequestBody Map params){
        BookInfo bookInfo = new BookInfo();
        if(params.containsKey("id")){
            bookInfo.setBook_id((Integer) params.get("id"));
        }else {
            return "没有该ID的书籍需要归还";
        }
        if(!params.containsKey("repay")){
            return "参数错误";
        }
        if (bookInfoService.repayBook(bookInfo)) {
            return "归还成功";
        }else {
            return  "归还失败";
        }
    }


    @PostMapping("/updatebook")
    private boolean updateBook(@RequestBody Map params){
        boolean updateResult = false;
        BookInfo bookInfo = new BookInfo();
        if(params.containsKey("id")){
            bookInfo.setBook_id((Integer) params.get("id"));
        }else {
            return false;
        }
        if(params.containsKey("name")){
            bookInfo.setBook_name((String) params.get("name"));
        }
        if(params.containsKey("author")){
            bookInfo.setBook_author((String) params.get("author"));
        }
        if(params.containsKey("price")){
            bookInfo.setBook_price((Integer) params.get("price"));
        }
        if(params.containsKey("publish")){
            bookInfo.setBook_publish((String) params.get("publish"));
        }
        if(params.containsKey("type")){
            bookInfo.setBook_type((String) params.get("type"));
        }
        if(params.containsKey("sum")){
            bookInfo.setBook_sum((Integer) params.get("sum"));
        }
        if (bookInfoService.updateBook(bookInfo)) {
            updateResult = true;
        }
        return updateResult;
    }

    @GetMapping("/booklist")
    private List booklist(){
        String token = request.getHeader("token");
        String username = TokenUtil.parseToken(token);
        logger.info("用户名："+username);
        List<BookInfo> bookInfos = bookInfoService.selectBook();
        logger.info("bookinfos"+ bookInfos.get(0).toString());
        return bookInfos;
    }
}
