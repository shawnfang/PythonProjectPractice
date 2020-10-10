package com.education.system.web;

import cn.hutool.core.lang.Assert;
import com.alibaba.fastjson.JSON;
import com.education.system.dto.SchoolInfoDto;
import com.education.system.dto.SchoolSearchDto;
import com.education.system.mapper.eduSchoolMapper;
import com.education.system.serviceimpl.SchoolInfoServiceImpl;
import com.education.system.util.ApiResult;
import com.education.system.util.PhoneFormatCheckUtils;
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

    @Autowired
    private eduSchoolMapper eduSchoolMapper;

    private final static Logger logger = LoggerFactory.getLogger(SchoolController.class);

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/delschool/{id}")
    private ApiResult<?> delete(@PathVariable("id") int id){
        schoolInfoService.deleteSchool(id);
        return ApiResult.newSuccess();

    }

    @GetMapping("/schoollist")
    private ApiResult<?> schoollist(){
        if (schoolInfoService.getSchoolInfoList().isEmpty()) {
            return ApiResult.newError("该系统还没有学校信息");
        }
        return ApiResult.newSuccess(schoolInfoService.getSchoolInfoList());
    }

    @PostMapping("/addschool")
    private ApiResult<?> addschool(@RequestBody SchoolInfoDto params){
        logger.info("test1:"+JSON.toJSONString(params));
        logger.info("test2:"+JSON.toJSONString(params.getAccounts().getAccount()));
        logger.info("test3:"+JSON.toJSONString(params.getAccounts().getPassword()));
        return ApiResult.newSuccess(schoolInfoService.addSchoolInfo(params));
    }

    @PostMapping("/updateschool")
    private ApiResult<?> updateschool(@RequestBody SchoolInfoDto schoolInfo){
        if((eduSchoolMapper.selectByPrimaryKey(schoolInfo.getId()).getId() != schoolInfo.getId())){
            return ApiResult.newError("参数或者ID不能为空");
        }
        if (!PhoneFormatCheckUtils.isChinaPhoneLegal(schoolInfo.getSchoolPhone())) {
            return ApiResult.newError("电话号码参数非法");
        }
        return ApiResult.newSuccess(schoolInfoService.updateSchoolInfo(schoolInfo));
    }

    @PostMapping("/searchschool")
    private ApiResult<?> searchschool(@RequestBody SchoolSearchDto params){
        if (params.getSchoolName() != null) {
            if (!(params.getSchoolName() instanceof String)) {
                return ApiResult.newError("学校名称字符类型错误");
            }
        }
        if (params.getSchoolContactor() != null ) {
            if (!(params.getSchoolContactor() instanceof String)) {
                return ApiResult.newError("学校联系人字符类型错误");
            }
        }
        return ApiResult.newSuccess(schoolInfoService.searchSchool(params));
    }
}
