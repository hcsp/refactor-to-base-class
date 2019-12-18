package com.github.hcsp.inheritance;

public class Dog extends Animal{

    public Dog(String name) {

        setName(name);
    }

    public void wang() {

        System.out.println("汪" + getName());
    }
}
