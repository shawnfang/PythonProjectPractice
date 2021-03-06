package com.library.lms.web;

import com.alibaba.fastjson.JSON;
import com.library.lms.pojo.BookSort;
import com.library.lms.service.BookSortService;
import com.library.lms.service.BookSortService;
import com.library.lms.util.ApiResult;
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
    private ApiResult<?> addBookSort(@RequestBody Map params){
        boolean addResult = false;
        BookSort bookSort = new BookSort();
        bookSort.setBook_sort_name((String)params.get("sortname"));
        bookSort.setBook_sort_extend((String)params.get("sortextend"));
        bookSort.setBook_sort_mark((String)params.get("sortmark"));
        if (bookSortService.insertBookSort(bookSort)) {
            addResult = true;
        }
        return ApiResult.newSuccess(addResult);
    }

    @PostMapping("updatebooksort")
    private ApiResult<?> updateBookSort(@RequestBody Map params){
        boolean updateResult = false;
        BookSort bookSort = new BookSort();
        if(params.containsKey("id")){
            bookSort.setBook_sort_id((Integer) params.get("id"));
        }else {
            return ApiResult.newError("参数错误");
        }
        if (params.containsKey("sortname")) {
            bookSort.setBook_sort_name((String)params.get("sortname"));
        }
        if (params.containsKey("sortextend")) {
            bookSort.setBook_sort_extend((String)params.get("sortextend"));
        }
        if(params.containsKey("sortmark")){
            bookSort.setBook_sort_mark((String)params.get("sortmark"));
        }
        if(bookSortService.updateBookSort(bookSort)){
            updateResult = true;
        }
        return ApiResult.newSuccess(updateResult);
    }

    @GetMapping("getbooksort/{id}")
    private ApiResult<?> getbooksort(@PathVariable("id") int id){
        BookSort bookSort = bookSortService.getBookSortId(id);
        String jsonObj = JSON.toJSONString(bookSort);
        if (bookSort == null) {
            return ApiResult.newError("没找到对应类目");
        }else {
            return ApiResult.newSuccess(jsonObj);
        }
    }

    @DeleteMapping("deletebooksort/{id}")
    private ApiResult<?> deletebooksort(@PathVariable("id") int id){
        if(bookSortService.deleteBookSort(id)){
            return ApiResult.newSuccess(true);
        }else {
            return ApiResult.newError("删除失败");
        }
    }

    @GetMapping("booksortlist")
    private ApiResult<?> booksortlist(){
        List<BookSort> bookSorts = bookSortService.selectBookSort();
        return ApiResult.newSuccess(bookSorts);
    }

}