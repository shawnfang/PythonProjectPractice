package com.edu.system.mapper;

import com.edu.system.entity.eduHomeworkscore;
import com.edu.system.entity.eduHomeworkscoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduHomeworkscoreMapper {
    long countByExample(eduHomeworkscoreExample example);

    int deleteByExample(eduHomeworkscoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduHomeworkscore record);

    int insertSelective(eduHomeworkscore record);

    List<eduHomeworkscore> selectByExample(eduHomeworkscoreExample example);

    eduHomeworkscore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduHomeworkscore record, @Param("example") eduHomeworkscoreExample example);

    int updateByExample(@Param("record") eduHomeworkscore record, @Param("example") eduHomeworkscoreExample example);

    int updateByPrimaryKeySelective(eduHomeworkscore record);

    int updateByPrimaryKey(eduHomeworkscore record);
}