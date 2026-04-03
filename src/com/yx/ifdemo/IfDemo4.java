package com.yx.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    //细节：变量只在所属打括号中是有效的
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入price：");
        double price = sc.nextDouble();
        double baolemePrice =price*0.9;
        double meidanPrice = 0;
        if(price>=30){
            meidanPrice = price-10;
        }
        System.out.println("饱了么价格是："+baolemePrice);
        System.out.println("美单价格是："+meidanPrice);
        if(baolemePrice<=meidanPrice){
            System.out.println("饱了么最便宜");
        }
        else{
            System.out.println("美单最便宜");
        }
    }
}
