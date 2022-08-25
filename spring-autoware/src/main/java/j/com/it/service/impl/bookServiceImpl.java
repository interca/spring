package j.com.it.service.impl;


import j.com.it.dao.bookDao;
import j.com.it.service.bookService;

public class bookServiceImpl implements bookService {
    private j.com.it.dao.bookDao bookDao;

    public void setBookDao(bookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("service");
        bookDao.save();
    }
}
