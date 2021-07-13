package com.example.demo.exception;

import lombok.Data;

/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-13 16:45
 */
@Data
public class DemoException extends RuntimeException{
    //自定义错误码
    private Integer code;
    //自定义构造器，必须输入错误码及内容
    public DemoException(int code, String msg){
        super(msg);
        this.code = code;
    }

}
