package com.github.hcsp.inheritance;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
