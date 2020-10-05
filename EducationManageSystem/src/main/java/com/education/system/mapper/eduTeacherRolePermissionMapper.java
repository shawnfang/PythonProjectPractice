package com.education.system.mapper;

import com.education.system.entity.eduTeacherRolePermission;
import com.education.system.entity.eduTeacherRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTeacherRolePermissionMapper {
    long countByExample(eduTeacherRolePermissionExample example);

    int deleteByExample(eduTeacherRolePermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTeacherRolePermission record);

    int insertSelective(eduTeacherRolePermission record);

    List<eduTeacherRolePermission> selectByExample(eduTeacherRolePermissionExample example);

    eduTeacherRolePermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTeacherRolePermission record, @Param("example") eduTeacherRolePermissionExample example);

    int updateByExample(@Param("record") eduTeacherRolePermission record, @Param("example") eduTeacherRolePermissionExample example);

    int updateByPrimaryKeySelective(eduTeacherRolePermission record);

    int updateByPrimaryKey(eduTeacherRolePermission record);
}