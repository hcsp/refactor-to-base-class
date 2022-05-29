package com.github.hcsp.inheritance;

/**
 * @author Lilei
 * @date 2022/5/29-@19:40
 */
public class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
