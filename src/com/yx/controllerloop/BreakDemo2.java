package com.yx.controllerloop;

import java.util.Scanner;

/*需求：初始最大生命200，受到x点伤害，技能回复y点血，x和y由键盘录入而来
 * 假设：游戏人物不会死亡，最少1点血
 * 问：最终人物血量是多少？
 *
 * 考虑：键盘录入必须大于0，否则需要重新输入*/

public class BreakDemo2 {
    public static void main(String[] args) {
        int hp = 200;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入伤害：");
        //受到的伤害不能为负数
        int hurt = 0;
        while(true) {
            hurt = sc.nextInt();
            if(hurt < 0){
                System.out.println("受到的伤害不能为负数");
            }
            else{
                break;
            }
        }

        hp = hp - hurt;
        if (hp <= 0) {
            hp = 1;
        }
        System.out.println("请输入技能回复的血量");
        //技能回复的血量不能为负数、
        int add = 0;
        while(true) {
            add = sc.nextInt();
            if(add < 0){
                System.out.println("技能回复的血量不能为负数");
            }
            else{
                break;
            }
        }

        hp = hp + add;
        if (hp > 200) {
            hp = 200;
        }
        System.out.println("当前人物的血量为" + hp);
    }
}

