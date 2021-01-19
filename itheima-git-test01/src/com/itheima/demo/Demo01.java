package com.itheima.demo;

public class Demo01 {

    static int count =0;
    public static void main(String[] args) {
        method();
        System.out.println("结束");
    }
    public static void method(){
        if (count==10000){
            return;
        }
        count++;
        System.out.println(count);
        method();

        System.out.println("method方法");
    }
}
