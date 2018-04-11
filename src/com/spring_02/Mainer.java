package com.spring_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainer {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-test.xml");
//        Person person = (Person) app.getBean("person");
//        System.out.println(person);
//        person = (Person)app.getBean("person2");
//        System.out.println(person);
//        person = (Person)app.getBean("person3");
//        System.out.println(person);
//        Car car = (Car) app.getBean("car");
//        System.out.println(car);
//        Car car2 = (Car) app.getBean("car2");
//        System.out.println(car2);

        Address address = (Address)app.getBean("address");
        System.out.println(address);
        address = (Address)app.getBean("address2");
        System.out.println(address);

        Car car = (Car)app.getBean("car");
        System.out.println(car);
        Car car2 = (Car)app.getBean("car2");
        System.out.println(car2);
        Car car3 = (Car)app.getBean("car");
//        Person person = (Person) app.getBean("person");
//        System.out.println(person);
//        person = (Person) app.getBean("person2");
//        System.out.println(person);
        System.out.println(car==car2);
        System.out.println(car==car3);

    }
}
