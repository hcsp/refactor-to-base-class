package com.github.hcsp.inheritance;

public class Cat extends SmallAnimal{
 
	public Cat(String name) {
		setName(name);
	}
	
    public void meow() {
        System.out.println("喵" + getName());
    }
}
