package pers.wayss.beanAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainByType {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-byType.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}