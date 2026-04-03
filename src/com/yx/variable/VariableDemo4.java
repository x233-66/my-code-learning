package com.yx.variable;

public class VariableDemo4 {
    public static void main(String[] args) {
        //BMI = 体重/身高的平方
        double weight = 47.5;
        double height = 1.73;
        double bmi = weight/(height*height);
        System.out.println("我的BMI是："+bmi);

        //扩展：计算出你当前的身高，在标准BMI(18.5~23.9)下，最多是多少千克？
        double maxWeight = height*height*23.9;
        System.out.println("在标准BMI下，最多可以是"+maxWeight+"千克");
        double minWeight = height*height*18.5;
        System.out.println("在标准BMI下，最少可以"+minWeight+"千克");

        //标识符命名规则：
        //1.只能包含数字、字母、下划线、$
        //2.不能以数字开头
        //3.不能使用关键字
        //4.区分大小写
        //建议：见名知意，驼峰命名
        //小驼峰：一个单词：全部小写；多个单词：第一个单词全部小写，其他单词首字母大写
        //大驼峰：一个单词：首字母大写；多个单词：每个单词首字母大写
    }
}
