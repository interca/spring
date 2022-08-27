import com.it.config.springConfig;
import com.it.domain.Account;
import com.it.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class app2 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(springConfig.class);
        AccountService bean = context.getBean(AccountService.class);
        List<Account> all = bean.findAll();
        for(Account k:all){
            System.out.println(k);
        }
    }

}
