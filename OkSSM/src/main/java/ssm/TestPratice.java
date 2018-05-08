package ssm;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.dao.UserDao;
import ssm.entity.User;

import java.util.List;

/**
 * Created by guozhaohui628@gmail.com on 2018/5/7
 * Description:
 */
public class TestPratice {
    @Test
    public void A(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserDao userDao = ac.getBean(UserDao.class);
        List<User> userList = userDao.queryUserListByUsername2Sex("王五",1);
//        List<User> userList = userDao.queryUserListByUsername("王五");
        System.out.println(userList.toString());
    }
}
