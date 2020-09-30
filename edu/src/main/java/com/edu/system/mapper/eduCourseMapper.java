package com.edu.system.mapper;

import com.edu.system.entity.eduCourse;
import com.edu.system.entity.eduCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduCourseMapper {
    long countByExample(eduCourseExample example);

    int deleteByExample(eduCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduCourse record);

    int insertSelective(eduCourse record);

    List<eduCourse> selectByExample(eduCourseExample example);

    eduCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduCourse record, @Param("example") eduCourseExample example);

    int updateByExample(@Param("record") eduCourse record, @Param("example") eduCourseExample example);

    int updateByPrimaryKeySelective(eduCourse record);

    int updateByPrimaryKey(eduCourse record);
}