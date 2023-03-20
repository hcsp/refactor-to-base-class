package com.github.hcsp.inheritance;

public class Rat extends Animal {
    public Rat(String name) {
        super.setName(name);
    }

    public void zhizhi() {
        System.out.println("吱吱" + super.getName());
    }
}
