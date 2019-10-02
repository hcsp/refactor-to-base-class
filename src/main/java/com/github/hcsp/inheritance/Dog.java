package com.github.hcsp.inheritance;

public class Dog extends Animal {

    public Dog(String name) {
      super(name);
    }

    void wang() {
        System.out.println("汪" + name);
    }
}
