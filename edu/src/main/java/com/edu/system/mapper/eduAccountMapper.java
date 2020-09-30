package com.edu.system.mapper;

import com.edu.system.entity.eduAccount;
import com.edu.system.entity.eduAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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