import com.zyp.dao.UserDAO;
import com.zyp.entity.User;
import com.zyp.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class test {
    
    
    //github提交
    //本地提交222
    @Test
    public void test1() {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) cs.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO u = (UserDAO) cs.getBean("userDAO");
        u.save();
    }

    @Test
    public void test3() {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) cs.getBean("userService");
        userService.regist();
    }

    @Test
    public void test4() {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connection = (Connection) cs.getBean("connection");
        System.out.println(connection);
        //注意：如果一个类实现了FactoryBean接口，通过该类的ID 获取到是由该类所创建的复杂对象

    }

    @Test
    public void test5() {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) cs.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
    }
}
