package com.education.system.mapper;

import com.education.system.entity.eduTextbook;
import com.education.system.entity.eduTextbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTextbookMapper {
    long countByExample(eduTextbookExample example);

    int deleteByExample(eduTextbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTextbook record);

    int insertSelective(eduTextbook record);

    List<eduTextbook> selectByExample(eduTextbookExample example);

    eduTextbook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTextbook record, @Param("example") eduTextbookExample example);

    int updateByExample(@Param("record") eduTextbook record, @Param("example") eduTextbookExample example);

    int updateByPrimaryKeySelective(eduTextbook record);

    int updateByPrimaryKey(eduTextbook record);
}