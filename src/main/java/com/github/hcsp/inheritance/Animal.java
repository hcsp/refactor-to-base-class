package com.github.hcsp.inheritance;

/**
 * creat by nickless
 *
 * @Date 2020/2/17 17:08
 */
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
