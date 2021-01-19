package com.itheima.demo;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        File file = new File("itheima-git-test01/src");
        findJavaFile(file);
    }
    public static void findJavaFile(File file){
        File[] filesArr = file.listFiles();
        if (filesArr != null){
            for (File file1 : filesArr) {
                if (file1.isFile() && file1.getName().endsWith(".java")){
                    System.out.println(file1);
                }
                if (file1.isDirectory()){
                    findJavaFile(file1);
                }
            }
        }

    }
}
