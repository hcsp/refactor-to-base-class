package com.github.hcsp.inheritance;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
