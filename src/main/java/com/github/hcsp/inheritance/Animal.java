package com.github.hcsp.inheritance;

/**
 * @author Ruby
 * @date 2020/12/11 12:41
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
