package com.yx.controllerloop;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        //1.找到Random这个类
        Random r = new Random();

        //生成一个随机数
        //第一种写法：int n = r.nextInt();    默认是在int的取值范围之内获取随机数
        //（重要）第二种写法：小括号写一个数字n，表示随机的最大值，但不包含这个数字 0~n-1
        //（重要）第三种写法：小括号写两个数字a,b，表示随机的取值范围是a~b，包含a，不包含b      JDK17

        int n = r.nextInt(101);
        System.out.println(n);
    }
}
