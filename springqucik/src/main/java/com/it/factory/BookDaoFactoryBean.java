package com.it.factory;

import com.it.dao.bookDao;
import com.it.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class BookDaoFactoryBean implements FactoryBean<bookDao> {
    @Override
    public bookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return bookDao.class;
    }
}
