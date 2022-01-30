package com.github.hcsp.inheritance;

public class Dog extends Main{
    public Dog(String name) {
        super(name);
    }

    public void wang() {
        System.out.println("汪" + name);
    }
}
