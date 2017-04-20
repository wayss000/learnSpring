package pers.wayss.springApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //两种创建方式
        //绝对路径创建方式
        ApplicationContext fileContext = new FileSystemXmlApplicationContext
//              ("D:/code/learnSpring/SpringApplicationContext/src/main/resources/Beans.xml");
        ("E:/code/java-web/learnSpring/SpringApplicationContext/src/main/resources/Beans.xml");
        HelloWorld obj1 = (HelloWorld) fileContext.getBean("helloWorld");
        obj1.getMessage();
        
        //相对路径创建方式
        ApplicationContext classContext = new ClassPathXmlApplicationContext("classpath:Beans.xml");
        //此处的helloWorld对应Beans.xml中配置的<bean>标签的id
        HelloWorld obj2 = (HelloWorld) classContext.getBean("helloWorld");
        obj2.getMessage();
     }
  }