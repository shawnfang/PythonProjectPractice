package com.education.system.mapper;

import com.education.system.entity.eduClassroom;
import com.education.system.entity.eduClassroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduClassroomMapper {
    long countByExample(eduClassroomExample example);

    int deleteByExample(eduClassroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduClassroom record);

    int insertSelective(eduClassroom record);

    List<eduClassroom> selectByExample(eduClassroomExample example);

    eduClassroom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduClassroom record, @Param("example") eduClassroomExample example);

    int updateByExample(@Param("record") eduClassroom record, @Param("example") eduClassroomExample example);

    int updateByPrimaryKeySelective(eduClassroom record);

    int updateByPrimaryKey(eduClassroom record);
}