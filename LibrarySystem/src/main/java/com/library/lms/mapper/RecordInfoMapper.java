package com.library.lms.mapper;

import com.library.lms.pojo.RecordInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordInfoMapper {
    /**
     * 返回列表
     * @return
     */
    public List<RecordInfo> selectRecord();

    /**
     * 添加记录：借书记录，还书记录
     * @param recordInfo
     * @return
     */
    public boolean addRecord(RecordInfo recordInfo);
}
