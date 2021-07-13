package com.github.hcsp.inheritance;

public class Dog extends 动物 {
    public Dog(String name) {
        super(name);
    }

    public void wang() {
        System.out.println("汪" + name);
    }
}
