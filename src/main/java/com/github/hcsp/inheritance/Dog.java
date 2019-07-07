package com.github.hcsp.inheritance;

 class Dog extends Animal{

     Dog(String name) {
        super(name);
    }


     void wang() {
        System.out.println("汪" + super.name);
    }
}
