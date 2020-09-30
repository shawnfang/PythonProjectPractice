package com.edu.system.mapper;

import com.edu.system.entity.eduCheckAndpurchars;
import com.edu.system.entity.eduCheckAndpurcharsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduCheckAndpurcharsMapper {
    long countByExample(eduCheckAndpurcharsExample example);

    int deleteByExample(eduCheckAndpurcharsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduCheckAndpurchars record);

    int insertSelective(eduCheckAndpurchars record);

    List<eduCheckAndpurchars> selectByExample(eduCheckAndpurcharsExample example);

    eduCheckAndpurchars selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduCheckAndpurchars record, @Param("example") eduCheckAndpurcharsExample example);

    int updateByExample(@Param("record") eduCheckAndpurchars record, @Param("example") eduCheckAndpurcharsExample example);

    int updateByPrimaryKeySelective(eduCheckAndpurchars record);

    int updateByPrimaryKey(eduCheckAndpurchars record);
}