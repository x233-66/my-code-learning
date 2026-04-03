package com.yx.ifdemo;

import java.util.Scanner;

public class IfDemo9 {
    //细节：If语句条件范围小的放前面
    public static void main(String[] args) {
        //判断三角形
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的3个边长：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a){
            if(a==b&&b==c) System.out.println("等边三角形");
            else if(a==b||b==c||a==c) System.out.println("等腰三角形");
            else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) System.out.println("直角三角形");
            else System.out.println("普通三角形");
        }
        else System.out.println("非三角形");
    }
}
