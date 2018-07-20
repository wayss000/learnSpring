package pers.wayss.springAOP.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Spring切面类，用于演示拦截注解切点
 * @author Wayss
 * @date 2018/7/21
 */
@Component
@Aspect
public class TestInterceptor1 {

    /**
     * 在切点注解的方法之前执行
     */
    @Before("@annotation(Anno)")
    public void annoBefore(){
        System.out.println("annoBefore");
    }

    /**
     * 在切点注解的方法调用时，包起来
     * @param pjp
     */
    @Around("@annotation(Anno)")
    public void annoAround(ProceedingJoinPoint pjp){
        System.out.println("annoAround");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    /**
     * 在切点注解的方法调用后执行
     */
    @After("@annotation(Anno)")
    public void annoAfter(){
        System.out.println("annoAfter");
    }


}
