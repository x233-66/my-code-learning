package com.yx.switchdemo;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*switch新特性：JDK12预览版  JDK14正式版
        * 一、箭头标签（不会涉及到case穿透现象）
        * 二、case后面可以写多个值
        * 三、switch可以有运行结果
        * 四、yield关键字*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int number = sc.nextInt();
/*        switch( number) {
            case 1 -> System.out.println("一");
            case 2-> System.out.println("二");
            case 3, 4-> System.out.println("三");
            default ->System.out.println("没有这个星期");
        }*/

        //如果下面，我要继续使用switch的结果，那么，必须使用yield关键字
        String result = switch( number) {
            case 1 -> {
               yield "一";
            }
            case 2-> "二";
            case 3, 4-> "三";
            default ->"没有这个星期";
        };
        System.out.println(result);
    }
}
