package com.github.hcsp.inheritance;

public class Cat extends Animal {
//    private String name;

    public Cat(String name) {
//        this.name = name;
        super(name);
    }

//    public void sayMyName() {
//        System.out.println("我的名字是" + name);
//    }

    public void meow() {
        System.out.println("喵" + this.getName());
//        System.out.println("喵" + super.name); //私有成员无法直接获得，爆红
       /* System.out.println("喵喵" + super.toString());
        System.out.println("喵喵喵" + super.getName());
        System.out.println("喵喵喵喵" + getName());*/
    }
}
