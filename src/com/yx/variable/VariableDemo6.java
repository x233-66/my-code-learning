package com.yx.variable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
       /* 定义两个整数类的变量num1和num2,键盘录入数据分别为两个变量赋值
          求两个数的和并进行打印*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println(num2);
        int sum = num1+num2;
        System.out.println("两个数的和是："+sum);
    }
}
