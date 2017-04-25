package pers.wayss.springBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试运行类
 * @author Wayss
 * @date 2017年4月25日
 */
public class Main {
    public static void main(String[] args) {
        //测试声明周期为单例模式的bean
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-singleton.xml");
        HelloWorld singletonObjA = (HelloWorld) context.getBean("helloWorld");
        System.out.println("单例模式：singletonObjA和singletonObjB用的是同一个对象");
        singletonObjA.setMessage("I'm object A");
        singletonObjA.getMessage();
        HelloWorld singletonObjB = (HelloWorld) context.getBean("helloWorld");
        singletonObjB.getMessage();
        
        //测试生命周期为prototype模式的bean
        context = new ClassPathXmlApplicationContext("Beans-prototype.xml");
        HelloWorld prototypeObjC = (HelloWorld) context.getBean("helloWorld");
        System.out.println("原型模式：prototypeObjC和prototypeObjD用的是两个不同的对象");
        prototypeObjC.setMessage("I'm object C");
        prototypeObjC.getMessage();
        HelloWorld prototypeObjD = (HelloWorld) context.getBean("helloWorld");
        prototypeObjD.getMessage();
        
        //测试bean的默认init和destroy方法，执行顺序
        AbstractApplicationContext  contextLifeCycle = new ClassPathXmlApplicationContext("Beans-lifecycle.xml");
        BeanLifeCycle beanLifyCyc = (BeanLifeCycle) contextLifeCycle.getBean("beanLifeCycle");
        beanLifyCyc.setMessage("I'm object lifeCyele");
        beanLifyCyc.getMessage();
        contextLifeCycle.registerShutdownHook();
     }
  }