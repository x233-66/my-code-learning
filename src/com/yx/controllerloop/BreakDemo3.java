package com.yx.controllerloop;

import java.util.Scanner;

public class BreakDemo3 {

    /*键盘录入一个大于等于2的整数，判断是否为质数
    *
    * 质数：只能被1和自身整除的数*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = 0;
        while( true) {
            System.out.println("请输入一个大于等于2的整数:");
            n = sc.nextInt();
            if (n >= 2) {
                break;
            }
            else {
                System.out.println("输入的数字小于2，请重新输入");
            }
        }
        for (int i = 2; i < (n/2); i++) {
            if (n % i == 0) {
                count++;
                break;//只要找到一个数能被n整除，则不是质数，退出循环
            }
        }
            if (count == 0) {
                System.out.println("是质数");
            }
            else {
                System.out.println("不是质数");
            }
    }
}
