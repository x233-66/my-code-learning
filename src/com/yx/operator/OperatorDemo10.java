package com.yx.operator;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {
        //短路逻辑运算符（效率更高，可以只算一边）&& ||

        //键盘录入一个四位整数，判断是否为回文数
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;
        boolean result =ge == qian&&shi == bai;
        System.out.println(result);

    }
}
