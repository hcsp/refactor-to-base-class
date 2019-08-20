package com.github.hcsp.inheritance;

public class AbstractAnimal {
    protected String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
