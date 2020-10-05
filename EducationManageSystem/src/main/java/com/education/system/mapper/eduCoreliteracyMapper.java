package com.education.system.mapper;

import com.education.system.entity.eduCoreliteracy;
import com.education.system.entity.eduCoreliteracyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduCoreliteracyMapper {
    long countByExample(eduCoreliteracyExample example);

    int deleteByExample(eduCoreliteracyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduCoreliteracy record);

    int insertSelective(eduCoreliteracy record);

    List<eduCoreliteracy> selectByExample(eduCoreliteracyExample example);

    eduCoreliteracy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduCoreliteracy record, @Param("example") eduCoreliteracyExample example);

    int updateByExample(@Param("record") eduCoreliteracy record, @Param("example") eduCoreliteracyExample example);

    int updateByPrimaryKeySelective(eduCoreliteracy record);

    int updateByPrimaryKey(eduCoreliteracy record);
}