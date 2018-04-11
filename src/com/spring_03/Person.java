package com.spring_03;

public class Person {

    private  Address address;
    private Car car;
    private String info;

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", car=" + car +
                ", info='" + info + '\'' +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
