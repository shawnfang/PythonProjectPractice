package com.education.system.mapper;

import com.education.system.pojo.TeacherRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherRoleMapper {
    /**
     * 新增老师角色
     * @param teacherRole
     * @return
     */
    public int addTeacherRole(TeacherRole teacherRole);

    /**
     * 获取角色列表
     * @return
     */
    public List<TeacherRole> getTeacherRoleList();

    /**
     * 更新老师角色
     * @param teacherRole
     * @return
     */
    public boolean updateTeacherRole(TeacherRole teacherRole);

    /**
     * 删除老师角色
     * @param id
     * @return
     */
    public boolean deleteTeacherRole(@Param("id") Integer id);

    /**
     * 通过角色名称搜索角色
     * @param roleName
     * @return
     */
    public List<TeacherRole> seacherTeacherRole(@Param("roleName") String roleName);
}
