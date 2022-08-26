import j.com.it.dao.bookDao;
import j.com.it.dao.impl.BookDaoImpl;
import j.com.it.service.bookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;

public class app {
    public static void main(String[] args) {

        ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        BookDaoImpl bookService= (BookDaoImpl) acc.getBean("bookDao");
        bookService.save();
        HashSet<Integer> set = bookService.set;
        System.out.println(set);
    }
}
