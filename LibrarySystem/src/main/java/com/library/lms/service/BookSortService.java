package com.library.lms.service;

import com.library.lms.pojo.BookSort;

import java.util.List;

public interface BookSortService {

    /***
     * 向数据库插入(添加)数据(图书类别的信息)
     * @param bookSort  图书类别的信息
     * @return true表示插入成功，false表示插入失败
     */
    public boolean insertBookSort(BookSort bookSort);


    /***
     * 图书查询的信息
     * @param bookSort
     * @return
     */
    public List<BookSort> selectBookSort(BookSort bookSort);

    /***
     * 删除，可做假删除，也可以做真删除
     * @param bookSort
     * @return
     */
    public boolean deleteBookSort(BookSort bookSort);

    /***
     * 图书类别修改的方法
     * @param bookSort
     * @return
     */
    public boolean updateBookSort(BookSort bookSort);

    /**
     * 根据图书类别id进行查询操作
     * @param bookSort
     * @return
     */
    public BookSort getBookSortId(BookSort bookSort);

}
