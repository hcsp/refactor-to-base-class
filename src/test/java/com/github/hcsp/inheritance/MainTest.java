package com.github.hcsp.inheritance;

import com.github.hcsp.test.helper.ClassInspector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void behaveCorrectly() {
        Cat cat = new Cat("ABC");
        cat.meow();
        cat.sayMyName();

        Dog dog = new Dog("BCD");
        dog.wang();
        dog.sayMyName();

        Rat rat = new Rat("BCD");
        rat.zhizhi();
        rat.sayMyName();
    }

    @Test
    public void inspectFields() {
        ClassInspector.assertNoPublicFields(Cat.class, Dog.class, Rat.class);
        ClassInspector.assertNoDeclaredFields(Cat.class, Dog.class, Rat.class);
    }

    @Test
    public void inspectMethods() {
        Assertions.assertEquals(1, Cat.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Dog.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Rat.class.getDeclaredMethods().length);
    }
}
