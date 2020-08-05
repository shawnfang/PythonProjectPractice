package com.library.lms.service.impl;

import com.library.lms.mapper.BookSortMapper;
import com.library.lms.pojo.BookSort;
import com.library.lms.service.BookSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("BookSortService")
public class BookSortServiceImpl implements BookSortService {
    @Autowired
    private BookSortMapper bookSortMapper;

    public boolean insertBookSort(BookSort bookSort) {
        return bookSortMapper.addBookSort(bookSort);
    }

    public List<BookSort> selectBookSort() {
        return bookSortMapper.selectBookSort();
    }

    public boolean deleteBookSort(int bookSortId) {
        boolean deleteResult = false;
        for (BookSort bookSort:bookSortMapper.selectBookSort()){
            if (bookSort.getBook_sort_id() == bookSortId) {
                if(bookSortMapper.deleteBookSort(bookSortId)){
                    deleteResult = true;
                }
            }
        }
        return deleteResult;
    }

    public boolean updateBookSort(BookSort bookSort) {
        return bookSortMapper.updateBookSort(bookSort);
    }

    public BookSort getBookSortId(int bookSortId) {
        return bookSortMapper.getBookSortId(bookSortId);
    }
}
