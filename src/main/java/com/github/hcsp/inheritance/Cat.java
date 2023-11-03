package com.github.hcsp.inheritance;
 class Cat extends Main {                       //cat继承了main类
    Cat(String name) {                          //cat的构造器
        super(name);                            //super来引用父类构造器传递name参数
    }
    void meow() {                               //meow方法的声明
        System.out.println(this.getName() +"喵");
    }
}



