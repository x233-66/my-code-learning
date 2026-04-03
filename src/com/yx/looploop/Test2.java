package com.yx.looploop;

public class Test2 {
    public static void main(String[] args) {
        /*打印正三角和倒三角*/

        //打印正三角
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //打印倒三角
        for(int i = 5;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
