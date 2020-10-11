package com.education.system.web;


import com.education.system.dto.StuClassDto;
import com.education.system.dto.StuGradeDto;
import com.education.system.serviceimpl.GradeWithClassServiceImpl;
import com.education.system.util.ApiResult;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;

import java.util.Map;

@RestController
public class GradeWithClassController {
    @Autowired
    private StuGradeDto stuGradeDto;
    @Autowired
    private GradeWithClassServiceImpl gradeWithClassService;
    private final static Logger logger = LoggerFactory.getLogger(GradeWithClassController.class);

    @PostMapping("/addGrade")
    public ApiResult<?> addGrade(@RequestBody StuGradeDto stuClass){
        gradeWithClassService.addGrade(stuClass);
        return ApiResult.newSuccess();
    }

    @PostMapping("/updateGrade")
    public ApiResult<?> updateGrade(@RequestBody StuGradeDto stuClass){
        gradeWithClassService.updateGrade(stuClass);
        return ApiResult.newSuccess();
    }

    @PostMapping("/deleteGrade")
    public ApiResult<?> deleteGrade(@RequestParam Map<String,Integer> params){
        gradeWithClassService.deleteGrade(params.get("id"));
        return ApiResult.newSuccess();
    }



}
