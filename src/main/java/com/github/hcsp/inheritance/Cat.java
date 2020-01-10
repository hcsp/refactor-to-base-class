package com.github.hcsp.inheritance;

public class Cat extends Animal{
      Cat(String name){
        super(name);
      }
//      public void cat(String name,String voice){
//          super.sayMyName(name);
//          super.call(voice,name);
//      }

//    private String name;
//
//    public Cat(String name) {
//        this.name = name;
//    }

//    public void sayMyName() {
//        super.sayMyName(name);
//    }

    public void meow() {
        System.out.println("喵" + name);
    }


}
