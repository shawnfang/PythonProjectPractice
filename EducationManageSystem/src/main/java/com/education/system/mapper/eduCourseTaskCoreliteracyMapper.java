package com.education.system.mapper;

import com.education.system.entity.eduCourseTaskCoreliteracy;
import com.education.system.entity.eduCourseTaskCoreliteracyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduCourseTaskCoreliteracyMapper {
    long countByExample(eduCourseTaskCoreliteracyExample example);

    int deleteByExample(eduCourseTaskCoreliteracyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduCourseTaskCoreliteracy record);

    int insertSelective(eduCourseTaskCoreliteracy record);

    List<eduCourseTaskCoreliteracy> selectByExample(eduCourseTaskCoreliteracyExample example);

    eduCourseTaskCoreliteracy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduCourseTaskCoreliteracy record, @Param("example") eduCourseTaskCoreliteracyExample example);

    int updateByExample(@Param("record") eduCourseTaskCoreliteracy record, @Param("example") eduCourseTaskCoreliteracyExample example);

    int updateByPrimaryKeySelective(eduCourseTaskCoreliteracy record);

    int updateByPrimaryKey(eduCourseTaskCoreliteracy record);
}