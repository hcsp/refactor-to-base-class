package com.github.hcsp.inheritance;

// 动物
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("ABC");
        cat.meow();
        cat.sayMyName();

        Dog dog = new Dog("BCD");
        dog.wang();
        dog.sayMyName();

        Rat rat = new Rat("BCD");
        rat.zhizhi();
        rat.sayMyName();
    }
}
