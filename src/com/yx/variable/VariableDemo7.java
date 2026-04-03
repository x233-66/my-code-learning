package com.yx.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        //BMI = 体重/身高的平方
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("我的BMI是："+bmi);
    }
}
