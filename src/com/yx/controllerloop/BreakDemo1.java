package com.yx.controllerloop;

public class BreakDemo1 {
    public static void main(String[] args) {
        /*break关键字：
        *   不能单独出现的，只能switch或者循环当中，表示结束、跳出的意思*/

        //循环快速出现的方式：次数.fori + 回车

        for (int i = 0; i < 100; i++){
            if (i == 15){
                break;//看到break，循环直接结束
            }
            System.out.println(i);
        }
    }
}
