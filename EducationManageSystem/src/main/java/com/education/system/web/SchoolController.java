package com.education.system.web;


import com.education.system.pojo.Account;
import com.education.system.pojo.SchoolInfo;
import com.education.system.serviceimpl.AccountServiceImpl;
import com.education.system.serviceimpl.SchoolInfoServiceImpl;
import com.education.system.util.ApiResult;
import com.education.system.util.PhoneFormatCheckUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
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
        String deleteResult = schoolInfoService.deleteSchool(id);
        return ApiResult.newSuccess(deleteResult);

    }

    @GetMapping("/schoollist")
    private ApiResult<?> schoollist(){
        if (schoolInfoService.getSchoolInfoList().isEmpty()) {
            return ApiResult.newError("该系统还没有学校信息");
        }
        return ApiResult.newSuccess(schoolInfoService.getSchoolInfoList());
    }

    @PostMapping("/addschool")
    private ApiResult<?> addschool(@RequestBody Map params){
        if(params.isEmpty()){
            return ApiResult.newError("参数为空");
        }
        SchoolInfo schoolInfo = new SchoolInfo();
        Account account = new Account();
        if (params.containsKey("schoolName")) {
            if(params.get("schoolName") instanceof String){
                if (params.get("schoolName").toString().length() <= 0 || params.get("schoolName").toString().length() > 20) {
                    return ApiResult.newError("学校名称参数长度非法");
                }
                schoolInfo.setSchoolName((String)params.get("schoolName"));
            }else {
                return ApiResult.newError("学校名称参数类型错误");
            }
        }else{
            return ApiResult.newError("学校名称不能为空");
        }
        if (params.containsKey("schoolContector")) {
            if (params.get("schoolContector") instanceof String) {
                if (params.get("schoolContector").toString().length() <= 0 || params.get("schoolContector").toString().length() > 10) {
                    return ApiResult.newError("学校联系人参数长度非法");
                }
                schoolInfo.setSchoolContactor((String)params.get("schoolContector"));
            }else {
                return ApiResult.newError("学校联系人参数类型错误");
            }
        }else{
            return ApiResult.newError("学校联系人不能为空");
        }
        if (params.containsKey("schoolPhone")) {
            if (!PhoneFormatCheckUtils.isChinaPhoneLegal((String)params.get("schoolPhone"))) {
                return ApiResult.newError("电话号码参数非法");
            }
            schoolInfo.setSchoolPhone((String)params.get("schoolPhone"));
        }else{
            return ApiResult.newError("联系人电话不能为空");
        }
        if (params.containsKey("account")) {
            if (params.get("account") instanceof String) {
                if (params.get("account").toString().length() <= 0 || params.get("account").toString().length() > 10) {
                    return ApiResult.newError("学校账号参数长度非法");
                }
                account.setAccount((String)params.get("account"));
            }else {
                return ApiResult.newError("学校账号参数类型错误");
            }
        }else{
            return ApiResult.newError("学校登录账号不能为空");
        }
        if (params.containsKey("password")) {
            if (params.get("password") instanceof String) {
                if (params.get("password").toString().length() <= 0 || params.get("password").toString().length() > 10) {
                    return ApiResult.newError("密码参数长度非法");
                }
                account.setPassword((String)params.get("password"));
            }else {
                return ApiResult.newError("密码参数类型错误");
            }
        }else{
            return ApiResult.newError("密码不能为空");
        }
        schoolInfo.setAccounts(account);
        schoolInfo.setStatus(true);
        return ApiResult.newSuccess(schoolInfoService.addSchoolInfo(schoolInfo));
    }

    @PostMapping("/updateschool")
    private ApiResult<?> updateschool(@RequestBody SchoolInfo schoolInfo){
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
    private ApiResult<?> searchschool(@RequestBody Map params){
        if(params.isEmpty()){
            return ApiResult.newError("参数为空");
        }
        SchoolInfo schoolInfo = new SchoolInfo();
        if (params.get("schoolName") != null) {
            if ((String)params.get("schoolName") instanceof String) {
                schoolInfo.setSchoolName((String)params.get("schoolName"));
            }else {
                return ApiResult.newError("学校名称字符类型错误");
            }
        }
        if (params.get("schoolContector") != null) {
            if ((String)params.get("schoolContector") instanceof String) {
                schoolInfo.setSchoolContactor((String)params.get("schoolContector"));
            }else {
                return ApiResult.newError("学校联系人字符类型错误");
            }
        }

        return ApiResult.newSuccess(schoolInfoService.searchSchool(schoolInfo));
    }
}
