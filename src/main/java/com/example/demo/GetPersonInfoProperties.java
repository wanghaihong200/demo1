package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-09 15:23
 */

@Component
@ConfigurationProperties(prefix="personinfo")
public class GetPersonInfoProperties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
