package com.github.hcsp.inheritance;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    void wang() {
        voice("汪");
    }
}
