package com.github.hcsp.inheritance;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
//    public void dog(String name,String voice){
//        super.sayMyName(name);
//        super.call(voice,name);
//    }
//    private String name;
//
//    public Dog(String name) {
//        this.name = name;
//    }

//    public void sayMyName() {
//        super.sayMyName(name);
//    }

    public void wang() {
        System.out.println("汪" + name);
    }
}
