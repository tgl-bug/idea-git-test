package com.itheima.demo;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println(getSum(5));
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }
}
