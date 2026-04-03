package com.yx.looploop;

public class Test5 {
    public static void main(String[] args) {
        /*制表符：\t
        * 简单理解：长度可变的大空格，打印表格类数据的时候，可以让上下对齐
        *
        * 真正含义：
        * 在前面的字符后面补1-4个空格，让这个整体长度凑成4的整数倍 ---- idea
        * 在前面的字符后面补1-8个空格，让这个整体长度凑成8的整数倍*/

        System.out.println("姓名\t\t性别\t\t年龄");
        System.out.println("张三\t\t男\t\t\t18");
        System.out.println("李四\t\t女\t\t\t19");
    }
}
