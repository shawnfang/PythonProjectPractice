package com.education.system.serviceimpl;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSONArray;
import com.education.system.mapper.AccountMapper;
import com.education.system.mapper.SchoolInfoMapper;
import com.education.system.pojo.Account;
import com.education.system.pojo.SchoolInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SchoolInfoServiceImpl {
    @Autowired
    private SchoolInfoMapper schoolInfoMapper;

    @Autowired
    private AccountMapper accountMapper;

    private final static Logger logger = LoggerFactory.getLogger(SchoolInfoServiceImpl.class);

    public List<SchoolInfo> getSchoolInfoList(){
        List<SchoolInfo> schoolInfos = schoolInfoMapper.schoolList();
        logger.info("学校信息列表"+ schoolInfos);
        return schoolInfoMapper.schoolList();
    }

    public String addSchoolInfo(SchoolInfo schoolInfo){
        boolean result = false;
        List<Account> accountList = accountMapper.selectAccount();
        for (Account account: accountList){
            if (account.getAccount().equals(schoolInfo.getAccounts().getAccount())) {
                return "您注册的账号已存在";
            }
        }
        List<SchoolInfo> schoolInfos = schoolInfoMapper.schoolList();
        for (SchoolInfo schoolInfo1:schoolInfos){
            if (schoolInfo1.getSchoolName().equals(schoolInfo.getSchoolName())) {
                return "您注册的学校已存在";
            }
        }
        String convertMD5 = schoolInfo.getAccounts().getPassword();
        schoolInfo.getAccounts().setPassword(SecureUtil.md5(convertMD5));
        schoolInfo.getAccounts().setIdentities(1);
        schoolInfo.getAccounts().setStatus(1);
        accountMapper.addAccount(schoolInfo.getAccounts());
        /**
         * 插入的数据所返回数据是插入的条数，
         * 如果要拿到新插入数据的ID主键的话，
         * 需要到对象中重新获取
         */
        int accountId = schoolInfo.getAccounts().getId();
        logger.info("返回的ID是："+ accountId);
        if (accountId != 0) {
            schoolInfo.setAccountId(accountId);
        }
        schoolInfoMapper.addSchoolInfo(schoolInfo);
        int newSchoolId = schoolInfo.getId();
        String getNewSchool = JSONArray.toJSON(schoolInfoMapper.getSchoolId(newSchoolId)).toString();
        return getNewSchool;
    }

    public boolean updateSchoolInfo(SchoolInfo schoolInfo){
        boolean result = false;
        logger.info("schoolInfo"+ schoolInfo.toString());
        if (schoolInfoMapper.updateSchoolInfo(schoolInfo)) {
            result = true;
        }
        return result;
    }

    public boolean deleteSchool(int id){
        boolean result = false;
        return result;
    }

    public String searchSchool(SchoolInfo schoolInfo){
        return schoolInfoMapper.searchSchoolInfo(schoolInfo);
    }

}
