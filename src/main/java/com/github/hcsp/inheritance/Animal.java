package com.github.hcsp.inheritance;

public class Animal {
    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }


    private final String name;
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
