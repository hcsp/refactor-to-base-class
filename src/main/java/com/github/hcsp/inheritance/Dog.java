package com.github.hcsp.inheritance;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    public void wang() {
        System.out.println("汪"+ name);
    }
}
