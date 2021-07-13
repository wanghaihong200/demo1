package com.example.demo.config;

import com.example.demo.input.UserInput;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-12 17:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IocTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testIoc(){
        // 实例化User对象，通过上下文获取Bean对象user1
        UserInput user = (UserInput) applicationContext.getBean("user1");
        System.out.println(user);
    }
}
