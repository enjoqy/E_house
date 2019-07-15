package org.junhi;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junhi.dao.UserDao;
import org.junhi.domain.User;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @author junhi
 * @date 2019/7/14 16:03
 */
public class MyBatisTest {

    /*@Test
    public void test01() throws Exception {
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactoryBean sqlSessionFactoryBean = ac.getBean("sqlSessionFactoryBean", SqlSessionFactoryBean.class);
        SqlSession sqlSession = sqlSessionFactoryBean.getObject().openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.findAll();
        userList.forEach(x -> System.out.println(x));
    }*/
}
