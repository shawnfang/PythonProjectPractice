package com.edu.system.mapper;

import com.edu.system.entity.eduTeacherRole;
import com.edu.system.entity.eduTeacherRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTeacherRoleMapper {
    long countByExample(eduTeacherRoleExample example);

    int deleteByExample(eduTeacherRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTeacherRole record);

    int insertSelective(eduTeacherRole record);

    List<eduTeacherRole> selectByExample(eduTeacherRoleExample example);

    eduTeacherRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTeacherRole record, @Param("example") eduTeacherRoleExample example);

    int updateByExample(@Param("record") eduTeacherRole record, @Param("example") eduTeacherRoleExample example);

    int updateByPrimaryKeySelective(eduTeacherRole record);

    int updateByPrimaryKey(eduTeacherRole record);
}