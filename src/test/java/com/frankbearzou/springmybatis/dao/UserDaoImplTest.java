package com.frankbearzou.springmybatis.dao;

import com.frankbearzou.springmybatis.mapper.UserMapper;
import com.frankbearzou.springmybatis.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testFindUserById() {
        UserMapper userDao = (UserMapper)applicationContext.getBean("userDaoImpl");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
