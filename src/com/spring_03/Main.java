package com.spring_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import javax.sql.DataSource;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-connection.xml");
//        DataSource dataSource =(DataSource)applicationContext.getBean("dataSource");
//        System.out.println(dataSource.getConnection());
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-SpEL.xml");
//        Address address = (Address)app.getBean("address");
//        System.out.println(address);
//        Car car = (Car)app.getBean("car");
//        System.out.println(car);
//        Person person = (Person)app.getBean("person");
//        System.out.println(person);

        System.out.println("---------------------------");
        Student student = (Student) app.getBean("student");
        System.out.println(student);
        ((ClassPathXmlApplicationContext) app).close();
    }
}
