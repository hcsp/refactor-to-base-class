package com.github.hcsp.inheritance;

public class Anmail {
    public String getName() {
        return name;
    }

    private String name;

    public Anmail(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
