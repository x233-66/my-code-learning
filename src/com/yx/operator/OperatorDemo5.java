package com.yx.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //字符运算：把字符转为ascll码再进行运算
        //实现字母的大小写转换，大写转小写
        char ch = 'A';
        char ch1 = (char)(ch+32);
        System.out.println(ch1);
    }
}
