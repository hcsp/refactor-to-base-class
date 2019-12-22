package com.github.hcsp.inheritance;

public class Rat extends Animal{

    public Rat(String name) {
        super(name);
    }

    public void zhizhi() {
        System.out.print("吱吱");
        super.getName();
    }
}
