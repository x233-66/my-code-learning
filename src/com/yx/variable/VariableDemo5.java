package com.yx.variable;

//确定Scanner的位置
import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args) {

    /*
    键盘录入：
    第一步：找到Scanner这个打工人
    第二步：让Scanner干活
     */

        Scanner sc = new Scanner(System.in);
        //接收整数
        /*int num = sc.nextInt();
        System.out.println("你输入的整数是："+num);*/
        //接收小数
        /*double num2 = sc.nextDouble();
        System.out.println("你输入的小数是："+num2);*/
        //接收文本(字符串)
        String str= sc.next();
        System.out.println("你输入的字符串是："+str);

    }

}
