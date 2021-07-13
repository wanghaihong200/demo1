package com.example.demo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-09 15:11
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class propertTest {
    @Value("${age}")
    private int age;

    @Value("${name}")
    private String name;

    @Autowired
    private GetPersonInfoProperties getPersonInfoProperties;

    @Test
    public void getName(){
        System.out.println(name);
    }

    @Test
    public void getAge() {
        System.out.println(age);
    }

    @Test
    public void getpersonproperties(){
        System.out.println(getPersonInfoProperties.getName());
    }
}
