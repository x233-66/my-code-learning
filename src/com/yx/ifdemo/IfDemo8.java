package com.yx.ifdemo;

import java.util.Scanner;

public class IfDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("bmi="+bmi);
        if (bmi >= 0) {
            if (bmi < 18.5) {
                System.out.println("消瘦");
                System.out.println("健康风险：部分增加");
            } else if (bmi >= 18.5 && bmi < 23.9) {
                System.out.println("正常");
                System.out.println("健康风险：正常");
            } else if (bmi >= 23.9 && bmi < 25.9) {
                System.out.println("偏胖");
                System.out.println("健康风险：增加");
            } else if (bmi >= 25.9 && bmi < 28.9) {
                System.out.println("肥胖");
                System.out.println("健康风险：中度增加");
            } else {
                System.out.println("严重肥胖");
                System.out.println("健康风险：严重增加");
            }
        }

    }
}
