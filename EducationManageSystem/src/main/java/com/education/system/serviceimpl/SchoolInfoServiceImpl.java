package com.education.system.serviceimpl;

import com.education.system.mapper.SchoolInfoMapper;
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

    private final static Logger logger = LoggerFactory.getLogger(SchoolInfoServiceImpl.class);

    public String getSchoolInfoList(){
        return schoolInfoMapper.schoolList();
    }

    public boolean addSchoolInfo(SchoolInfo schoolInfo){
        boolean result = false;
        schoolInfoMapper.addSchoolInfo(schoolInfo);
        return result;
    }

    public boolean updateSchoolInfo(SchoolInfo schoolInfo){
        boolean result = false;
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
