package com.education.system.mapper;

import com.education.system.entity.eduTaskAndstu;
import com.education.system.entity.eduTaskAndstuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTaskAndstuMapper {
    long countByExample(eduTaskAndstuExample example);

    int deleteByExample(eduTaskAndstuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTaskAndstu record);

    int insertSelective(eduTaskAndstu record);

    List<eduTaskAndstu> selectByExample(eduTaskAndstuExample example);

    eduTaskAndstu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTaskAndstu record, @Param("example") eduTaskAndstuExample example);

    int updateByExample(@Param("record") eduTaskAndstu record, @Param("example") eduTaskAndstuExample example);

    int updateByPrimaryKeySelective(eduTaskAndstu record);

    int updateByPrimaryKey(eduTaskAndstu record);
}