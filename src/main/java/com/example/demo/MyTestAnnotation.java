package com.example.demo;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-13 15:43
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyTestAnnotation {
    String value();
}
