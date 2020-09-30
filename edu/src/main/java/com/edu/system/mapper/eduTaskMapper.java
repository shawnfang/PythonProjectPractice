package com.edu.system.mapper;

import com.edu.system.entity.eduTask;
import com.edu.system.entity.eduTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTaskMapper {
    long countByExample(eduTaskExample example);

    int deleteByExample(eduTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTask record);

    int insertSelective(eduTask record);

    List<eduTask> selectByExample(eduTaskExample example);

    eduTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTask record, @Param("example") eduTaskExample example);

    int updateByExample(@Param("record") eduTask record, @Param("example") eduTaskExample example);

    int updateByPrimaryKeySelective(eduTask record);

    int updateByPrimaryKey(eduTask record);
}