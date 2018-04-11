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
//        Car car = (Car)app.getBean("car");
//        System.out.println(car);
//
//        car = (Car) app.getBean("car2");
//        System.out.println(car);
//
//        Person person = (Person) app.getBean("person");
//        System.out.println(person);
        Person person2 = (Person) app.getBean("person2");
        System.out.println(person2);

//        Person person3 = (Person) app.getBean("person3");
//        System.out.println(person3);

        DataSource dataSource = (DataSource) app.getBean("dataSource");
        System.out.println(dataSource.getProperties());
        System.out.println("********");
        System.out.println(dataSource);
        Person person5 = (Person) app.getBean("person5");
        System.out.println(person5);


    }
}
