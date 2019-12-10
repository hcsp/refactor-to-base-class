package com.github.hcsp.inheritance;

public class Animal {

    public  Animal (String Name)
    {
        this.setName(Name);
    }

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + this.Name);
    }
}
