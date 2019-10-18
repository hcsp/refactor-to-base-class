package com.github.hcsp.inheritance;

public class Animal {
    private String name;
    public String getName() {
        return name;
    }
    Animal(String name){
        this.name = name;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + this.name);
    }
}
