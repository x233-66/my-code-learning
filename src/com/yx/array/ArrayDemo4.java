package com.yx.array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*
        数组的动态初始化：
            键盘录入5个整数，存入数组当中，并遍历打印

        动态初始化格式：
            数据类型[] 数组名 = new 数据类型[数组的长度];
        */


        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.print("请输入第" + (i+1) + "个元素：");
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
