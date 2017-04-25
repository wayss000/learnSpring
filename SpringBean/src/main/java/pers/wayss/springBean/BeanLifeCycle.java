package pers.wayss.springBean;

/**
 * 带有init和destroy方法的bean,演示bean初始化的顺序
 * @author Wayss
 * @date 2017年4月25日
 */
public class BeanLifeCycle {
    private String message;

    public void setMessage(String message){
       this.message  = message;
    }
    public void getMessage(){
       System.out.println("Your Message : " + message);
    }
    public void init(){
       System.out.println("Bean is going through init.");
    }
    public void destroy(){
       System.out.println("Bean will destroy now.");
    }
 }