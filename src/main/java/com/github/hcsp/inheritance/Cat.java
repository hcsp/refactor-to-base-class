package com.github.hcsp.inheritance;

public class Cat extends Anmail {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵" + super.getName());
    }
}
