package com.education.system.web;


import com.education.system.serviceimpl.SchoolInfoServiceImpl;
import com.education.system.util.ApiResult;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class SchoolController {
    @Autowired
    private SchoolInfoServiceImpl schoolInfoService;
    private final static Logger logger = LoggerFactory.getLogger(SchoolController.class);

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/delschool/{id}")
    private ApiResult<?> delete(@PathVariable("id") int id){
        boolean deleteResult = schoolInfoService.deleteSchool(id);
        if (deleteResult) {
            return ApiResult.newSuccess(true);
        }else {
            return ApiResult.newError("删除失败");
        }
    }

    @GetMapping("/schooollist")
    private ApiResult<?> schoollist(){
        return ApiResult.newSuccess();
    }

    @PostMapping("/addschool")
    private ApiResult<?> addschool(@RequestBody Map params){
        return ApiResult.newSuccess();
    }

    @PostMapping("/updateschool")
    private ApiResult<?> updateschool(@RequestBody Map params){
        return ApiResult.newSuccess();
    }

    @PostMapping("searchschool")
    private ApiResult<?> searchschool(@RequestBody Map params){
        return ApiResult.newSuccess();
    }
}
