package com.github.hcsp.inheritance;

public class Rat extends SmallAnimal {
	
	public Rat(String name) {
		setName(name);
	}

    public void zhizhi() {
        System.out.println("吱吱" + getName());
    }
}
