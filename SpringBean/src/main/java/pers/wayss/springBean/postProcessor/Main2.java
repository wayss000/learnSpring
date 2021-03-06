package pers.wayss.springBean.postProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.wayss.springBean.BeanLifeCycle;

public class Main2 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans-lifecycle.xml");
        BeanLifeCycle obj = (BeanLifeCycle) context.getBean("beanLifeCycle");
        obj.getMessage();
        context.registerShutdownHook();
    }
}

/*
 * 程序的执行结果：
BeforeInitialization : beanLifeCycle
Bean is going through init.
AfterInitialization : beanLifeCycle
Your Message : Hello World!
Bean will destroy now.
 */
