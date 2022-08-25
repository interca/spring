package j.com.it.dao.impl;


import j.com.it.dao.bookDao;

public class BookDaoImpl implements bookDao {
    @Override
    public void save() {
        System.out.println("dao层");
    }
}
