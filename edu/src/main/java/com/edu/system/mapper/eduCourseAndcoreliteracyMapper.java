package com.edu.system.mapper;

import com.edu.system.entity.eduCourseAndcoreliteracy;
import com.edu.system.entity.eduCourseAndcoreliteracyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduCourseAndcoreliteracyMapper {
    long countByExample(eduCourseAndcoreliteracyExample example);

    int deleteByExample(eduCourseAndcoreliteracyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduCourseAndcoreliteracy record);

    int insertSelective(eduCourseAndcoreliteracy record);

    List<eduCourseAndcoreliteracy> selectByExample(eduCourseAndcoreliteracyExample example);

    eduCourseAndcoreliteracy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduCourseAndcoreliteracy record, @Param("example") eduCourseAndcoreliteracyExample example);

    int updateByExample(@Param("record") eduCourseAndcoreliteracy record, @Param("example") eduCourseAndcoreliteracyExample example);

    int updateByPrimaryKeySelective(eduCourseAndcoreliteracy record);

    int updateByPrimaryKey(eduCourseAndcoreliteracy record);
}