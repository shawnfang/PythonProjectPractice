package com.library.lms.web;

import com.alibaba.fastjson.JSON;
import com.library.lms.mapper.BookInfoMapper;
import com.library.lms.pojo.BookInfo;
import com.library.lms.service.BookInfoService;
import com.library.lms.util.ApiResult;
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

    @Autowired
    private BookInfoMapper bookInfoMapper;

    private final static Logger logger = LoggerFactory.getLogger(BookInfoController.class);

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/deletebook/{id}")
    private ApiResult<?> deleteId(@PathVariable("id") int id) {
        boolean deleteResult = bookInfoService.deleteBook(id);
        if (deleteResult) {
            return ApiResult.newSuccess(true);
        }else {
            return ApiResult.newError("删除失败");
        }
    }

    @GetMapping("/book/{id}")
    private ApiResult<?> getId(@PathVariable("id") int id) {
        BookInfo bookInfos = bookInfoService.getById(id);
        String jsonObj = JSON.toJSONString(bookInfos);
        if (bookInfos == null) {
            return ApiResult.newError("没有找到对应的书籍");
        }else {
            return ApiResult.newSuccess(jsonObj);
        }
    }

    @GetMapping("/bookinfo")
    private ApiResult<?> getBookInfos(){
        Map<String,Object> bookInfo = bookInfoService.getBookInfo(1);
        String bo = JSON.toJSONString(bookInfo);
        return ApiResult.newSuccess(bo);
    }

    @PostMapping("/addbook")
    private ApiResult<?> addBook(@RequestBody Map params){
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
        return ApiResult.newSuccess(addresult);
    }

    @RequestMapping("/borrowbook")
    private ApiResult<?> borrowBook(@RequestBody Map params){
        BookInfo bookInfo = new BookInfo();
        if(params.containsKey("id")){
            bookInfo.setBook_id((Integer) params.get("id"));
        }else {
            return ApiResult.newError("没有该ID的书籍可以借阅");
        }
        if(!params.containsKey("borrow")){
            return ApiResult.newError("参数错误");
        }
        if (bookInfoService.borrowBook(bookInfo)) {
            return ApiResult.newSuccess("借阅成功");
        }else {
            return  ApiResult.newSuccess("借阅失败");
        }
    }

    @RequestMapping("/repaybook")
    private ApiResult<?> repayBook(@RequestBody Map params){
        BookInfo bookInfo = new BookInfo();
        if(params.containsKey("id")){
            bookInfo.setBook_id((Integer) params.get("id"));
        }else {
            return ApiResult.newError("没有该ID的书籍需要归还");
        }
        if(!params.containsKey("repay")){
            return ApiResult.newError("参数错误");
        }
        if (bookInfoService.repayBook(bookInfo)) {
            return ApiResult.newSuccess("归还成功");
        }else {
            return  ApiResult.newSuccess("归还失败");
        }
    }


    @PostMapping("/updatebook")
    private ApiResult<?> updateBook(@RequestBody Map params){
        boolean updateResult = false;
        BookInfo bookInfo = new BookInfo();
        if(params.containsKey("id")){
            bookInfo.setBook_id((Integer) params.get("id"));
        }else {
            return ApiResult.newError("参数错误");
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
        BookInfo uBookInfo = bookInfoMapper.getBookId(bookInfo.getBook_id());
        logger.info("controller时间："+uBookInfo.getUpdate_date());
        bookInfo.setUpdate_date(uBookInfo.getUpdate_date());
        if (bookInfoService.updateBook(bookInfo)) {
            updateResult = true;
        }
        return ApiResult.newSuccess(updateResult);
    }

    @GetMapping("/booklist")
    private ApiResult<?> booklist(){
        String token = request.getHeader("token");
        String username = TokenUtil.parseToken(token);
        logger.info("用户名："+username);
        List<BookInfo> bookInfos = bookInfoService.selectBook();
        logger.info("bookinfos"+ bookInfos.get(0).toString());
        return ApiResult.newSuccess(bookInfos);
    }
}
