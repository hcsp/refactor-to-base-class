package com.github.hcsp.inheritance;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    void meow(){
        voice("喵");
    }
}
