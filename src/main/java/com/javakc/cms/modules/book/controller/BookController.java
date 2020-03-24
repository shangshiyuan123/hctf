package com.javakc.cms.modules.book.controller;

import com.javakc.cms.base.page.Page;
import com.javakc.cms.modules.book.entity.Book;
import com.javakc.cms.modules.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;
    @RequestMapping("querybook")
    public String queryBook(Book entity, ModelMap model,
                            HttpServletRequest request, HttpServletResponse response){
        model.put("page",bookService.queryList(entity, new Page<Book>(request,response)));
        model.put("entity",entity);
        return "book/list";
    }

}
