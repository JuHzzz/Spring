package com.spring;

public class Test {

    private  String  nameer;

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.nameer = name;
    }

    public Test(){
        System.out.println("Test Constructor!");
    }

    public void hello(){
        System.out.println("Hello:"+nameer);
    }
}
