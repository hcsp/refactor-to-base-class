package com.github.hcsp.inheritance;

public class Rat extends Animal{

    public Rat(String name) {
        super(name);
    }


    public void zhizhi() {
        System.out.println("吱吱" + name);
    }
}
