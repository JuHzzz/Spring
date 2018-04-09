package com.spring;

public class Test {

    private  String  name;

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.name = name;
    }

    public Test(){
        System.out.println("Test Constructor!");
    }

    public void hello(){
        System.out.println("Hello:"+name);
    }
}
