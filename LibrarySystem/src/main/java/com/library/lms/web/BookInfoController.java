package com.library.lms.web;

import com.library.lms.pojo.BookInfo;
import com.library.lms.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;

    @GetMapping("/book")
    private String list(Model model) {
        List<BookInfo> list = bookInfoService.getList();
        model.addAttribute("list", list);
        return "list";
    }
}
