package com.javakc.cms.modules.book.service;

import com.javakc.cms.base.page.Page;
import com.javakc.cms.base.service.BaseService;
import com.javakc.cms.modules.book.dao.BookDao;
import com.javakc.cms.modules.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly =true)
public class BookService extends BaseService<BookDao,Book> {

    @Autowired
    BookDao bookDao;

    public Page<Book> queryList(Book entity,Page<Book> page){
        entity.setPage(page);
        return page.setList(bookDao.findList(entity));
    }
}
