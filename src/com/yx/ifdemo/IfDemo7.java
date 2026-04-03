package com.yx.ifdemo;

import java.util.Scanner;

public class IfDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额：");
        double rechargeAmont = sc.nextDouble();
        double balance = 0;

        if (rechargeAmont > 0) {
            if (rechargeAmont <= 1000) balance = rechargeAmont-39;
            else if (rechargeAmont <= 2000) balance = rechargeAmont+200-39;
            else if (rechargeAmont <= 3000) balance = rechargeAmont+500-35;
            else if (rechargeAmont <= 5000) balance = rechargeAmont+700-35;
            else if (rechargeAmont <= 10000) balance = rechargeAmont+1300-35;
            else if (rechargeAmont <= 20000) balance = rechargeAmont+2500-30;
            else if (rechargeAmont <= 50000) balance = rechargeAmont+6000-30;
            else balance = balance = rechargeAmont+15000-30;
            System.out.println("余额为："+balance);

        }
    }
}
