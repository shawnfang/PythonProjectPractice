package com.education.system.mapper;

import com.education.system.entity.eduQuestion;
import com.education.system.entity.eduQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduQuestionMapper {
    long countByExample(eduQuestionExample example);

    int deleteByExample(eduQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduQuestion record);

    int insertSelective(eduQuestion record);

    List<eduQuestion> selectByExample(eduQuestionExample example);

    eduQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduQuestion record, @Param("example") eduQuestionExample example);

    int updateByExample(@Param("record") eduQuestion record, @Param("example") eduQuestionExample example);

    int updateByPrimaryKeySelective(eduQuestion record);

    int updateByPrimaryKey(eduQuestion record);
}