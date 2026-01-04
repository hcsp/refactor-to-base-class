package com.github.hcsp.inheritance;

class Dog extends Animal{
    Dog(String name){       // 子类构造器
        super(name);        // 用 super 调用父类构造器
    }

    void wang() {
        System.out.println("汪" + this.name);
    }
}
