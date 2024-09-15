package com.github.hcsp.inheritance;

public class Animal {
    //声明一个存储名字的字符串变量
    private String name;

    //修改名字的方法
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
