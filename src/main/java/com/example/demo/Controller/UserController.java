package com.example.demo.Controller;

import com.example.demo.MyTestAnnotation;
import com.example.demo.input.UserInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-12 15:00
 */
@RestController
public class UserController {
    @MyTestAnnotation("测试Annotation参数")
    @GetMapping("/test")
    public String showForm(UserInput user){
        return "form";
    }

}
