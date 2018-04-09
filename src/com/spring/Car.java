package com.spring;

public class Car {



    private String name;
    private String area;
    private int size;
    private double price;

    public Car(String name, String area, int size) {
        super();
        this.name = name;
        this.area = area;
        this.size = size;
    }

    public Car(String name, String area, double price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }


}
