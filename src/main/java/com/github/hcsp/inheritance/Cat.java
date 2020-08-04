package com.github.hcsp.inheritance;

public class Cat extends SayMyName {
    public Cat(String name) {
        this.name = name;
    }
    public void meow() {
        System.out.println("喵" + name);
    }
}
