package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;


/**
 * @program: demo1
 * @description:
 * @author: 王海虹
 * @create: 2021-07-12 15:43
 */
// 标记为切面类
@Aspect
//把切面类加入IoC容器中，让Spring进行管理
@Component
public class AopLog {
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    //定义切点
    @Pointcut("execution(public * com.example.demo.Controller..*(..))")
    public void aopWebLog() {

    }

    @Before("aopWebLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes)
                RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();

            logger.info("URL:" + request.getRequestURL().toString());
            logger.info("HTTP方法：" + request.getMethod());
            logger.info("IP地址：" + request.getRemoteAddr());
            logger.info("类的方法：" + joinPoint.getSignature().getDeclaringTypeName() + "."
                    + joinPoint.getSignature().getName());
            logger.info("参数:" + request.getQueryString());
        }

    }

    @AfterReturning(pointcut = "aopWebLog()", returning = "retObject")
    public void doAfterReturning(Object retObject) throws Throwable {
        logger.info("response值：" + retObject);
        logger.info("费时：" + (System.currentTimeMillis() - startTime.get()));
    }

    @AfterThrowing(pointcut = "aopWebLog()", throwing = "ex")
    public void addAfterThrowingLogger(JoinPoint joinPoint, Exception ex) {
        logger.error("执行异常", ex);
    }
}
