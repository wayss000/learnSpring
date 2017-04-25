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