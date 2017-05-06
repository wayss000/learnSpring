package pers.wayss.beanAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainByName {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-byName.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}