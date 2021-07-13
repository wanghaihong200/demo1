package com.example.demo.aop;

import com.example.demo.MyTestAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;


/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-13 15:35
 */
public class TestAnnotationAspect {
    //拦截被TestAnnotation注解的方法:如果需要拦截指定包指定规则名称的方法，
    // 则可以使用表达式 execution(....)
    @Pointcut("@annotation(com.example.demo.MyTestAnnotation)")
    public void myAnnotationPointCut(){

    }
    @Before("myAnnotationPointCut()")
    public void before(JoinPoint joinPoint) throws Throwable{
        MethodSignature sign = (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        MyTestAnnotation annotation = method.getAnnotation(MyTestAnnotation.class);
        // 获取注解参数
        System.out.println("TestAnnotation参数"+ annotation.value());
    }
}
