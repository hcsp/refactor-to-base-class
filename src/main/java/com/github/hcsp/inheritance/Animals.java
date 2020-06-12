package com.github.hcsp.inheritance;

/**
 * create by crashLab on 2020/06/12.
 **/
public class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字"+name);
    }

}
