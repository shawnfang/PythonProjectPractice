package com.education.system.mapper;

import com.education.system.entity.eduAccount;
import com.education.system.entity.eduAccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


public interface eduAccountMapper {
    long countByExample(eduAccountExample example);

    int deleteByExample(eduAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduAccount record);

    int insertSelective(eduAccount record);

    List<eduAccount> selectByExample(eduAccountExample example);

    eduAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduAccount record, @Param("example") eduAccountExample example);

    int updateByExample(@Param("record") eduAccount record, @Param("example") eduAccountExample example);

    int updateByPrimaryKeySelective(eduAccount record);

    int updateByPrimaryKey(eduAccount record);
}