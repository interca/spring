import com.it.dao.bookDao;
import com.it.service.bookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
    public static void main(String[] args) {
        //获取ioc容器
        ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        bookDao bookDao = (com.it.dao.bookDao) acc.getBean("dao");
        bookDao.save();
        bookService service= (bookService) acc.getBean("service");
        service.save();
    }
}
