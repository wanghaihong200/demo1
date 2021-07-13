package com.example.demo.Controller;

import com.example.demo.input.PostInput;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-08 17:39
 */
@RestController
public class HelloWorldController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello,Spring Boot!";
    }

    @PostMapping("/post")
    public String post(@RequestBody @Valid PostInput input){
        System.out.println(input.name);
        System.out.println(input.pass);
        return "获取用户信息成功！";
    }

}
