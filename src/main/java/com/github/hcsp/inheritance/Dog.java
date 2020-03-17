package com.github.hcsp.inheritance;

public class Dog extends Main{
//    private String name;
//
//    public Dog(String name) {
//        this.name = name;
//    }
//
//    public void sayMyName() {
//        System.out.println("我的名字是" + name);
//    }
//
    public Dog(String name){
        super(name);
}

    public void wang() {
        System.out.println("汪" + name);
    }
}
