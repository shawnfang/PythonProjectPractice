package com.edu.system.mapper;

import com.edu.system.entity.eduTeacherInfo;
import com.edu.system.entity.eduTeacherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduTeacherInfoMapper {
    long countByExample(eduTeacherInfoExample example);

    int deleteByExample(eduTeacherInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduTeacherInfo record);

    int insertSelective(eduTeacherInfo record);

    List<eduTeacherInfo> selectByExample(eduTeacherInfoExample example);

    eduTeacherInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduTeacherInfo record, @Param("example") eduTeacherInfoExample example);

    int updateByExample(@Param("record") eduTeacherInfo record, @Param("example") eduTeacherInfoExample example);

    int updateByPrimaryKeySelective(eduTeacherInfo record);

    int updateByPrimaryKey(eduTeacherInfo record);
}