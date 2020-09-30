package com.edu.system.mapper;

import com.edu.system.entity.eduHardwareapply;
import com.edu.system.entity.eduHardwareapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduHardwareapplyMapper {
    long countByExample(eduHardwareapplyExample example);

    int deleteByExample(eduHardwareapplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduHardwareapply record);

    int insertSelective(eduHardwareapply record);

    List<eduHardwareapply> selectByExample(eduHardwareapplyExample example);

    eduHardwareapply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduHardwareapply record, @Param("example") eduHardwareapplyExample example);

    int updateByExample(@Param("record") eduHardwareapply record, @Param("example") eduHardwareapplyExample example);

    int updateByPrimaryKeySelective(eduHardwareapply record);

    int updateByPrimaryKey(eduHardwareapply record);
}