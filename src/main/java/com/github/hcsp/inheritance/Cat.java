package com.github.hcsp.inheritance;

public class Cat extends  Animal{
    private String name;

    Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵" + name);
    }
}
