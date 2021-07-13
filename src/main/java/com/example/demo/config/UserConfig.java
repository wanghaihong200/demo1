package com.example.demo.config;

import com.example.demo.input.UserInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-12 17:09
 */
@Configuration
public class UserConfig {
    @Bean("user1")
    public UserInput user(){
        UserInput user = new UserInput();
        user.setId(1L);
        user.setName("haihai");
        user.setAge(19);
        user.setEmail("wang@163.com");
        return user;
    }
}
