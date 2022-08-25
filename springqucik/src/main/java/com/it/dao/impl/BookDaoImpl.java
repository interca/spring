package com.it.dao.impl;

import com.it.dao.bookDao;

public class BookDaoImpl implements bookDao {
    @Override
    public void save() {
        System.out.println("dao层");
    }
}
