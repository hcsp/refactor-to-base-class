package com.github.hcsp.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("ABC");
        cat.voice();
        cat.sayMyName();

        Dog dog = new Dog("BCD");
        dog.voice();
        dog.sayMyName();

        Rat rat = new Rat("BCD");
        rat.voice();
        rat.sayMyName();
    }
}
