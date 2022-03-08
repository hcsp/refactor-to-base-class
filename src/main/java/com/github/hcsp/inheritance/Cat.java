package com.github.hcsp.inheritance;

public class Cat extends Main{
    public Cat(String name) {
        super(name);
    }
    public void meow() {
        System.out.println("喵" + name);
    }
    public static void main(String[] args) {
        Cat cat = new Cat("miao");

        cat.sayMyName();
        cat.meow();
    }
}
