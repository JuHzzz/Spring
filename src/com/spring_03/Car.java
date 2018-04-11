package com.spring_03;

public class Car {

    private String name;
    private double price;
    private double Circle;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Cicle=" + Circle +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCircle() {
        return Circle;
    }

    public void setCircle(double circle) {
        Circle = circle;
    }
}
