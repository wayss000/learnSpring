package pers.wayss.springAOP.interceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试运行类
 * @author Wayss
 * @date 2018/07/21
 */
public class Main {
    public static void main(String[] args) {
        //加载Bean配置文件，注入Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-config.xml");

        //从Spring中获取对象
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();

        objA.getMessage2();

     }
  }