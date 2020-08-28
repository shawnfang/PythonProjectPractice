package com.education.system.mapper;

import com.education.system.pojo.SchoolInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchoolInfoMapper {
    /**
     * 查询学校列表
     * @return
     */
    public String schoolList();

    /**
     * 新增学校
     * @param schoolInfo
     * @return
     */

    public boolean addSchoolInfo(SchoolInfo schoolInfo);

    /**
     * 更新学校信息
     * @param schoolInfo
     * @return
     */
    public boolean updateSchoolInfo(SchoolInfo schoolInfo);

    /**
     * 删除学校
     * @param id
     * @return
     */
    public boolean deleteSchoolInfo(int id);

    /**
     * 搜索学校信息
     * @param schoolInfo
     * @return
     */
    public String searchSchoolInfo(SchoolInfo schoolInfo);
}
