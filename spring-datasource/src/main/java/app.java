import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class app {
    public static void main(String[] args) throws SQLException {
        ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource= (DataSource) acc.getBean("dataSource");
        //System.out.println(dataSource);
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
