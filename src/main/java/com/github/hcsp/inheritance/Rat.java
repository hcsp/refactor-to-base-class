package com.github.hcsp.inheritance;

 class Rat extends Animal{

     Rat(String name) {
        super(name);
    }


     void zhizhi(){
        System.out.println("吱吱" + super.name);
    }
}
