package com.library.lms.mapper;

import com.library.lms.pojo.BookSort;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookSortMapper {
    /***
     * 查询图书类别的信息
     * @param sql
     * @param arr
     * @return
     */
    public List<BookSort> selectBookSort(String sql, Object[] arr);

    /**
     * 根据图书类别id进行查询操作
     *
     * @param bookSortId
     * @return
     */
    public BookSort getBookSortId(Integer bookSortId);
}
