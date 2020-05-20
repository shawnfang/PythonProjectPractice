package com.lms.dao;

import com.lms.entity.BookSort;

import java.util.List;

public interface BookSortDao {
    /***
     * 查询图书类别的信息
     * @param sql
     * @param arr
     * @return
     */
    public List<BookSort> selectBookSort(String sql, Object[] arr);

    /**
     * 根据图书类别id进行查询操作
     * @param bookSortId
     * @return
     */
    public BookSort getBookSortId(Integer bookSortId);
}
