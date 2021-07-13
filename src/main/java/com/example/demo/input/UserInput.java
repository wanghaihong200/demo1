package com.example.demo.input;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-12 14:46
 */
@Data
public class UserInput implements Serializable {
    private Long id;

    @NotBlank(message = "用户名不能为空")
    @Length(min=5, max=20, message = "用户名长度为5-20位")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Min(value=18, message = "最小18岁")
    @Max(value=60, message = "最大60岁")
    private Integer age;

    @Email(message="请输入邮箱")
    @NotBlank(message="邮箱不能为空")
    private String email;
}
