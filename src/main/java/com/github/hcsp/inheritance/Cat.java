package com.github.hcsp.inheritance;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }


    public void meow() {
        System.out.println("喵" + name);
    }
}
