package com.github.hcsp.inheritance;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        super(name);
    }



    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void meow() {
        System.out.println("喵" + name);
    }
}
