package com.spring;

import java.util.List;
import java.util.Map;

public class Person {

    private String name;
    private int age;
    private Car myCar;
    private List<Car> cars;
    private Map<String,Car> cars2;
    public Person() {

    }

    public Person(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public Person(String name, int age, Car myCar, List<Car> cars, Map<String, Car> cars2) {
        this.name = name;
        this.age = age;
        this.myCar = myCar;
        this.cars = cars;
        this.cars2 = cars2;
    }

    public void setCars2(Map<String, Car> cars2) {
        this.cars2 = cars2;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myCar=" + myCar +
                ", cars=" + cars +
                '}';
    }

    public Person(String name, int age, Car myCar, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.myCar = myCar;
        this.cars = cars;
    }

    public Person(String name, int age, Car myCar) {
        this.name = name;
        this.age = age;
        this.myCar = myCar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }

}
