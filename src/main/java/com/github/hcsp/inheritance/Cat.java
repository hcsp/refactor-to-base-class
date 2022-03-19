package com.github.hcsp.inheritance;

public class Cat extends Ainmal {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵" + super.name);
    }
}
