package com.edu.system.mapper;

import com.edu.system.entity.eduStuInfo;
import com.edu.system.entity.eduStuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduStuInfoMapper {
    long countByExample(eduStuInfoExample example);

    int deleteByExample(eduStuInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduStuInfo record);

    int insertSelective(eduStuInfo record);

    List<eduStuInfo> selectByExample(eduStuInfoExample example);

    eduStuInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduStuInfo record, @Param("example") eduStuInfoExample example);

    int updateByExample(@Param("record") eduStuInfo record, @Param("example") eduStuInfoExample example);

    int updateByPrimaryKeySelective(eduStuInfo record);

    int updateByPrimaryKey(eduStuInfo record);
}