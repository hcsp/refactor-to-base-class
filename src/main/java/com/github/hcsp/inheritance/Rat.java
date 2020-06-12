package com.github.hcsp.inheritance;

public class Rat {
    private String name;

    public Rat(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public void zhizhi() {
        System.out.println("吱吱" + name);
    }
}
