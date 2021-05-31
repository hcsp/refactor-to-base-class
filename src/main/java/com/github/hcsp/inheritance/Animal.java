package com.github.hcsp.inheritance;

public class Animal {
    private String name;
    public Animal(String nom){
        this.name=nom;
    }
    public void sayMyName(){
        System.out.println("我的名字是"+name);
    }
    public void appeler(String son){
        System.out.println(son+name);
    }
}
