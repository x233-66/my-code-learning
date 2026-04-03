package com.yx.operator;

import java.util.Scanner;

public class OperatorDemo11 {
    public static void main(String[] args) {
        //三元运算符
        //格式：关系表达式 ? 表达式1 : 表达式2；如果是true，则返回表达式1，否则返回表达式2
        //求最大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
