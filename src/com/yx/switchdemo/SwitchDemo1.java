package com.yx.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    /*
    switch(表达式){
        case value1:
            语句1;
            break;
        case value2:
            语句2;
            break;
        default:
            语句3;
    }
     */



/*    细节：表达式：字符/整形byte、short、int/枚举/字符串 --- 跳转表，索引不支持小数，也不支持大的整数long
          case：被匹配的值，只能是真实的数据（不是变量），不允许重复
          break：表示中断，结束switch语句 --- break关键字
          default：所有情况均不匹配时，执行default中的语句 --- 类似if里面的else    */


    /*1.default的位置和省略：
    *
    * 位置：case和default是没有标准的上下之分，位置可以任意地书写
    * 省略：degault是可以省略不写的，在此时如果所有case都不匹配，则没有任何的输出结果
    * 2.case穿透：
    *  写代码的时候，如果break不写，此时会触发case穿透现象
    */



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期：");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("星期一:跑步");
                break;
            case 2:
                System.out.println("星期二：游泳");
                break;
            case 3:
                System.out.println("星期三：慢走");
                break;
            case 4:
                System.out.println("星期四：动感单车");
                break;
            case 5:
                System.out.println("星期五：拳击");
                break;
            case 6:
                System.out.println("星期六：爬山");
                break;
            case 7:
                System.out.println("星期日：好好吃一顿");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
