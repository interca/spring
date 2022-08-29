import com.it.config.springConfig;
import com.it.mapper.AccountMapper;
import com.it.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springConfig.class)
public class test {
    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountService accountService;

    @Test
    public  void test(){
        System.out.println(accountService.findAll());
    }
}
