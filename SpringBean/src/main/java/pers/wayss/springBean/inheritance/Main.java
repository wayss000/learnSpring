package pers.wayss.springBean.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-Inheritance.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloInheritance objB = (HelloInheritance) context.getBean("helloInheritance");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
     }
  }