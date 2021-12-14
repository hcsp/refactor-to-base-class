package com.github.hcsp.inheritance;

public class Animal {
    public String name;
    public Animal( String mayName){
        name=mayName;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
