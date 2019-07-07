package com.github.hcsp.inheritance;

 class Cat extends Animal{

    Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("喵" + super.name);
    }
}
