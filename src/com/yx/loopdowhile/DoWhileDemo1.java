package com.yx.loopdowhile;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        /*do...while格式：
        * 初始化语句
        * do{
        *   循环体语句
        *   条件控制语句
        * }while(条件判断语句);*/

        //do...while特点:先执行后判断，循环体至少执行一次
        //for、while特点：先判断后执行，循环体可能不执行


        int i = 1;
        do{
            System.out.println("hello world");
            i++;
        }while(i<=5);
    }
}

