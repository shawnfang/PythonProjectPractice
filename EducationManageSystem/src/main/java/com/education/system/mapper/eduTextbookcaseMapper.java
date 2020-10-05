package com.education.system.mapper;

import com.education.system.entity.eduTextbookcase;
import com.education.system.entity.eduTextbookcaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTextbookcaseMapper {
    long countByExample(eduTextbookcaseExample example);

    int deleteByExample(eduTextbookcaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTextbookcase record);

    int insertSelective(eduTextbookcase record);

    List<eduTextbookcase> selectByExample(eduTextbookcaseExample example);

    eduTextbookcase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTextbookcase record, @Param("example") eduTextbookcaseExample example);

    int updateByExample(@Param("record") eduTextbookcase record, @Param("example") eduTextbookcaseExample example);

    int updateByPrimaryKeySelective(eduTextbookcase record);

    int updateByPrimaryKey(eduTextbookcase record);
}