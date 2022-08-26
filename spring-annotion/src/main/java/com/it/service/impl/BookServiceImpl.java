package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;
    @Override
    public void save() {
        System.out.println("save");
        bookDao.save();
    }
}
