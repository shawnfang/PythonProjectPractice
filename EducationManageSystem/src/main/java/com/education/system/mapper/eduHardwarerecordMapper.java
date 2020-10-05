package com.education.system.mapper;

import com.education.system.entity.eduHardwarerecord;
import com.education.system.entity.eduHardwarerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduHardwarerecordMapper {
    long countByExample(eduHardwarerecordExample example);

    int deleteByExample(eduHardwarerecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduHardwarerecord record);

    int insertSelective(eduHardwarerecord record);

    List<eduHardwarerecord> selectByExample(eduHardwarerecordExample example);

    eduHardwarerecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduHardwarerecord record, @Param("example") eduHardwarerecordExample example);

    int updateByExample(@Param("record") eduHardwarerecord record, @Param("example") eduHardwarerecordExample example);

    int updateByPrimaryKeySelective(eduHardwarerecord record);

    int updateByPrimaryKey(eduHardwarerecord record);
}