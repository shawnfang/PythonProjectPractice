package com.lms.controller;

import com.lms.entity.BookInfo;
import com.lms.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    private String list(Model model) {
        List<BookInfo> list = bookInfoService.getList();
        model.addAttribute("list", list);
        return "list";
    }

}
