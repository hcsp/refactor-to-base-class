package com.github.hcsp.inheritance;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: Animal.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/11 21:19
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}