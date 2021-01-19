package com.itheima.demo;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println("Student类加载器 " +Student.class.getClassLoader());
        System.out.println("String 类加载器"+ String.class.getClassLoader());


    }
}
