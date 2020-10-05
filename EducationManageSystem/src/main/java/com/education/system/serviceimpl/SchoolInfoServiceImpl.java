package com.education.system.serviceimpl;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.education.system.dto.SchoolInfoDto;
import com.education.system.dto.SchoolSearchDto;
import com.education.system.entity.eduAccount;
import com.education.system.entity.eduAccountExample;
import com.education.system.entity.eduSchool;
import com.education.system.entity.eduSchoolExample;
import com.education.system.mapper.dtoMapper.AccountDtoMapper;
import com.education.system.mapper.dtoMapper.SchoolSearchInfoMapper;
import com.education.system.mapper.dtoMapper.SchoolInfoDtoMapper;
import com.education.system.mapper.eduAccountMapper;
import com.education.system.mapper.eduSchoolMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolInfoServiceImpl {
    @Autowired
    private eduSchoolMapper eduSchoolMapper;

    @Autowired
    private eduAccountMapper eduAccountMapper;

    @Autowired
    private AccountDtoMapper accountDtoMapper;

    @Autowired
    private SchoolSearchInfoMapper schoolSearchInfoMapper;

    @Autowired
    private SchoolInfoDtoMapper schoolInfoDtoMapper;

    private final static Logger logger = LoggerFactory.getLogger(SchoolInfoServiceImpl.class);

    public List<eduSchool> getSchoolInfoList(){
        List<eduSchool> schoolInfos = schoolSearchInfoMapper.getSchoolInfoList();
        return schoolInfos;
    }

    public boolean addSchoolInfo(SchoolInfoDto schoolInfo){
        boolean result = false;
        eduAccountExample eduAccountExample = new eduAccountExample();
        eduAccountExample.Criteria criteria = eduAccountExample.createCriteria();
        criteria.andAccountIsNotNull();
        List<eduAccount> accountList = eduAccountMapper.selectByExample(eduAccountExample);
        for (eduAccount account: accountList){
            if (account.getAccount().equals(schoolInfo.getAccounts().getAccount())) {
                return result;
            }
        }
        eduSchoolExample eduSchoolExample = new eduSchoolExample();
        eduSchoolExample.Criteria criteria1 = eduSchoolExample.createCriteria();
        criteria1.andSchoolNameIsNotNull();
        List<eduSchool> schoolInfos = eduSchoolMapper.selectByExample(eduSchoolExample);
        for (eduSchool schoolInfo1:schoolInfos){
            if (schoolInfo1.getSchoolName().equals(schoolInfo.getSchoolName())) {
                return result;
            }
        }
        eduAccount eduAccount = new eduAccount();
        eduAccount.setAccount(schoolInfo.getAccounts().getAccount());
        String convertMD5 = schoolInfo.getAccounts().getPassword();
        eduAccount.setPassword(SecureUtil.md5(convertMD5));
        eduAccount.setIdentities(1);
        eduAccount.setStatus(1);
        logger.info("插入的账号信息："+ JSON.toJSONString(eduAccount));
        accountDtoMapper.insertAccount(eduAccount);
        /**
         * 插入的数据所返回数据是插入的条数，
         * 如果要拿到新插入数据的ID主键的话，
         * 需要到对象中重新获取
         */
        int accountId = eduAccount.getId();
        logger.info("返回的ID是："+ accountId);
        if (accountId != 0) {
            schoolInfo.setAccountId(accountId);
            schoolInfo.setStatus(true);
        }
        schoolInfoDtoMapper.insert(schoolInfo);
        int newSchoolId = schoolInfo.getId();
        String getNewSchool = JSONArray.toJSON(eduSchoolMapper.selectByPrimaryKey(newSchoolId)).toString();
        logger.info("新插入的学校信息："+getNewSchool);
        return true;
    }

    public boolean updateSchoolInfo(SchoolInfoDto schoolInfo){
        boolean result = false;
        logger.info("schoolInfo"+ schoolInfo.toString());
        eduSchoolMapper.updateByPrimaryKeySelective(schoolInfo);
        return result;
    }

    public void deleteSchool(int id) {
        eduSchoolMapper.deleteByPrimaryKey(id);
    }

    public String searchSchool(SchoolSearchDto schoolInfo){
        logger.info("传入的查询信息："+ schoolInfo.toString());
        JSONArray searchResult = JSONArray.parseArray(JSON.toJSONString(schoolSearchInfoMapper.searchSchoolInfo(schoolInfo)));
        logger.info("查询的学校信息："+ searchResult);
        return searchResult.toJSONString();
    }

}
