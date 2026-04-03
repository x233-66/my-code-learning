package com.yx.operator;

import java.util.Scanner;

public class OperatorDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的身高：");
        Double a = sc.nextDouble();
        System.out.println("请输入你的身高：");
        Double b = sc.nextDouble();
        boolean c = a>b;
        System.out.println("我比你高吗？"+c);
    }
}
