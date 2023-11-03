package com.github.hcsp.inheritance;
   class Main {                           //声明一个父类Main
        private String name;              //父类的成员变量name

       public String getName() {         //name是private➡️用getter&setter
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       Main(String name) {                 //父类构造器
            this.name = name;
        }

        public void sayMyName() {           //父类的成员方法
            System.out.println("我的名字是" + name);
        }

       public static void main(String[] args) {       //程序入口
            Cat cat = new Cat("ABC");           //new一个cat
            cat.meow();                               //调用cat类的meow方法
            cat.sayMyName();                          //调用cat的saymyname方法

            Dog dog = new Dog("BCD");
            dog.wang();
            dog.sayMyName();

            Rat rat = new Rat("BCD");
            rat.zhizhi();
            rat.sayMyName();
        }
    }
