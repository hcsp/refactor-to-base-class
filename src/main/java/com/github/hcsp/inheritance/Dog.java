package com.github.hcsp.inheritance;

public class Dog  extends Animal{
    private String name;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public void wang() {
        System.out.println("汪" + name);
    }
}
