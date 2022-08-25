package com.it.service.impl;

import com.it.dao.bookDao;
import com.it.dao.impl.BookDaoImpl;
import com.it.service.bookService;

public class bookServiceImpl implements bookService {
    private bookDao bookDao;

    public void setBookDao(com.it.dao.bookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("service");
        bookDao.save();
    }
}
