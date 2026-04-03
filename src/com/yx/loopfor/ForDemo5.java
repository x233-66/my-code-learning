package com.yx.loopfor;

import java.util.Scanner;

public class ForDemo5 {

    //累加思想：数字 --->sum
    //统计思想：count --->满足条件 ++
    public static void main(String[] args) {
        int count = 0;
        System.out.println("请输入两个数字：");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double max = a>b?a:b;
        double min = a<b?a:b;
        for(double i=min;i<=max;i++){
            if(i%3==0&&i%5==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
