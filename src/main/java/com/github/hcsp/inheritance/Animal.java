package com.github.hcsp.inheritance;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
    public void call() {
        System.out.println("喵" + name);
    }
}
