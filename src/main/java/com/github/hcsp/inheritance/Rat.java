package com.github.hcsp.inheritance;

public class Rat extends Pet {

    public Rat(String name) {
        super(name);
    }

    public void zhizhi() {
        System.out.println("吱吱" + name);
    }
}
