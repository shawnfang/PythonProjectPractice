package com.education.system.mapper;

import com.education.system.entity.eduHomeworkscore;
import com.education.system.entity.eduHomeworkscoreExample;
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