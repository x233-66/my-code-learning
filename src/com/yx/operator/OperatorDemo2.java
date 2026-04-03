package com.yx.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        /*
        需求:键盘录入一个三位数,将其拆分为个位、十位、百位后，打印在控制台
        */

        //如果是AI自动生成下面的代码,需要点击Scnner,alt+回车(修改错误),选择第一个import即可
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        //alt+p 让AI自动生成代码
        int num = sc.nextInt();
        System.out.println(num);
        //获取个位
        int ge = num%10;
        System.out.println("个位是："+ge);
        //获取十位
        int shi = num/10%10;
        System.out.println("十位是："+shi);
        //获取百位
        int bai = num/100%10;
        System.out.println("百位是："+bai);

        /*公式总结:
                个位=num%10;
                十位=num/10%10;
                百位=num/100%10;
                千位=num/1000%10;
                ...                 */

    }
}
