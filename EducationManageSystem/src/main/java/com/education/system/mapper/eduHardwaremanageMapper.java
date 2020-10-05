package com.education.system.mapper;

import com.education.system.entity.eduHardwaremanage;
import com.education.system.entity.eduHardwaremanageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduHardwaremanageMapper {
    long countByExample(eduHardwaremanageExample example);

    int deleteByExample(eduHardwaremanageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduHardwaremanage record);

    int insertSelective(eduHardwaremanage record);

    List<eduHardwaremanage> selectByExample(eduHardwaremanageExample example);

    eduHardwaremanage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduHardwaremanage record, @Param("example") eduHardwaremanageExample example);

    int updateByExample(@Param("record") eduHardwaremanage record, @Param("example") eduHardwaremanageExample example);

    int updateByPrimaryKeySelective(eduHardwaremanage record);

    int updateByPrimaryKey(eduHardwaremanage record);
}