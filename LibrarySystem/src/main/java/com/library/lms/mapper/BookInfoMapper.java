package com.library.lms.mapper;

import com.library.lms.pojo.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/***
 * 图书的dao层接口
 * @author shawnfang
 *
 */
@Mapper
public interface BookInfoMapper {
    /***
     * 查询图书的信息
     * @param sql
     * @param arr
     * @return
     */
    public List<BookInfo> selectBook(int limit);

    /**
     * 根据用户id进行查询操作
     *
     * @param bookId
     * @return
     */
    public String getBookId(Integer bookId);

}
