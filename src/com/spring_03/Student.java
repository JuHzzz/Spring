package com.spring_03;

public class Student {

    public Student(){
        System.out.println("Student Constructor ...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    private  String name;

    public void init(){
        System.out.println("init Method ...");
    }

    public void destroy(){
        System.out.println("destroy method ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Set Method ...");
        this.name = name;
    }
}
