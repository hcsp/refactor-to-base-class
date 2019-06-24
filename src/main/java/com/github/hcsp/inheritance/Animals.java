package com.github.hcsp.inheritance;

public class Animals {
    protected String name;

    protected Animals(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
