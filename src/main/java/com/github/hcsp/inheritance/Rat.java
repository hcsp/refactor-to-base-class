package com.github.hcsp.inheritance;

public class Rat extends Animals{

    public Rat(String name) {
        this.name = name;
    }

    public void zhizhi() {
        System.out.println("吱吱" + name);
    }
}
