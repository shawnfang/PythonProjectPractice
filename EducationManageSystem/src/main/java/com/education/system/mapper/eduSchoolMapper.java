package com.education.system.mapper;

import com.education.system.entity.eduSchool;
import com.education.system.entity.eduSchoolExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface eduSchoolMapper {
    long countByExample(eduSchoolExample example);

    int deleteByExample(eduSchoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduSchool record);

    int insertSelective(eduSchool record);

    List<eduSchool> selectByExample(eduSchoolExample example);

    eduSchool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduSchool record, @Param("example") eduSchoolExample example);

    int updateByExample(@Param("record") eduSchool record, @Param("example") eduSchoolExample example);

    int updateByPrimaryKeySelective(eduSchool record);

    int updateByPrimaryKey(eduSchool record);
}