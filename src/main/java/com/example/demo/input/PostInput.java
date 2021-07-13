package com.example.demo.input;


import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-09 18:07
 */
@Data
public class PostInput {
    @NotNull(message="用户名不能为空")
    public String name;
    @NotNull(message="密码不能为空")
    public String pass;
}
