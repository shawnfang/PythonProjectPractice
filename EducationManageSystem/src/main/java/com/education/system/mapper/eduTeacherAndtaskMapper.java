package com.education.system.mapper;

import com.education.system.entity.eduTeacherAndtask;
import com.education.system.entity.eduTeacherAndtaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTeacherAndtaskMapper {
    long countByExample(eduTeacherAndtaskExample example);

    int deleteByExample(eduTeacherAndtaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTeacherAndtask record);

    int insertSelective(eduTeacherAndtask record);

    List<eduTeacherAndtask> selectByExample(eduTeacherAndtaskExample example);

    eduTeacherAndtask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTeacherAndtask record, @Param("example") eduTeacherAndtaskExample example);

    int updateByExample(@Param("record") eduTeacherAndtask record, @Param("example") eduTeacherAndtaskExample example);

    int updateByPrimaryKeySelective(eduTeacherAndtask record);

    int updateByPrimaryKey(eduTeacherAndtask record);
}