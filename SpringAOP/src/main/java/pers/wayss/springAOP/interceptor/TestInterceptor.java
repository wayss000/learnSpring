package pers.wayss.springAOP.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Spring拦截器，即一个切面类
 * @author Wayss
 * @date 2018/7/20
 */
@Component
@Aspect
public class TestInterceptor {

    /**
     * 声明一个切点
     */
    @Pointcut("execution(* pers.wayss.springAOP.interceptor.HelloWorld.getMessage1(..))")
    public void pt1(){

    }

    /**
     * 在切点方法执行之前，执行此方法
     */
    @Before("pt1()")
    public void beforeHelloWorld1(){
        System.out.println("before Message1");
    }

    /**
     * around（环绕）切点，会把要切点包起来，
     * 在这里可以让拦截的切点内容不执行，
     * 或者在执行前or执行后做任何事情。
     * @param pjp
     */
    @Around("pt1()")
    public void aroundHelloWorld1(ProceedingJoinPoint pjp){
        System.out.println("around Message1");
        try {
            //执行切点方法
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * 在切点方法执行之后，执行此方法
     */
    @After("pt1()")
    public void afterHelloWorld1(){
        System.out.println("after Message1");
    }

}
