package com.github.hcsp.inheritance;

public class Main {
//    public static void main(String[] args) {
//        Cat cat = new Cat("ABC");
//        cat.meow();
//        cat.sayMyName();
//
//        Dog dog = new Dog("BCD");
//        dog.wang();
//        dog.sayMyName();
//
//        Rat rat = new Rat("BCD");
//        rat.zhizhi();
//        rat.sayMyName();
//    }
        String name;

        public Main(String name) {
            this.name = name;
        }

        public void sayMyName() {
            System.out.println("我的名字是" + name);
        }
}
