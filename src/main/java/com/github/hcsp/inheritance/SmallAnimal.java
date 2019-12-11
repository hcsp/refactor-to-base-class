/**
 * 
 */
package com.github.hcsp.inheritance;

/**
 * @author sunp
 *
 */
public class SmallAnimal {
	
	private String name;
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
