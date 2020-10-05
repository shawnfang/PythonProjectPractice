package com.education.system.web;

import com.alibaba.fastjson.JSON;
import com.education.system.dto.SchoolInfoDto;
import com.education.system.dto.SchoolSearchDto;
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
        if(params.getSchoolName() == null || (!(params.getSchoolName() instanceof String))){
            return ApiResult.newError("学校名称非法");
        }
        if(params.getSchoolContactor() == null || (!(params.getSchoolContactor() instanceof String))){
            return ApiResult.newError("学校联系人字段非法");
        }
        if (params.getSchoolPhone() == null || (!(params.getSchoolPhone() instanceof String))) {
            return ApiResult.newError("学校联系方式非法");
        }
        if (params.getAccounts().getAccount() == null || (!(params.getAccounts().getAccount() instanceof String))) {
            return ApiResult.newError("学校注册用户名非法");
        }
        if (params.getAccounts().getPassword() == null || (!(params.getAccounts().getPassword() instanceof String))) {
            return ApiResult.newError("学校注册密码非法");
        }
        return ApiResult.newSuccess(schoolInfoService.addSchoolInfo(params));
    }

    @PostMapping("/updateschool")
    private ApiResult<?> updateschool(@RequestBody SchoolInfoDto schoolInfo){
        if(schoolInfo.getId() == 0){
            return ApiResult.newError("参数或者ID不能为空");
        }
        if (schoolInfo.getSchoolName() != null) {
            if(schoolInfo.getSchoolName() instanceof String){
                if (schoolInfo.getSchoolName().length() <= 0 || schoolInfo.getSchoolName().length() > 20) {
                    return ApiResult.newError("学校名称参数长度非法");
                }
            }else {
                return ApiResult.newError("学校名称参数类型错误");
            }
        }
        if (schoolInfo.getSchoolContactor() != null) {
            if (schoolInfo.getSchoolContactor() instanceof String) {
                if (schoolInfo.getSchoolContactor().length() <= 0 || schoolInfo.getSchoolContactor().length() > 10) {
                    return ApiResult.newError("学校联系人参数长度非法");
                }
            }else {
                return ApiResult.newError("学校联系人参数类型错误");
            }
        }
        if (schoolInfo.getSchoolPhone() != null) {
            if (!PhoneFormatCheckUtils.isChinaPhoneLegal(schoolInfo.getSchoolPhone())) {
                return ApiResult.newError("电话号码参数非法");
            }
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
