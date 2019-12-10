package com.github.hcsp.inheritance;

public class Rat extends Animal {
    private String name;

    public Rat(String name) {
        super(name);
    }

    public void zhizhi() {
        System.out.println("吱吱" + getName());
    }
}
