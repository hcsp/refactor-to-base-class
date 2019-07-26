package com.github.hcsp.inheritance;

class Animals {
    String name;

    Animals(String name) {
        this.name = name;
    }

    void sayMyName(){
        System.out.println("我的名字是" + name);
    }
}
