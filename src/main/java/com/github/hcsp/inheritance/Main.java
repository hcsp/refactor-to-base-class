package com.github.hcsp.inheritance;

public class Main {
    public String name;
    public Main(String name){
        this.name = name;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
    public void saySomething() {
        System.out.println("吱吱" + name);
    }
}
