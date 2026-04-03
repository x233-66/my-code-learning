package com.yx.operator;

import java.util.Scanner;

public class OperatorDemo9 {
    public static void main(String[] args) {
        //逻辑运算符 & | !
        //输入一个整数，判断是否在5~10之间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean result = num >= 5 & num <= 10;
        System.out.println(result);

        //应用场景：登录验证等等

    }
}
