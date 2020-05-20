package com.lms.dao;

import java.util.List;
import com.lms.entity.BookInfo;

/***
 * 图书的dao层接口
 * @author shawnfang
 *
 */
public interface BookDao {
    /***
     * 查询图书的信息
     * @param sql
     * @param arr
     * @return
     */
    public List<BookInfo> selectBook(String sql, Object[] arr);

    /**
     * 根据用户id进行查询操作
     * @param bookId
     * @return
     */
    public BookInfo getBookId(Integer bookId);

}
