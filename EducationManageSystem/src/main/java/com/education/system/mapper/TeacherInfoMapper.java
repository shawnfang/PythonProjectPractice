package com.education.system.mapper;

import com.education.system.pojo.TeacherInfo;
import com.education.system.pojo.TeacherRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherInfoMapper {
    /**
     * 新增老师
     * @param teacherInfo
     * @return
     */
    public int addTeacherInfo(TeacherInfo teacherInfo);

    /**
     * 获取老师列表
     * @return
     */
    public List<TeacherInfo> getTeacherInfoList();

    /**
     * 更新老师信息
     * @param teacherInfo
     * @return
     */
    public boolean updateTeacherInfo(TeacherInfo teacherInfo);

    /**
     * 删除老师
     * @param id
     * @return
     */
    public boolean deleteTeacherInfo(@Param("id") Integer id);

    /**
     * 通过搜索老师
     * @param teacherInfo
     * @return
     */
    public List<TeacherInfo> seacherTeacherInfo(TeacherInfo teacherInfo);
}
