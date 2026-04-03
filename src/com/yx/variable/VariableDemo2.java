package com.yx.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        int attack1 = 220;
        int defense1 = 85;
        double blood1 = 1012.15;
        double skill1 = 1.2;

        int arrack2 = 210;
        int defense2 = 80;
        double blood2 =1223.3;
        double skill2 =1.3;
        //我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量
        double damage1 = attack1-defense2;
        blood2 = blood2 - damage1;
        System.out.println("我攻击了对方，造成伤害："+damage1+"，对方还剩"+blood2+"血");
        //我方进行第二次技能攻击，造成多少伤害，对方还剩余多少血量
        double damage2 = attack1*skill1-defense2;
        blood2 = blood2 - damage2;
        System.out.println("我使用了技能攻击，造成伤害："+damage2+"，对方还剩"+blood2+"血");
    }
}
