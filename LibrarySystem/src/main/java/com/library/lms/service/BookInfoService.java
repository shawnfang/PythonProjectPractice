package com.library.lms.service;

import com.library.lms.pojo.BookInfo;

import java.util.List;
import java.util.Map;


public interface BookInfoService {
    String getById(int bookId);

    List<BookInfo> getList();

    Map<String, Object> getBookInfo(int bookId);


    /***
     * 向数据库插入(添加)数据(图书的信息)
     * @param book  图书的信息
     * @return true表示插入成功，false表示插入失败
     */
    public boolean insertBook(BookInfo book);


    /***
     * 图书查询的信息
     * @param book
     * @return
     */
    public List<BookInfo> selectBook();

    /***
     * 删除，可做假删除，也可以做真删除
     * @param book
     * @return
     */
    public boolean deleteBook(int bookId);

    /***
     * 图书修改的方法
     * @param book
     * @return
     */
    public boolean updateBook(BookInfo book);

    /**
     * 根据图书id进行查询操作
     * @param book
     * @return
     */
    public BookInfo getBookId(int bookId);


    /***
     * 借书操作
     * @param book
     * @return
     */
    public boolean borrowBook(BookInfo book);

    /***
     * 还书操作
     * @param book
     * @return
     */
    public boolean repayBook(BookInfo book);

}
