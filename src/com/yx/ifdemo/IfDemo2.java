package com.yx.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    /*1.If语句大括号的位置：左括号写在上一行的末尾
     * 2.If大括号的省略：如果大括号中的语句只有一行，大括号可以省略
     * 3.小括号后面不能有分号，这样会拆开if的语句结构
     * 4.判断布尔类型的变量，直接把变量写在小括号即可*/


    /*需求：初始最大生命200，受到x点伤害，技能回复y点血，x和y由键盘录入而来
    * 假设：游戏人物不会死亡，最少1点血
    * 问：最终人物血量是多少？*/
    public static void main(String[] args) {
        int hp = 200;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入伤害：");
        int hurt = sc.nextInt();
        hp = hp-hurt;
        if(hp <= 0){
            hp=1;
        }
        System.out.println("请输入技能回复的血量");
        int add = sc.nextInt();
        hp = hp+add;
        if(hp>200){
            hp=200;
        }
        System.out.println("最终血量是："+hp);
    }
}
