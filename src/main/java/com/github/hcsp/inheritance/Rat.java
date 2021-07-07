package com.github.hcsp.inheritance;

public class Rat extends Animal{
    public Rat(String name){
        super(name);
    }
//    public void rat(String name,String voice){
//        super.sayMyName(name);
//        super.call(voice,name);
//    }
//    private String name;
//
//    public Rat(String name) {
//        this.name = name;
//    }
//
    public void sayMyName() {
        super.sayMyName(name);
    }

    public void zhizhi() {
        super.call("吱吱",name);

    }
}
