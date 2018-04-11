package com.spring_02;

public class Address {

    private String area;
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
