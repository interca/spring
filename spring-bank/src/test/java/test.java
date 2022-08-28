import com.it.config.springConfig;
import com.it.service.serviceAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springConfig.class)
public class test {

    @Autowired
    private serviceAccount service ;

    @Test
    public  void test(){
        service.money("黄裕甲","小明",1000);
    }
}
