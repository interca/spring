package j.com.it.factory;



import j.com.it.dao.bookDao;
import j.com.it.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class BookDaoFactoryBean implements FactoryBean<bookDao> {
    @Override
    public bookDao getObject() throws Exception {
        return (bookDao) new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return bookDao.class;
    }
}
