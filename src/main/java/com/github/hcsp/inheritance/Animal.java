package com.github.hcsp.inheritance;

public class Animal {
    private String name;
    Animal(String name) {
        this.name = name;
    }
    void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
