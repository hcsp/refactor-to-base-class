package com.github.hcsp.inheritance;

public class animal {
    String name;
    public animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
