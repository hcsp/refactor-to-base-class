package com.github.hcsp.inheritance;

public class Dog extends Animal{

    public Dog(String Name) {
        super(Name);
    }

    public void wang() {
        System.out.println("汪" +getName());
    }
}
