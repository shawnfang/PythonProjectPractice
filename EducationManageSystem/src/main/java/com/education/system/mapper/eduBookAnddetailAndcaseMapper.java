package com.education.system.mapper;

import com.education.system.entity.eduBookAnddetailAndcase;
import com.education.system.entity.eduBookAnddetailAndcaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface eduBookAnddetailAndcaseMapper {
    long countByExample(eduBookAnddetailAndcaseExample example);

    int deleteByExample(eduBookAnddetailAndcaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(eduBookAnddetailAndcase record);

    int insertSelective(eduBookAnddetailAndcase record);

    List<eduBookAnddetailAndcase> selectByExample(eduBookAnddetailAndcaseExample example);

    eduBookAnddetailAndcase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") eduBookAnddetailAndcase record, @Param("example") eduBookAnddetailAndcaseExample example);

    int updateByExample(@Param("record") eduBookAnddetailAndcase record, @Param("example") eduBookAnddetailAndcaseExample example);

    int updateByPrimaryKeySelective(eduBookAnddetailAndcase record);

    int updateByPrimaryKey(eduBookAnddetailAndcase record);
}