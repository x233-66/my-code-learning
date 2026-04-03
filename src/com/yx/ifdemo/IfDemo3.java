package com.yx.ifdemo;

public class IfDemo3 {
    public static void main(String[] args) {
       /* if(逻辑表达式){
        *   语句体A
        * }else{
        *   语句体B
        * }/
        */

        double score = 80;
        if(score>=0 && score <= 100) {
            if (score >= 60) {
                System.out.println("通过");

            } else {
                System.out.println("再接再厉");
            }
        }
        else{
            System.out.println("输入的分数有误");
        }
    }
}
