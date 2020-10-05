package com.education.system.mapper;

import com.education.system.entity.eduHomework;
import com.education.system.entity.eduHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduHomeworkMapper {
    long countByExample(eduHomeworkExample example);

    int deleteByExample(eduHomeworkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduHomework record);

    int insertSelective(eduHomework record);

    List<eduHomework> selectByExample(eduHomeworkExample example);

    eduHomework selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduHomework record, @Param("example") eduHomeworkExample example);

    int updateByExample(@Param("record") eduHomework record, @Param("example") eduHomeworkExample example);

    int updateByPrimaryKeySelective(eduHomework record);

    int updateByPrimaryKey(eduHomework record);
}