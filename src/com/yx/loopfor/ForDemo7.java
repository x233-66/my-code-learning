package com.yx.loopfor;

import java.util.Scanner;

public class ForDemo7 {
    public static void main(String[] args) {
        /*求数列前n项和(牛客）
        * S(n)=1-2+3-4+...*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=num;i++) {
            if(i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
