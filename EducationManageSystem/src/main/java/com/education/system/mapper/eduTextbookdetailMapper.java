package com.education.system.mapper;

import com.education.system.entity.eduTextbookdetail;
import com.education.system.entity.eduTextbookdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTextbookdetailMapper {
    long countByExample(eduTextbookdetailExample example);

    int deleteByExample(eduTextbookdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTextbookdetail record);

    int insertSelective(eduTextbookdetail record);

    List<eduTextbookdetail> selectByExample(eduTextbookdetailExample example);

    eduTextbookdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTextbookdetail record, @Param("example") eduTextbookdetailExample example);

    int updateByExample(@Param("record") eduTextbookdetail record, @Param("example") eduTextbookdetailExample example);

    int updateByPrimaryKeySelective(eduTextbookdetail record);

    int updateByPrimaryKey(eduTextbookdetail record);
}