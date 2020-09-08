package com.github.hcsp.inheritance;

public class Animal {
    //私有化
    private final String name;

    //获取传进来的name赋值给name
    public Animal(String name) {
        this.name = name;
    }

    //获取传进来的name
    public String getName() {
        return name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
