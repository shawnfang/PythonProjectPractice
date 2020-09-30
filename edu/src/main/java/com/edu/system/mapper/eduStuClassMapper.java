package com.edu.system.mapper;

import com.edu.system.entity.eduStuClass;
import com.edu.system.entity.eduStuClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduStuClassMapper {
    long countByExample(eduStuClassExample example);

    int deleteByExample(eduStuClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduStuClass record);

    int insertSelective(eduStuClass record);

    List<eduStuClass> selectByExample(eduStuClassExample example);

    eduStuClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduStuClass record, @Param("example") eduStuClassExample example);

    int updateByExample(@Param("record") eduStuClass record, @Param("example") eduStuClassExample example);

    int updateByPrimaryKeySelective(eduStuClass record);

    int updateByPrimaryKey(eduStuClass record);
}