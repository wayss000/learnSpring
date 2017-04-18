package pers.wayss.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //DI(Ioc)方式，Spring提供对象，需要的时候只需要声明一个引用即可
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //此处的helloWorld对应Beans.xml中配置的<bean>标签的id
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        
        //传统方式，需要对象的时候new一个对象
        HelloWorld hw = new HelloWorld();
        hw.setMessage("ni hao");
        hw.getMessage();
    }
}