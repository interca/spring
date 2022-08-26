import com.it.dao.BookDao;
import com.it.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao b= (BookDao) acc.getBean("bookDao");
        b.save();
        BookService b2= (BookService) acc.getBean(BookService.class);
        b2.save();
    }
}
