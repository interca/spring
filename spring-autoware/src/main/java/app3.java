import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import j.com.it.service.bookService;

public class app3 {
    public static void main(String[] args) {
        ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        bookService bookService= (j.com.it.service.bookService) acc.getBean("bookService");
        bookService.save();
    }
}
