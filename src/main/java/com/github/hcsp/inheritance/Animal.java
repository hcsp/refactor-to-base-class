package com.github.hcsp.inheritance;

public class Animal {
    String name;  // 父类的成员变量

    public Animal(String name){ // 父类的构造器
        this.name = name;
    }

    public void sayMyName(){  // 父类的成员方法
        System.out.println("我的名字是"+name);
    }

}
