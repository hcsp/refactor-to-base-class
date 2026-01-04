package com.github.hcsp.inheritance;

class Cat extends Animal{  // 子类先继承父类
    Cat(String name){                  // 子类构造器
        super(name);        // 用super来调用父类构造器
    }

    void meow() {
        System.out.println("喵" + name);
    }


}
