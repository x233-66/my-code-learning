package com.yx.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        /*
        描述:
            给定秒数seconds,将其转换为对应的小时数、分钟数和秒数,使得总时间不变,但分钟数和秒数都不超过59
        输入描述:
            在一行中输入一个整数seconds,表示要转换的秒数,满足(0<=seconds<=10⁸)
        输出描述:
            一行,包含三个整数,依次为输入整数对应的小时数、分钟数和秒数(可能为零),中间用一个空格隔开
        * */

        Scanner sc = new Scanner(System.in);
        double seconds = sc.nextDouble();
        int hour = (int) seconds/3600;
        int minute = (int) (seconds%3600)/60;
        int second = (int) (seconds%3600)%60;
        System.out.println(hour+" "+minute+" "+second);
    }
}
