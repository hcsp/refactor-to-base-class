package com.github.hcsp.inheritance;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
