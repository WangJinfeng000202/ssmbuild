package com.wjf.controller;

import com.wjf.pojo.Book;
import com.wjf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //controller层调用service层
    @Autowired
    private BookService bookService ;


    @RequestMapping("/allBook")
    public String list(Model model){
        List<Book> books = bookService.queryAllBooks();
        model.addAttribute("list",books);
        return "allBook";
    }
}
