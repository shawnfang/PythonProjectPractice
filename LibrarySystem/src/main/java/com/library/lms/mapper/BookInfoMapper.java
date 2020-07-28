package com.library.lms.mapper;

import com.library.lms.pojo.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/***
 * 图书的dao层接口
 * @author shawnfang
 *
 */
@Mapper
public interface BookInfoMapper {


    /**
     * 根据用户id进行查询操作
     *
     * @param bookId
     * @return
     */
    public String getBookIds(Integer bookId);
    /***
     * 查询图书的信息
     * @param
     * @param
     * @return
     */
    public List<BookInfo> selectBook(BookInfo bookInfo);

    /**
     * 根据用户id进行查询操作
     *
     * @param bookId
     * @return
     */
    public BookInfo getBookId(Integer bookId);

    /**
     * 插入新增
     * @param book
     * @return
     */
    public boolean addBook(BookInfo book);

    /**
     * 更新
     * @param book
     * @return
     */
    public boolean updateBook(BookInfo book);

    /**
     * 删除
     * @param book
     * @return
     */
    public boolean deleteBook(BookInfo book);


    /**
     * 测试用的方法
     * @param bookId
     * @return
     */
    public Map<String,Object> getBookInfo(Integer bookId);

}
