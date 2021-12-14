package com.github.hcsp.inheritance;

public class Animal {
     String name;

    public Animal(String mayName) {
        this.name = mayName;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
