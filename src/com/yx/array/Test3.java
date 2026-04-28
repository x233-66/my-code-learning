package com.yx.array;

public class Test3 {
    public static void main(String[] args) {
        /*
        前置练习：
            交换两个变量中的数据
        */

        int a = 10;
        int b = 20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
