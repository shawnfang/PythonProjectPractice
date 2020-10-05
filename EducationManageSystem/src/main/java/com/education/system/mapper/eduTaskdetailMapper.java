package com.education.system.mapper;

import com.education.system.entity.eduTaskdetail;
import com.education.system.entity.eduTaskdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTaskdetailMapper {
    long countByExample(eduTaskdetailExample example);

    int deleteByExample(eduTaskdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTaskdetail record);

    int insertSelective(eduTaskdetail record);

    List<eduTaskdetail> selectByExample(eduTaskdetailExample example);

    eduTaskdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTaskdetail record, @Param("example") eduTaskdetailExample example);

    int updateByExample(@Param("record") eduTaskdetail record, @Param("example") eduTaskdetailExample example);

    int updateByPrimaryKeySelective(eduTaskdetail record);

    int updateByPrimaryKey(eduTaskdetail record);
}