package com.spring_02;


public class Person {

    private String name;
    private Address address;
    private Car car;




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", car=" + car +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
