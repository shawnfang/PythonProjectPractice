package com.edu.system.mapper;

import com.edu.system.entity.eduHardwaretype;
import com.edu.system.entity.eduHardwaretypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduHardwaretypeMapper {
    long countByExample(eduHardwaretypeExample example);

    int deleteByExample(eduHardwaretypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduHardwaretype record);

    int insertSelective(eduHardwaretype record);

    List<eduHardwaretype> selectByExample(eduHardwaretypeExample example);

    eduHardwaretype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduHardwaretype record, @Param("example") eduHardwaretypeExample example);

    int updateByExample(@Param("record") eduHardwaretype record, @Param("example") eduHardwaretypeExample example);

    int updateByPrimaryKeySelective(eduHardwaretype record);

    int updateByPrimaryKey(eduHardwaretype record);
}