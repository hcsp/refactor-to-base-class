package com.github.hcsp.inheritance;

public class Animal {
    protected String name;

    protected void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    protected Animal(String name) {
        this.name = name;
    }
}
