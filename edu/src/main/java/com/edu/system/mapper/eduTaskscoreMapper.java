package com.edu.system.mapper;

import com.edu.system.entity.eduTaskscore;
import com.edu.system.entity.eduTaskscoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTaskscoreMapper {
    long countByExample(eduTaskscoreExample example);

    int deleteByExample(eduTaskscoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTaskscore record);

    int insertSelective(eduTaskscore record);

    List<eduTaskscore> selectByExample(eduTaskscoreExample example);

    eduTaskscore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTaskscore record, @Param("example") eduTaskscoreExample example);

    int updateByExample(@Param("record") eduTaskscore record, @Param("example") eduTaskscoreExample example);

    int updateByPrimaryKeySelective(eduTaskscore record);

    int updateByPrimaryKey(eduTaskscore record);
}