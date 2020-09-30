package com.edu.system.mapper;

import com.edu.system.entity.eduHardwarepurchars;
import com.edu.system.entity.eduHardwarepurcharsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduHardwarepurcharsMapper {
    long countByExample(eduHardwarepurcharsExample example);

    int deleteByExample(eduHardwarepurcharsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduHardwarepurchars record);

    int insertSelective(eduHardwarepurchars record);

    List<eduHardwarepurchars> selectByExample(eduHardwarepurcharsExample example);

    eduHardwarepurchars selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduHardwarepurchars record, @Param("example") eduHardwarepurcharsExample example);

    int updateByExample(@Param("record") eduHardwarepurchars record, @Param("example") eduHardwarepurcharsExample example);

    int updateByPrimaryKeySelective(eduHardwarepurchars record);

    int updateByPrimaryKey(eduHardwarepurchars record);
}