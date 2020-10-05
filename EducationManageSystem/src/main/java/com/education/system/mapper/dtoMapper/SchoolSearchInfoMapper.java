package com.education.system.mapper.dtoMapper;

import com.education.system.dto.SchoolSearchDto;
import com.education.system.entity.eduAccount;
import com.education.system.entity.eduAccountExample;
import com.education.system.entity.eduSchool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolSearchInfoMapper {
    List<eduSchool> searchSchoolInfo(SchoolSearchDto searchSchool);
    List<eduSchool> getSchoolInfoList();
}