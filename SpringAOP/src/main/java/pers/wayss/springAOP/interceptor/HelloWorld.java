package pers.wayss.springAOP.interceptor;

/**
 * 一个普通的Bean
 * @author Wayss
 * @date 2018/7/20
 */
public class HelloWorld {
    private String message1;
    private String message2;
    public void setMessage1(String message){
       this.message1  = message;
    }
    public void setMessage2(String message){
       this.message2  = message;
    }

    //这是方法就是一个连接点（Join point）
    public void getMessage1(){
       System.out.println("World Message1 : " + message1);
    }

    //这是方法就是一个连接点（Join point）
    @Anno
    public void getMessage2(){
       System.out.println("World Message2 : " + message2);
    }
 }
 /**
  * 总结：
  * getMessage1()和getMessage2()方法都当做了一个切点，
  * 在它们执行时都有其他逻辑发生，
  * 但是通过查看两个方法可以发现：
  *
  * getMessage2()方法上面有注解，
  * 我们可以通过这个注解找到拦截这个注解的切面查看切面逻辑；
  *
  * 但是getMessage1()方法没有，
  * 对于一个没见过这段代码的人来说，
  * 他若是把这个方法名改了，就有可能把逻辑改了，
  * 这在工作中尤其要避免；
  *
  */