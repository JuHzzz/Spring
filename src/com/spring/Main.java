package com.spring;

import com.spring.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
       // Test test = new Test();
        // test.setName("Spring");
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        //Test test = (Test)ctx.getBean("test");
        //test.hello();
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-config.xml");
        Car car = (Car)app.getBean("car");
        System.out.println(car);
        car = (Car) app.getBean("car2");
        System.out.println(car);
    }
}
