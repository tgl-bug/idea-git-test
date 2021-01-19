package com.itheima.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo07 {
    public static void main(String[] args) throws Exception {
        //获取字节码文件
        Class<Student> c = Student.class;
        //获取Student类的所有的构造方法对象
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        //遍历所有的构造方法对象
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }


        //创建Student对象
        Constructor<Student> cons = c.getDeclaredConstructor(String.class, int.class);
        //给他传值
        Student student = cons.newInstance("zhangsan", 30);

        //获取Studen类的所有方法
        Method[] mArr = c.getDeclaredMethods();
        for (Method m : mArr) {
            System.out.println(m);

            if (m.getName().equals("sleep")){
                m.setAccessible(true);
                m.invoke(student);
            }
            if (m.getName().equals("eat")){

                m.invoke(student,"shi");
            }
        }
    }
}
