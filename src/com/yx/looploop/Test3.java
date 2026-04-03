package com.yx.looploop;

public class Test3 {
    public static void main(String[] args) {
        /*打印平行四边形

           ##******
           #******#
           ******##

        */

        for(int i = 1;i<=3;i++){
            for(int j = i;j<=2;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
