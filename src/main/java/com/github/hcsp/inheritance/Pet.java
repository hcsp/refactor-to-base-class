package com.github.hcsp.inheritance;

public class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public void sayMyName () {
        System.out.println("我的名字是" + this.name);
    }
}
