package com.itheima.demo;

public class Student {
    public String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }
    public void eat(String foodName){
        System.out.println("正在吃："+foodName);
    }
    public void sleep(){
        System.out.println("正在睡觉。。。");
    }
}
