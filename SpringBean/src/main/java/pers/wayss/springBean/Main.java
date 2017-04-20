package pers.wayss.springBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-singleton.xml");
        HelloWorld singletonObjA = (HelloWorld) context.getBean("helloWorld");
        System.out.println("单例模式：singletonObjA和singletonObjB用的是同一个对象");
        singletonObjA.setMessage("I'm object A");
        singletonObjA.getMessage();
        HelloWorld singletonObjB = (HelloWorld) context.getBean("helloWorld");
        singletonObjB.getMessage();
        
        context = new ClassPathXmlApplicationContext("Beans-prototype.xml");
        HelloWorld prototypeObjC = (HelloWorld) context.getBean("helloWorld");
        System.out.println("原型模式：prototypeObjC和prototypeObjD用的是两个不同的对象");
        prototypeObjC.setMessage("I'm object A");
        prototypeObjC.getMessage();
        HelloWorld prototypeObjD = (HelloWorld) context.getBean("helloWorld");
        prototypeObjD.getMessage();
     }
  }