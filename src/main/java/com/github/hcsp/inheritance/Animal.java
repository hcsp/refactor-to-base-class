package com.github.hcsp.inheritance;

public class Animal {
    public String name;

    public Animal(String name){
         this.name=name;
     }

    public void sayMyName(){
        System.out.println("我的名字是"+name);
    }
    public  void call(String voice,String name){
        System.out.println(voice+name);
    }
}
