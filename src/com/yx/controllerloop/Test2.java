package com.yx.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        生成1到100之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中为止

        保底机制：
        小保底：只要有三次没有猜中，提示用户猜测的范围 ±5
        大保底：只要有十次没有猜中，猜中了
        */


        //1.生成1到100之间的随机数
        Random r = new Random();
        int n = r.nextInt(1,101);
        int countA = 0;
        int countB = 0;

        while ( true) {         //ctrl+alt+t:选择语句包裹代码块
            //2.开始猜
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guess = sc.nextInt();


            //只要用户猜测一次，计数器就自增一次
            countA++;
            countB++;
            //大保底：只要有十次没有猜中，猜中了
            if(countB == 10){
                guess = n;
            }

            //3.比较
            if (guess > n) {
                System.out.println("猜大了");
            } else if (guess < n) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }

            //小保底业务逻辑，需要写在比较的下面
            //触发时间：没三次没有猜中，就会触发小保底，此时是比较完毕之后，才能断定用户没有猜中
            if(countA % 3 == 0){
                System.out.println("触发小保底机制，随机数的范围："+(n-5)+"~"+(n+5));
            }
        }
    }
}
