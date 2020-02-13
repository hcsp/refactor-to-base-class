package com.github.hcsp.inheritance;

public class Animal {
    static String name;

    public Animal(String name) {
        Animal.name = name;
    }

    public void sayMyName() {

        System.out.println("我的名字是" + name);
    }
}
