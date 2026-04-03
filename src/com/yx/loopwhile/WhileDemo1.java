package com.yx.loopwhile;

public class WhileDemo1 {
    public static void main(String[] args) {
        /*while循环格式：
        * 初始化语句
        * while(条件判断语句){
        *   循环体语句
        *   条件控制语句
        * }*/

        int i = 1;
        while(i<=10){
            System.out.println("游戏人物跳跃了一次");
            i++;
        }
    }
}

/*for循环和while循环的区别：
* for循环:知道循环次数或者循环的范围
* while循环中：不知道循环的次数和范围，只知道循环的结束条件*/