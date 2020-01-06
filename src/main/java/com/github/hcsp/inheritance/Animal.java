package com.github.hcsp.inheritance;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

public class Animal {

    private String name;

    //写了自己定义的构造器，默认构造器就会没有,
    // 与此同时,子类就需要一个与这里的父类相匹配的构造器,同时还需要super关键字
    public Animal (String Name){
        this.setName(Name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayMyName(){
        System.out.println("我的名字是"+name);
    }


}
