import com.it.dao.bookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app2 {
    public static void main(String[] args) {
        ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        bookDao bookDao = (com.it.dao.bookDao) acc.getBean("bookdao");
        bookDao.save();
    }
}
