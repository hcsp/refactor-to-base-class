package com.github.hcsp.inheritance;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵" + getName());
    }
}
